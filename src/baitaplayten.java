public class baitaplayten {
    public String x = "hom nay la thu 2";

    public  String Ketqua(String a){
        //x = a;
        if(a.contains("h")){
            return "co chu h";
        }
        else {
           return "khong co chu h";
        }
    }

    public static void main(String[] args) {
        baitaplayten test = new baitaplayten();
        //String c = test.Ketqua("h");
        //test.Ketqua(5)
        System.out.println(test.Ketqua("f"));
    }
}
