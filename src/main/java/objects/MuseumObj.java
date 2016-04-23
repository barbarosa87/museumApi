package objects;

public class MuseumObj {
	
	private int id;
	private String name="";
	private String address="";
	private String latitude="";
	private String longitude="";
	private String information="";
	private String picture1="";
	private String picture2="";
	private String picture3="";
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
				  .append(" name :  ").append(this.name)
				  .append(" address :  ").append(this.address)
				  .append(" latitude : ").append(this.latitude)
				  .append(" longitude : ").append(this.longitude)
				  .append(" information : ").append(this.information)
				  .append(" picture1 : ").append(this.picture1)
				  .append(" picture2 : ").append(this.picture2)
				  .append(" picture3 : ").append(this.picture3).toString();
	}

}
