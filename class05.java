package java09;

class CCount {
	int cnt = 0;

	void count() {
		cnt++;
	}

	void setZero() {
		cnt = 0;
	}

	void setZero(int n) {
		cnt = n;
	}
	// (d)cnt類別變數
	// (e)count兩者都可

}

public class class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCount cc = new CCount();
		cc.count();
		cc.setZero();
		cc.setZero(1);
	}

}