package Class;

public class Compute {
	final float PI = 3.14f;
	//��Բ�ε����
	public float getArea(float r) {
		float area = PI*r*r;
		return area;
	}
	//����ε����
	public float getArea(float x,float y) {
		float area = x*y;
		return area;
	}
	
	public static void main(String[] args) {
		int r=2,x=5,y=6;
		Compute compute = new Compute();
		System.out.println("Բ�ε����Ϊ��"+compute.getArea(r));
		System.out.println("���ε����Ϊ��"+compute.getArea(x, y));
		
	}
}
