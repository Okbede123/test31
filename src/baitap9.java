class objtest
{
    void tong(int a, int b)
    {
        System.out.println(a+b);
    }
    void hieu(int a, long b)
    {
        System.out.println(a -b);
    }
    public static void main (String arg[])
    {
        objtest tongla = new objtest();
        tongla.tong(5,7);
        tongla.hieu(9,3);
    }
}

