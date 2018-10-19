package InnerClass;

public class OuterClass {
	private String name;
	private int age;
	innerClass in = new innerClass();

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	class innerClass {
		public innerClass() {
			name = "ÍõÎå";
			age = 22;
		}

		public void display() {
			System.out.println("name:" + getName() + " ;age:" + getAge());
		}
	}

	public static void main(String[] args) {
		OuterClass ou = new OuterClass();
		OuterClass.innerClass in = ou.new innerClass();
		in.display();
	}
}
