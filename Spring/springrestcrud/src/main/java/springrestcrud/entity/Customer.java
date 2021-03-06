package springrestcrud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer1")
public class Customer {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="id")
	private int id;

@Column(name="first_name")
private String firstname;

@Column(name="last_name")
private String lastName;

@Column(name="email")
private String email;

public Customer(int id, String firstname, String lastName, String email) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastName = lastName;
	this.email = email;
}

public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "Customer [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email + "]";
}


}
