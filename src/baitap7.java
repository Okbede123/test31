public class baitap7 {
    public static void main (String arg[]) {

        tong cong = new tong();
        cong.congg(5, 7);
        cong.congg(6,8);
    }
}

class tong{
    void congg (int a, int b)
    {
        System.out.println(a+b);
    }
}
