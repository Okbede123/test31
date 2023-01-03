class baitap13 {
    int x;
    String y;
    static String z = "okbede";

    baitap13(int a, String b)
    {
        x = a;
        y = b;
    }
    void display()
    {
        System.out.println(x + y + z);
    }
    public static void main (String arg[])
    {
        baitap13 ok = new baitap13(5, "so 6");
        baitap13 ok2 = new baitap13(65, "so 7");
        ok.display();
        ok2.display();
    }
}
