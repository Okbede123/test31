public class ifelse {
    int x;
    int y = 5;
    public String Setso(int so){
        x = so;
        if (so > y){
            System.out.println("so 1");
            return "so 1";
        }
        else {
            System.out.println("5");
            return "default";
        }
    }


    public static void main(String[] args) {
        ifelse ok = new ifelse();
        ok.Setso(5);
        String b = "so 1";
        String a = ok.Setso(9); // "so 1"
        System.out.println(ok.Setso(9));
    }
}
