package advanced;

import java.util.concurrent.ThreadLocalRandom;

public class Consumer implements Runnable{
    private final BakeryProducer producer;

    public Consumer(BakeryProducer _producer){
        this.producer = _producer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 9; i++){
            System.out.println("Bread consume # " + this.producer.consume());
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
