import java.text.Format;

class Data {
    private String name;
    private Test score;
    int eng, m;
    double eng_f,m_f;

    void per_da(String name) {
        this.name = name;
    }

    void Test(int eng, int m) {
        this.eng = eng;
        this.m = m;
        eng_f = Double.valueOf(eng);
        m_f = Double.valueOf(m);
    }

    class Test {
        double avg() {
            Double ans = (eng_f + m_f) / 2;
            return ans;
        }

        public void show() {
            System.out.printf("name:%s english:%d math%d: avg:%.1f\n", name, eng, m, avg());
        }

    }

}

public class Class02 {
    public static void main(String[] args) {
        Data da = new Data();
        da.per_da("Annie");
        da.Test(85, 92);
        Data.Test show = da.new Test();
        show.show();
        da.per_da("Brian");
        da.Test(77, 56);
        show.show();

    }
}
