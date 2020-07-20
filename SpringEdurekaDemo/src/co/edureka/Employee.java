package co.edureka;


//POJO or Model or Bean
public class Employee {
	//Attributes
	private int eid;
	private String ename;
	private int esalary;
	
	private Address address;
	
	
	//Constructor
	public Employee() {
		System.out.println("Constructor is constructed");
		// TODO Auto-generated constructor stub
	}
	
	//Constructor Injection
	public Employee(int eid, String ename, int esalary, Address address){
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.address = address;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getEsalary() {
		return esalary;
	}


	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//setter injection
	public Address getAddress() {
		return address;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address +"]";
	}


	
	
	

}
