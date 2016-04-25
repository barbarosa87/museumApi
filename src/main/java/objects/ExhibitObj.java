package objects;

import java.util.ArrayList;

public class ExhibitObj {
private int id;
private String name="";
private String information="";
private String beacon_id="";
private String beacon_minor="";
private String beacon_major="";

ArrayList<ExchibitContentObj> exhibitContent = new ArrayList<ExchibitContentObj>();

public ArrayList<ExchibitContentObj> getExhibitContent() {
	return exhibitContent;
}

public void setExhibitContent(ArrayList<ExchibitContentObj> exhibitContent) {
	this.exhibitContent = exhibitContent;
}

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

public String getInformation() {
	return information;
}

public void setInformation(String information) {
	this.information = information;
}

public String getBeacon_id() {
	return beacon_id;
}

public void setBeacon_id(String beacon_id) {
	this.beacon_id = beacon_id;
}

public String getBeacon_minor() {
	return beacon_minor;
}

public void setBeacon_minor(String beacon_minor) {
	this.beacon_minor = beacon_minor;
}

public String getBeacon_major() {
	return beacon_major;
}

public void setBeacon_major(String beacon_major) {
	this.beacon_major = beacon_major;
}

@Override
public String toString(){
	  return new StringBuffer(" id : ").append(this.id)
			  .append(" name :  ").append(this.name)
			  .append(" information :  ").append(this.information)
			  .append(" beacon_id : ").append(this.beacon_id)
			  .append(" beacon_minor : ").append(this.beacon_minor)
			  .append(" beacon_major : ").append(this.beacon_major).toString();
}

}
