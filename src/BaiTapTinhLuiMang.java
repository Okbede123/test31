public class BaiTapTinhLuiMang {

    public static void main(String[] args) {
        //int a = 4;
        int []b = {10,30,50,40,20};
        //b = new int[a];
        int c = b.length;
        int []d;
        d = new int[c];
        for(int i = 0; i < b.length; i ++){
            d[i] = b[c-1-i];
            //d[0] = b[c-1-0]
           // d[c-1] = b[i];
            //c -= 1;
        }
        for(int k = 0; k < b.length; k ++){
          System.out.println(d[k]);
        }

    }

}
