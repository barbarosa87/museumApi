package objects;

public class ExchibitContentObj {
private int id;
private String video;
private String audio;
private String picture;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getVideo() {
	return video;
}
public void setVideo(String video) {
	this.video = video;
}
public String getAudio() {
	return audio;
}
public void setAudio(String audio) {
	this.audio = audio;
}
public String getPicture() {
	return picture;
}
public void setPicture(String picture) {
	this.picture = picture;
}

@Override
public String toString(){
	  return new StringBuffer(" id : ").append(this.id)
			  .append(" video :  ").append(this.video)
			  .append(" audio :  ").append(this.audio)
			  .append(" picture : ").append(this.picture).toString();
}
}
