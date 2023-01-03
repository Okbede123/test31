

public class baitap11 {
     String ok;
    public static String WEBSITE = "gpcoder.com";

    baitap11 (String subjectt) {
        ok = subjectt;
    }

    /*void MyWebsite(String a)
    {
        System.out.println(a);
    }*/

    public void print() {
        System.out.println("Subject = " + ok);
        System.out.println("Website = " + WEBSITE);
    }

    public static void main(String[] args) {
        baitap11 ex1 = new baitap11("Core Java");
        ex1.print();
        System.out.println("----");
        baitap11 ex2 = new baitap11("Object Oriented Programing");
        ex2.print();
    }
}