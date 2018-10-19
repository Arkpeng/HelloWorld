package test1;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "mingrikejijavabu";
		String[] a = s.split("");
//		char[] a = s.toCharArray();
		int count=0;
		for(int i=0;i<s.length();i++) {
			/*if(a[i]=="i") {
				count++;
			}*/
			if(a[i].equals("i")) {
				count++;
			}
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("i出现了"+count+"次");
	}

}
