package parameter;
class Change{
	public void change(String s) {
		s = "Hello!";
	}
	public void change(int[] arr) {
		arr[0] = 5;
	}
}
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Change c = new Change();
		String s = "java";
		System.out.println("����ǰ��"+s);
		c.change(s);
		System.out.println("���ݺ�"+s);
		
		int[] arr = {1,3,7,8,9};
		System.out.println("����ǰ��"+arr[0]);
		c.change(arr);
		System.out.println("���ݺ�"+arr[0]);
	}

}
