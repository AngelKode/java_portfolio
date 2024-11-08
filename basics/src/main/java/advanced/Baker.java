package advanced;

import java.util.concurrent.ThreadLocalRandom;

public class Baker implements Runnable{

    private final BakeryProducer producer;

    public Baker(BakeryProducer _producer){
        this.producer = _producer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 9; i++){
            this.producer.produce("Bread # " + (i + 1) );
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,1500));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
