package Week5;

public class Ex84_1 {
    public static void main(String[] args) {
        Counter counter1 = new Counter(2, true);
        Counter counter2 = new Counter(8);
        Counter counter3 = new Counter(false);
        Counter counter4 = new Counter();

        counter1.increase();
        counter2.increase();
        counter4.increase();

        System.out.println(counter1.value());
        System.out.println(counter2.value());

        counter1.decrease();
        counter3.decrease();
        counter2.decrease();

        System.out.println(counter1.value());
        System.out.println(counter3.value());
        System.out.println(counter2.value());
    }
}
