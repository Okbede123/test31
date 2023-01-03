public class getbyte {
    public static void main(String[] args) {
        String sr1 = "1";
        byte[] ok = sr1.getBytes();
        for(int i = 0; i < ok.length; i++)
        {
            System.out.println(ok[i]);
        }
    }
}
