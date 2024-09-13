package poo.basics;

public class MutableStrings {
    public static void main(String[] args) {
        //Variables to test performance
        long initTime = 0L;
        long finalTime = 0L;

        //It can mutate but it's not thread safe
        StringBuffer myBuffer = new StringBuffer("Master in Java");

        initTime = System.currentTimeMillis();
        myBuffer.append(". That's it".repeat(10_000_000));
        finalTime = System.currentTimeMillis();

        System.out.println("Elapsed time with StringBuffer with 10,000 iterations: " + (finalTime - initTime));

        //It can mutate and it's thread safe
        StringBuilder myStringBuilder = new StringBuilder("Master in Java");

        //Reset performance variables
        initTime = System.currentTimeMillis();
        myStringBuilder.append(". That's it".repeat(10_000_000));
        finalTime = System.currentTimeMillis();

        System.out.println("Elapsed time with StringBuilder with 10,000 iterations: " + (finalTime - initTime));


    }
}
