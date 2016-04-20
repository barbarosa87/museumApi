package objects;

public class UserObj {
private int Id;
private String Name="";
private String Surname="";
private String Country="";
private String Address="";
private String Phone="";
private String Mobilephone="";
private String Email="";
private String Username="";
private String Password="";
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public String getMobilephone() {
	return Mobilephone;
}
public void setMobilephone(String mobilephone) {
	Mobilephone = mobilephone;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}

@Override
public String toString(){
	  return new StringBuffer(" Id : ").append(this.Id)
			  .append(" Name :  ").append(this.Name)
			  .append(" Surname : ").append(this.Surname)
			  .append(" Country : ").append(this.Country)
			  .append(" Address : ").append(this.Address)
			  .append(" Phone : ").append(this.Phone)
			  .append(" Mobilephone : ").append(this.Mobilephone)
			  .append(" Email : ").append(this.Email)
			  .append(" Username : ").append(this.Username)
			  .append(" Password : ").append(this.Password).toString();
}
}
