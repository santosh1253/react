package entity;

import java.util.List;

public class Student {
	private String name;
    private int id;
    private List<Address> address;
	public String getName() {
		return name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
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
	public Student(int id,String name) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Student(String name, int id, List<Address> address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
   
}
