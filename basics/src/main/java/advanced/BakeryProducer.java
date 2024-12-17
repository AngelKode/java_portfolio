package advanced;

public class BakeryProducer {
    private String bread;
    private boolean isAvailable;

    public BakeryProducer(){
        this.bread = "";
        this.isAvailable = false;
    }
    public synchronized void produce(String breadToProduce){
        while (isAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        this.bread = breadToProduce;
        System.out.println("Baking bread...");
        this.isAvailable = true;
        notify();
    }

    public synchronized String consume(){
        while (!isAvailable){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Client takes bread...");
        this.isAvailable = false;
        notify();
        return this.bread;
    }
}
