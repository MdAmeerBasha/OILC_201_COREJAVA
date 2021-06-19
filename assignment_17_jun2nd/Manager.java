package assignment_17_jun2nd;

enum ManagerType {
	HR, SALES
}

public class Manager extends Employees {
	ManagerType type;

	public Manager() {
		super();

	}

	public Manager(String name, int id, double salary, ManagerType type) {
		super(name, id, salary);
		this.type = type;
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}

	String setSalary() {
		String res = "";
		switch (type) {
		case HR:
			res = " "+(salary + 10000);
			break;
		case SALES:
			res = " "+(salary + 5000);
			break;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Manager [type=" + type + ", name=" + name + ", id=" + id + ", salary=" + setSalary() + "]";
	}

}
