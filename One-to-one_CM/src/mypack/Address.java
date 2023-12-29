package mypack;
public class Address {
	private int aid;
	private String city,state,country;
	private Employee emp;
	
	public String getCity() {
	return city;
	}
	public void setCity(String city) {
	this.city = city;
	}
	public String getState() {
	return state;
	}
	public void setState(String state) {
	this.state = state;
	}
	public String getCountry() {
	return country;
	}
	public void setCountry(String country) {
	this.country = country;
	}
	public Employee getEmp() {
	return emp;
	}
	public void setEmp(Employee emp) {
	this.emp = emp;
	}
	public int getAid() {
	return aid;
	}
	public void setAid(int aid) {
	this.aid = aid;
	}
}