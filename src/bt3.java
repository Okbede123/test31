public class bt3 {

    int chieudai;
    int chieurong;

    void dientich(int a, int b)
    {
        chieudai = a;
        chieurong = b;
    }

    void inra()
    {
        System.out.println(chieudai * chieurong);
    }
    public static void main (String test[])
    {
        bt3 t1 = new bt3();
        t1.dientich(5,7);
        t1.inra();
    }
}
