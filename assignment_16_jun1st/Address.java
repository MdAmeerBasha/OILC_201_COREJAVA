package assignment_16_jun1st;

public class Address {
	private String hNo;
	private String colonyName;
	private String cityName;
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", colonyName=" + colonyName + ", cityName=" + cityName + "]";
	}
	public Address(String hNo, String colonyName, String cityName) {
		this.hNo = hNo;
		this.colonyName = colonyName;
		this.cityName = cityName;
	}
	
	
	

}
