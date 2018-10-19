package Throwables;

public class Test1 {
	private int num = 0;
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	public Test1() {
		try {
			Class.forName("Throwables.test");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("≤‚ ‘");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1();
		t1.setNum(888);
		System.out.println(t1.getNum());
	}

}
