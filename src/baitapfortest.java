import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Random;
import java.util.Scanner;

public class baitapfortest {
    public static void main(String[] args) {
            int a = 9;
            int []x;
            int max = 0;
            x = new int[a];
            int sum = 0;
            x[0] = max;
            for(int i = 0; i < a;i++){
                Random rand = new Random();
                int random = rand.nextInt(15);

                x[i] = random;
                sum += random;

            }
        System.out.println(sum);
    }
}
