package advanced;

public class main_advanced {
    public static void main(String[] args) {
        BakeryProducer newProducer = new BakeryProducer();

        Thread threadBaker = new Thread(new Baker(newProducer));
        Thread threadConsumer = new Thread(new Consumer(newProducer));

        threadBaker.start();
        threadConsumer.start();
    }
}
