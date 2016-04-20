package museumApiWebApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import objects.UserObj;


@Path("/signUp")
public class SignUp {
	
	@POST
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	 public UserObj signup(@FormParam("Name") String Name,
			 @FormParam("Surname") String Surname,
			 @FormParam("Country") String Country,
			 @FormParam("Address") String Address,
			 @FormParam("Phone") String Phone,
			 @FormParam("Mobilephone") String Mobilephone,
			 @FormParam("Email") String Email,
			 @FormParam("Username") String Username,
			 @FormParam("Password") String Password){
		   
		  		  
		  UserObj user=new UserObj();
		  try{
		    
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://museum.ddns.net:3306/mydb","remote","121314");
		   PreparedStatement statement =  con.prepareStatement("INSERT INTO user (name, surname, country, address, phone, mobile_phone, email, username, password)"
		   		+ " VALUES (?, ?, ?, ?, ?, ?, ?, ?,?)");
		   statement.setString(1, Name);
		   statement.setString(2,Surname);
		   statement.setString(3, Country);
		   statement.setString(4, Address);
		   statement.setString(5, Phone);
		   statement.setString(6, Mobilephone);
		   statement.setString(7, Email);
		   statement.setString(8, Username);
		   statement.setString(9, Password);
		   
		   int status = statement.executeUpdate();
		   if(status>0){
		   statement =  con.prepareStatement("SELECT * FROM user");
		   ResultSet result = statement.executeQuery();
		    
		   while(result.next()){
			   user.setId(result.getInt("id"));
			   user.setName(result.getString("name"));
			   user.setSurname(result.getString("surname"));
			   user.setCountry(result.getString("country"));
			   user.setAddress(result.getString("address"));
			   user.setPhone(result.getString("phone"));
			   user.setMobilephone(result.getString("mobile_phone"));
			   user.setEmail(result.getString("email"));
			   user.setUsername(result.getString("username"));
			   user.setPassword(result.getString("password"));
			   
			   
			   
			   
		   }
		   }
		
		  }
		  catch(Exception e){
		   e.printStackTrace();
		   return user;
		  }
		  
		  return user;
		  
		 }

}
