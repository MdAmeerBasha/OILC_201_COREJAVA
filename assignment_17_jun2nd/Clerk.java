package assignment_17_jun2nd;

class Clerk extends Employees {
	int speed;
	int accuracy;

	public Clerk() {
		super();

	}

	public Clerk(String name, int id, double salary, int speed, int accuracy) {
		super(name, id, salary);
		this.speed = speed;
		this.accuracy = accuracy;

	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	double setSalary() {
		double res = 0;
		if (speed > 70 && accuracy > 80) {
			res = salary + 1000;
		} else {
			res = salary;
		}
		return res;
	}

	@Override
	public String toString() {
		return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", name=" + name + ", id=" + id + ", salary="
				+ setSalary() + "]";
	}

}
