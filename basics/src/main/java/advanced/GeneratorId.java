package advanced;

import java.util.ArrayList;

public class GeneratorId implements Runnable{

    private static ArrayList<String> idList;
    GeneratorId(){
        idList = new ArrayList<>();
    }
    @Override
    public void run(){
        getNewID();
    }

    public synchronized static void getNewID(){
        String newId = "";
        do{
            newId = String.valueOf(Math.round( Math.random() * 1000000000 ) ) + "id";
            System.out.println("Nuevo id generado: " + newId + " from " + Thread.currentThread().getName());
            idList.add(newId);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } while(!idList.contains(newId));
    }
}
