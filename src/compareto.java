public class compareto {
    public static void main(String args[]) {
        StringBuffer s3 = new StringBuffer("okbede");
        char[] Str1 = {'H','e','l','l','o','w','o'};
        String Str2 = "";
        String str3 = "vietnam";
        String str4 = "ha noi";
        Str2 = Str2.copyValueOf(Str1,2,5);
      //  System.out.println("ok".concat("bede"));
      // System.out.println("okbede".contentEquals(s3));
        System.out.println(str3.endsWith("m"));
        System.out.println(str3.equals(str4));
       // System.out.println(Str2);
    }
}
