package counter;

public class TestCounter {
    public static void main(String[] args) {
        Counter counter = new Counter(12);


        counter.add();
        System.out.println(counter.get());

        counter.reset();
        System.out.println(counter.get());

    }
}
