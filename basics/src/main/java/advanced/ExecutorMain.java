package advanced;

import java.util.ArrayList;
import java.util.concurrent.*;

public class ExecutorMain {
    public static void main(String[] args) {

        Future<ArrayList<String>> queryResult;
        Future<ArrayList<String>> queryResultSecond;
        Future<ArrayList<String>> queryResultNew;

        try (ExecutorService threadExecutor = Executors.newFixedThreadPool(2)) {

            Callable<ArrayList<String>> callableTask = () -> {
                System.out.println("Searching clients...");
                ArrayList<String> clients = new ArrayList<>(5);
                clients.add("Juan");
                clients.add("Juan1");
                clients.add("Juan2");
                clients.add("Juan3");
                clients.add("Juan4");
                TimeUnit.SECONDS.sleep(3);

                return clients;
            };

            Callable<ArrayList<String>> callableTask2 = () -> {
                System.out.println("Searching clients...");
                ArrayList<String> clients = new ArrayList<>(5);
                clients.add("Juan4");
                clients.add("Juan3");
                clients.add("Juan2");
                clients.add("Juan1");
                clients.add("Juan");
                TimeUnit.SECONDS.sleep(2);

                return clients;
            };

            queryResult = threadExecutor.submit(callableTask);
            queryResultSecond = threadExecutor.submit(callableTask);
            queryResultNew = threadExecutor.submit(callableTask2);

            threadExecutor.shutdown();

            while (!(queryResult.isDone() && queryResultSecond.isDone() && queryResultNew.isDone())){
                System.out.println(
                        String.format("Thread Status:\n queryResult: %s\n queryResultSecond : %s \n queryResultNew: %s",
                                queryResult.state().toString(),
                                queryResultSecond.state().toString(),
                                queryResultNew.state().toString()
                ));
                TimeUnit.MILLISECONDS.sleep(1500);
            }

            //Print results
            System.out.println("Clients for thread 1: ");
            for(String client : queryResult.get(5,TimeUnit.SECONDS)){
                System.out.print(client + ",");
            }

            System.out.println("\nClients for thread 2: ");
            for(String client : queryResultSecond.get(5,TimeUnit.SECONDS)){
                System.out.print(client + ",");
            }

            System.out.println("\nClients for thread 3: ");
            for(String client : queryResultNew.get(5,TimeUnit.SECONDS)){
                System.out.print(client + ",");
            }
        }catch(InterruptedException | ExecutionException | TimeoutException e){
            Thread.currentThread().interrupt();
        }
    }
}
