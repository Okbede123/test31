public class bt4 {

    void nhanvao(int n)
    {
        int fact;
        fact = 1;
        for(int i = 1; i <= n; i++)
        {
            fact = fact* i;
        }
        System.out.println(fact);
    }
    public static void main (String test[])
    {
        bt4 tester = new bt4();
        tester.nhanvao(444);

    }
}

