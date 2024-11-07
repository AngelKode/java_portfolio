package advanced;

public class main_advanced {
    public static void main(String[] args) {
        try {
            Thread firstThread = new Thread(new GeneratorId(),"First Thread");
            Thread secondThread = new Thread(new GeneratorId(),"Second Thread");
            firstThread.start();
            secondThread.start();
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
