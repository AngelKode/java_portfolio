package poo.basics;

public class ValueParameters {
    public static void main(String[] args) {

        //By value
        int initialValueVariable = 100;
        System.out.println("Before changing passing by value function: " + initialValueVariable);
        passingByValue(initialValueVariable);
        System.out.println("After changing passing by value function : " + initialValueVariable);

        //By reference
        StringBuffer myString = new StringBuffer();
        System.out.println("Before changing passing by reference function: " + myString);
        passingByReference(myString);
        System.out.println("After changing passing by reference function : " + myString);
    }

    public static void passingByValue(int myInteger){
        myInteger = 0;
    }

    public static void passingByReference(StringBuffer str){
        str.append(" nuevo");
    }
}
