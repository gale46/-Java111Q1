class Data {
	private String name;
	private Test score;
	int eng, m;

	void Test(int eng, int m) {
		this.eng = eng;
		this.m = m;
	}

	class Test {
		double avg() {
			return (eng + m) / 2;
		}

		
	}
	public void show() {
		System.out.println(eng + m + avg());
	}

}

public class Class02 {
	public static void main(String[] args) {
		Data da = new Data();
		da.Test(60, 70);
		
		
		
	}
}
