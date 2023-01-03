public class bt1 {

    public static void main (String test[])
    {

        MayTinh2 tester = new MayTinh2("dasd", "dasaaaa");
        tester.tinhtong(5,8);
    }


}

class MayTinh2 {

    String ten;
    String moden;

    MayTinh2(String a, String b)
    {
        ten = a;
        moden = b;
    }
    public void tinhtong(int a,int b)
    {
        int tong = b - a;
        System.out.println(tong);
    }
}