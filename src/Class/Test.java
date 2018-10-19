package Class;

class Test implements Calculate{
	float r;
	public float getArea() {
		float area = PI*r*r;
		return area;
	}

	public float getCircumference() {
		float circumference = 2*PI*r;
		return circumference;
	}
	public Test(float r) {
		this.r = r;
	}
	
	public Test() {
	}
	
	/**
	 * @return the r
	 */
	public float getR() {
		return r;
	}

	/**
	 * @param r the r to set
	 */
	public void setR(float r) {
		this.r = r;
	}

	public static void main(String[] args) {
		Test a = new Test(3);
		float x = a.getArea();
		float y = a.getCircumference();
		System.out.println(x);
		System.out.println(y);
	}

	@Override
	public float getArea(float r) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float getCircumference(float r) {
		// TODO Auto-generated method stub
		return 0;
	}
}