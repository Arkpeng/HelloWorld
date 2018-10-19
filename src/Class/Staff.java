package Class;

import java.util.Date;

public class Staff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("张三",8000,new Date());
		Manager manager = new Manager();
		manager.setName("李四");
		manager.setSalary(20000);
		manager.setBirthday(new Date());
		manager.setBonus(5000);
		System.out.println(employee.getInfo());
		manager.getInfo();
	}

}
