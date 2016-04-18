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
import javax.ws.rs.core.Response;

import org.json.JSONObject;

@Path("/login")
public class Login {
	
	 @POST
	 @Produces(MediaType.APPLICATION_JSON)
	 @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	 public Response authentication(@FormParam("userName") String userName,@FormParam("password") String password){
		   
		  String retrievedUserName = "";
		  String retrievedPassword = "";
		  String status = "";
		  String jsonResponse="";		  

		  try{
		    
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://museum.ddns.net:3306/mydb","remote","121314");
		   PreparedStatement statement =  con.prepareStatement("SELECT * FROM user WHERE username = '"+userName+"'");
		   ResultSet result = statement.executeQuery();
		    
		   while(result.next()){
		    retrievedUserName = result.getString("username");
		    retrievedPassword = result.getString("password");
		    }
		    
		   if(retrievedUserName.equals(userName)&&retrievedPassword.equals(password)){
		    status = "Success!";
		   }
		    
		   else{
		    status = "Login fail!!!";
		   }
		   
		   JSONObject jsonObject = new JSONObject();
		   jsonObject.put("status", status);
		   jsonResponse = "@Produces(\"application/json\")" + jsonObject;
		  }
		  catch(Exception e){
		   e.printStackTrace();
		   return Response.serverError().build();
		  }
		  //Response response=Response.status(Response.Status.ACCEPTED).entity(jsonResponse).build();
		 // System.out.println(response.getEntity().toString());
		  return Response.ok(jsonResponse,MediaType.APPLICATION_JSON).build();
		  //return Response.created(location)
		  
		 }
}
