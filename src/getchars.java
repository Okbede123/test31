public class getchars {
    public static void main(String[] args) {
        String str1 = ( "chao mung viet nam dat nuoc tuyet voi");
        char[] str2 = new char[9];

        try{
            str1.getChars(9,16,str2,0);
            System.out.println("gia tri duoc sao chep la = ");
            System.out.println(str2);
        } catch(Exception ex){
            System.out.println("ex la");
        }
    }
}
