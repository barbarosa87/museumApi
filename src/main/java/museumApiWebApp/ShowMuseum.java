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

import com.google.gson.Gson;

import objects.ExchibitContentObj;
import objects.ExhibitObj;
import objects.MuseumObj;

@Path("/museums")
public class ShowMuseum {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getMuseums() {
		ArrayList<MuseumObj> museumsList = new ArrayList<MuseumObj>();
		Gson gson = new Gson();
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

				PreparedStatement statement2 = con.prepareStatement("SELECT * FROM exhibit WHERE id=?");
				statement2.setString(1, String.valueOf(museum.getId()));
				ResultSet result2 = statement2.executeQuery();
				
				ArrayList<ExhibitObj> exhibitList=new ArrayList<ExhibitObj>();
				while (result2.next()) {
					ExhibitObj exhibit = new ExhibitObj();

					exhibit.setId(result2.getInt("id"));
					exhibit.setName(result2.getString("name"));
					exhibit.setInformation(result2.getString("information"));
					exhibit.setBeacon_id(result2.getString("beacon_id"));
					exhibit.setBeacon_minor(result2.getString("beacon_minor"));
					exhibit.setBeacon_major(result2.getString("beacon_major"));
					
					PreparedStatement statement3 = con.prepareStatement("SELECT * FROM exhibit_content WHERE id=?");
					statement3.setString(1, String.valueOf(exhibit.getId()));
					ResultSet result3 = statement3.executeQuery();
					
					ArrayList<ExchibitContentObj> exhibitContentList = new ArrayList<ExchibitContentObj>();
					
					while (result3.next()) {
						ExchibitContentObj exchibitContentObj = new ExchibitContentObj();
						
						exchibitContentObj.setId(result3.getInt("id"));
						exchibitContentObj.setVideo(result3.getString("video_path"));
						exchibitContentObj.setAudio(result3.getString("audio_path"));
						exchibitContentObj.setPicture(result3.getString("picture_path"));
						
						exhibitContentList.add(exchibitContentObj);
					}
					exhibit.setExhibitContent(exhibitContentList);
					exhibitList.add(exhibit);
					
				}
				museum.setExhibits(exhibitList);
				museumsList.add(museum);
			}

			//return museumsList;
			return gson.toJson(museumsList);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}

	}

}
