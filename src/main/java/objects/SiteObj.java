package objects;

import java.util.ArrayList;

public class SiteObj {
	
	private int id;
	private String type="";
	private String name="";
	private String beacon_enabled="0";
	private String address="";
	private String latitude="";
	private String longitude="";
	private String information="";
	private String picture1="";
	private String picture2="";
	private String picture3="";
	
	ArrayList<ExhibitObj> exhibits = new ArrayList<ExhibitObj>();
	
	
	
	
	public ArrayList<ExhibitObj> getExhibits() {
		return exhibits;
	}
	public void setExhibits(ArrayList<ExhibitObj> exhibits) {
		this.exhibits = exhibits;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBeacon_enabled() {
		return beacon_enabled;
	}
	public void setBeacon_enabled(String beacon_enabled) {
		this.beacon_enabled = beacon_enabled;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getPicture1() {
		return picture1;
	}
	public void setPicture1(String picture1) {
		this.picture1 = picture1;
	}
	public String getPicture2() {
		return picture2;
	}
	public void setPicture2(String picture2) {
		this.picture2 = picture2;
	}
	public String getPicture3() {
		return picture3;
	}
	public void setPicture3(String picture3) {
		this.picture3 = picture3;
	}
	
	@Override
	public String toString(){
		  return new StringBuffer(" id : ").append(this.id)
				  .append(" type :  ").append(this.type)
				  .append(" name :  ").append(this.name)
				  .append(" address :  ").append(this.address)
				  .append(" beacon_enabled : ").append(this.beacon_enabled)
				  .append(" latitude : ").append(this.latitude)
				  .append(" longitude : ").append(this.longitude)
				  .append(" information : ").append(this.information)
				  .append(" picture1 : ").append(this.picture1)
				  .append(" picture2 : ").append(this.picture2)
				  .append(" picture3 : ").append(this.picture3).toString();
	}

}
