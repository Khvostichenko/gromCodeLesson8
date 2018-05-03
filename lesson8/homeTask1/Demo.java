package lesson8.homeTask1;

public class Demo {
    public static void main(String[] args) {

        int[] array = {100,154,2,-54,153,0};
        int a = 9, b = 8;

        Adder ad = new Adder();

        System.out.println(ad.check(array));
        System.out.println(ad.add(a,b));
    }
}
