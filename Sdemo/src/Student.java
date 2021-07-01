import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
private String name;
private int id;
private String address;
private Set<String> courses;
private List<String> phones;
private Map<String,String> marks;
public Set<String> getCourses() {
	return courses;
}
public void setCourses(Set<String> courses) {
	this.courses = courses;
}
public List<String> getPhones() {
	return phones;
}
public void setPhones(List<String> phones) {
	this.phones = phones;
}
public Map<String, String> getMarks() {
	return marks;
}
public void setMarks(Map<String, String> marks) {
	this.marks = marks;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

public Student(String name, int id, String address, Set<String> courses, List<String> phones,
		Map<String, String> marks) {
	super();
	this.name = name;
	this.id = id;
	this.address = address;
	this.courses = courses;
	this.phones = phones;
	this.marks = marks;
	System.out.println("constructer executed");
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Student [name=" + name + ", id=" + id + ", address=" + address + ", courses=" + courses + ", phones="
			+ phones + ", marks=" + marks + "]";
}

}
