package model;

public class Test {
private String email;
private String username;
private String password;
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Test(String email, String username, String password) {
	super();
	this.email = email;
	this.username = username;
	this.password = password;
}
public Test() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Test [email=" + email + ", username=" + username + ", password=" + password + "]";
}

}
