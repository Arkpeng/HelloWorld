package Class;

public class Compute {
	final float PI = 3.14f;
	//求圆形的面积
	public float getArea(float r) {
		float area = PI*r*r;
		return area;
	}
	//求矩形的面积
	public float getArea(float x,float y) {
		float area = x*y;
		return area;
	}
	
	public static void main(String[] args) {
		int r=2,x=5,y=6;
		Compute compute = new Compute();
		System.out.println("圆形的面积为："+compute.getArea(r));
		System.out.println("矩形的面积为："+compute.getArea(x, y));
		
	}
}
