package museumApiWebApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import objects.MuseumObj;

@Path("/museums")
public class ShowMuseum {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<MuseumObj> getMuseums() {
		ArrayList<MuseumObj> museumsList = new ArrayList<MuseumObj>();

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://museum.ddns.net:3306/mydb", "remote", "121314");
			PreparedStatement statement = con.prepareStatement("SELECT * FROM museum");
			ResultSet result = statement.executeQuery();

			while (result.next()) {

				MuseumObj museum = new MuseumObj();

				museum.setId(result.getInt("id"));
				museum.setName(result.getString("name"));
				museum.setAddress(result.getString("address"));
				museum.setLatitude(result.getString("latitude"));
				museum.setLongitude(result.getString("longitude"));
				museum.setInformation(result.getString("information"));
				museum.setPicture1(result.getString("picture1"));
				museum.setPicture2(result.getString("picture2"));
				museum.setPicture3(result.getString("picture3"));

				museumsList.add(museum);
			}

			return museumsList;
		} catch (Exception e) {
			e.printStackTrace();
			return museumsList;
		}

	}

}
