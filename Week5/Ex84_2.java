package Week5;

public class Ex84_2 {
    public static void main(String[] args) {
        Counter counter1 = new Counter(8, true);
        Counter counter3 = new Counter(2, true);
        Counter counter2 = new Counter(8);

        counter2.increase(5);

        System.out.println(counter2.value());

        counter1.decrease(5);
        counter3.decrease(3);

        System.out.println(counter1.value());
        System.out.println(counter3.value());
    }
}
