package Class;

import java.util.Date;

public class Employee {
	private String name;
	private double salary;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Employee(){
		
	}
	public Employee(String name,double salary,Date birthday) {
		this.name = name;
		this.salary = salary;
		this.birthday = birthday;
	}
	public String getInfo() {
		return "父类：我是员工";
	}
}
