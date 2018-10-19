package test1;

public class stringTest {
	public static void main(String[] args) {
		String s1 = "good";
		StringBuilder s2 = new StringBuilder("student");
		StringBuilder builder = new StringBuilder();
		builder.append(s1);
		builder.append(s2);
		System.out.println(builder);
		
		String a = "goden";
		String b = "l";
		StringBuilder builder2 = new StringBuilder();
		builder2.append(a);
		builder2.insert(2, b);  //向索引值为2处添加字符
		System.out.println(builder2);
		builder2.delete(2, 4);
		System.out.println(builder2);
		
	}
}
