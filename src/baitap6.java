import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class baitap6 {

    public static void main(String args[]) {
        // Goi phuong thuc voi bien args
        printMax(34, 3, 13, 2, 56.5f, 43);
        //printMax(new float[]{1, 2, 3})
        printMax(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
    }

    public static void printMax(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            System.out.println("Khong co tham so nao duoc truyen");
            return;
        }

        if(numbers.size() >= 2){
            System.out.println("ok");
        }
        float result = numbers.get(0);
        for(int i = 0; i < numbers.size() ; i++) {



            if ( i == 3)
            {
                System.out.println("test1");
                //continue;
            }
            System.out.println("c");
        }

        if (numbers.contains(3)) {
            System.out.println("tét");
        }

       // for (int i = 0; i <= numbers.size() - 1; i++)
           // if (numbers.get(i) >  result)
               // result = numbers.get(i);
        //System.out.println("Gia tri max la " + result);
    }

    int x = 6;

    void abc() {
        x = 6;
    }


    public static void printMax( float... numbers) {
        if (numbers.length == 0) {
            System.out.println("Khong co tham so nao duoc truyen");
            return;
        }

        float result = numbers[0];

        for (int i = 0; i <= numbers.length - 1; i++) {
           // if (numbers[i] > result)
              //  result = numbers[i];
            //System.out.println("Gia tri max la " + result);

            // it nhat 2 phan tu
            // ton tai so 3.0

        }
       // if (numbers.length >= 2) {
     //       System.out.println("ok");
      //  }

    }
}