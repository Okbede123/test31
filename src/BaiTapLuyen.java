import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.*;

public class BaiTapLuyen {

    public static void main(String[] args) {

        BaiTapLuyen so1 = new BaiTapLuyen();

        //int [] mang = new int[6];
       // so1.result(mang);
        ArrayList test = new ArrayList<>();
        test.add(5);
        test.add(4);
        so1.result(test);


    }

    public void result(ArrayList  test){

        //test.add(4);
       //test.add(6);


        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));

        }

    }

}


