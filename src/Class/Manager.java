package Class;

public class Manager extends Employee{
	private double bonus;
	public double getbonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	/*public String getInfo() {
		return "子类：我是经理";
	}*/
	public String getInfo() {
		return "子类：我是经理";
	}
}
