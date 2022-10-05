class Cal_area{
	int r,h,w,l;
	void cr(int r) {
		System.out.printf("球體體積=%.1f\n", Math.PI*Math.pow(r, 3)*4/3);
	}
	void ar(int l,int w ,int h) {
		System.out.println("立方體表面積="+(l*w+l*h+w*h)*2);
	}
}
public class Class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal_area ca = new Cal_area();
		ca.cr(10);
		ca.ar(4, 5, 6);

	}

}
