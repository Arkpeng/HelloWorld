package test1;

public class SBDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="������ͬ����--�����ഺ���ۣ�Ʈҡ�ģ����۵ģ��ȹ���ʱ��ĺ���";
		StringBuilder builder = new StringBuilder(s);
		System.out.println("ԭ�����ַ���Ϊ��"+builder);
		System.out.println("ԭ�����ַ�����Ϊ��"+builder.length());
		for(int i=0;i<builder.length();i++) {
			for(int j=i+1;j<builder.length();j++) {
				if(builder.charAt(i)==builder.charAt(j)) {
					builder.deleteCharAt(j);
				}
			}
		}
		System.out.println("���ڵ��ַ���Ϊ��"+builder);
		System.out.println("���ڵ��ַ�������Ϊ��"+builder.length());		
	}

}
