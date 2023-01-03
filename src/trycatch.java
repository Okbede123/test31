public class trycatch {
    public static void main(String[] args) {
        try {
            int arr[] = {5, 7};
            arr[5] = 6;
            System.out.println("arr =" + arr[5]);

        } catch (Exception test) {
            System.out.println(test);

        }
    }
}
