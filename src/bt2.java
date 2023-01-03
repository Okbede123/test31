public class bt2 {

    int a ;
    String b;

    bt2(int x, String y){
    a = x;
    b = y;
    }
    void display()
    {
        System.out.println(a + b);
    }

    public static void main (String test[])
    {
        bt2 tester = new bt2(12, "ok");
        tester.display();
    }

}
