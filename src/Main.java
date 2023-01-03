public class Main {
    public static void main(String[] args) {

        int x = 55;
        int y = 64;
        MayTinh test = new MayTinh("mt1", "aa");
        test.tinhTong(x,y);



    }
}
class MayTinh {
    String name;
    String model;

    MayTinh(String name, String model) {
        this.name = name;
        this.model = model;
    }

    public void tinhTong(int a, int b) {
        int tong = a + b;
        System.out.println(tong);

    }
}
