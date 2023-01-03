import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class contractor2 {
    int tuoi;
    String ten;
    contractor2(int a, String b)
    {
       tuoi = a;
       ten = b;
    }
    void display()
    {
        System.out.println(tuoi + ten);
    }
    public static void main (String arg[])
    {
        contractor2 okbede = new contractor2(5, "okok");
        contractor2 okbede2 = new contractor2(8, "okok1");
        okbede.display();
    }
}
