package lambda_functions;

import lambda_functions.models.User;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerEx {
    public static void main(String[] args) {

        Consumer<String> con = System.out::println;
        //con.accept("Hello");

        BiConsumer<String, Date> consumerBi = (name, date) -> {
            System.out.printf("My name is %s, and I was born at %s%n", name, date);
        };
        //consumerBi.accept("John Doe", new Date());

        //Example combining consumer classes with other classes
        Consumer<String> clientPrinting = client -> {
            System.out.printf("I'm client %s, nice to meet you\n",client);
        };
        //List<String> clients = Arrays.asList("John","Monica");

        //clients.forEach(clientPrinting);


        //-----------------------------------------------------------

        Supplier<User> createUser = User::new;
        User user1 = createUser.get();

        BiConsumer<User, String> assignName = User::setName;

        assignName.accept(user1, "Juan");

        System.out.println(user1.getName());
    }
}
