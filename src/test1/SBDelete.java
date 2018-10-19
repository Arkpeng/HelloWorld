package test1;

public class SBDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="命运如同海风--吹着青春的舟，飘摇的，曲折的，度过了时间的海！";
		StringBuilder builder = new StringBuilder(s);
		System.out.println("原来的字符串为："+builder);
		System.out.println("原来的字符长度为："+builder.length());
		for(int i=0;i<builder.length();i++) {
			for(int j=i+1;j<builder.length();j++) {
				if(builder.charAt(i)==builder.charAt(j)) {
					builder.deleteCharAt(j);
				}
			}
		}
		System.out.println("现在的字符串为："+builder);
		System.out.println("现在的字符串长度为："+builder.length());		
	}

}
