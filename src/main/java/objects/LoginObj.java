package objects;


public class LoginObj {

	private String status;

	public LoginObj(){
		
	}
	
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

@Override
public String toString(){
	  return new StringBuffer(" status : ").append(this.status).toString();

}
}
