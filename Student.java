package FileInputStudentList;

public class Student {

	private String name;
	private String phone;
	private String rollNo;
	private String address;
	public Student(String name, String phone, String rollNo, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.rollNo = rollNo;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
