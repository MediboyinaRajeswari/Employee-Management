package webEmp;



import org.springframework.stereotype.Component;

@Component
public class Employee {
 private int id;
String name;
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
public String getBand() {
	return band;
}
public void setBand(String band) {
	this.band = band;
}
String band;

}
