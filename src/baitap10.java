import com.sun.org.apache.xpath.internal.objects.XString;

public class baitap10 {
    int a;
    String name;
    static String tt = "ok";
    baitap10(int x, String y)
    {
        a = x;
        name = y;
    }
    void display()
    {
        System.out.println(a + name + tt);
    }
    public static void main (String arg[])
    {
        baitap10 okok = new baitap10(5 , "dsd");
        okok.display();
    }
}
