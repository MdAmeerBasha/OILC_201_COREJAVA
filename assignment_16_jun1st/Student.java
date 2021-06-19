	package assignment_16_jun1st;

public class Student {
	private int sId;
	private String sName;
	private Address address;

	public Student(int sId, String sName, Address address) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", address=" + address + "]";
	}

}
