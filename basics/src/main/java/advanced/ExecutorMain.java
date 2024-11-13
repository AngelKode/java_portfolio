package advanced;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ExecutorMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService threadExecutor = Executors.newSingleThreadExecutor();

        //Task to be executed
        //Runnable dont return value
        /*
        Runnable myThread = () -> {
            System.out.println("Consulting DB from " + Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(6);
            } catch (InterruptedException e) {
                //If something happens
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
            System.out.println("Consulting ending from " + Thread.currentThread().getName());
        };

        Future<?> executorResult = threadExecutor.submit(myThread);
        threadExecutor.shutdown();
        System.out.println(executorResult.get(10,TimeUnit.SECONDS));
        System.out.println(executorResult.isDone());
*/
        //Task to be executed
        //Callable return value

        Callable<ArrayList<String>> callableTask = () -> {
            System.out.println("Searching clients...");
            ArrayList<String> clients = new ArrayList<>(5);
            clients.add("Juan");
            clients.add("Juan1");
            clients.add("Juan2");
            clients.add("Juan3");
            clients.add("Juan4");
            TimeUnit.SECONDS.sleep(5);

            return clients;
        };

        Future<ArrayList<String>> queryResult = threadExecutor.submit(callableTask);
        threadExecutor.shutdown();
        for (String client : queryResult.get(10,TimeUnit.SECONDS)) {
            System.out.println("Client " + client);
        }


    }
}
