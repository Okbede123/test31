public class Exercise5 {
   // int dai;
    //int rong;

   /* public static void khaibao(int x,int y)
    {
        x = 5;
        y = 7;
        int tong = x + y;
        System.out.println(tong);
    }
*/
    int sum(int x, int y) {
       return x + y;
    }

  /*  void blahblah() {
        System.out.println(sum(2, 3));
        System.out.println(sum(4, 5));
        int z = sum(2, 4);
        int a = z + sum(6, 7);
        System.out.println(a);
    }*/

    public static void main(String[] args) {
        Exercise5 bt5 = new Exercise5();
        System.out.println(bt5.sum(2,4));

        Person person = new Person();
        Person person2 = new Person("thanh", "26");
        System.out.println(person.name);
        System.out.println(person2.name);
    }
}

class Person {
    String name;
    String age;

    Person() {
        name = "abc";
        age = "20";
    }

    Person(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
