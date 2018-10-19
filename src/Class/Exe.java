package Class;

public class Exe {
	private String name;

	public Exe(String name) {
		this.name = name;
	}

	public Exe() {
	}
	
	public String getName() {
		return name;
	}
	public void setNmae(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Exe a = new Exe();
		a.setNmae("—Ó”¿–≈");
		System.out.println(a.name);
	}
}
