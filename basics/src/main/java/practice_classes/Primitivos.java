package practice_classes;

public class Primitivos{
    public static void main(String[] args) {
        byte myByte = 127;
        System.out.println("Mi byte = " + myByte);
        System.out.println("CANTIDAD BYTES = " + Byte.BYTES);
        System.out.println("CANTIDAD Bites = " + Byte.SIZE);
        System.out.println("Maximo de un BYTE = " + Byte.MAX_VALUE);
        System.out.println("Mínimo de un BYTE = " + Byte.MIN_VALUE);

        short myShort = 30000;
        System.out.println("\nMi short = " + myShort);
        System.out.println("CANTIDAD BYTES = " + Short.BYTES);
        System.out.println("CANTIDAD Bites = " + Short.SIZE);
        System.out.println("Maximo de un short = " + Short.MAX_VALUE);
        System.out.println("Mínimo de un short = " + Short.MIN_VALUE);

        int numeroInt = 234333433;
        System.out.println("\nMi int = " + numeroInt);
        System.out.println("CANTIDAD BYTES integer= " + Integer.BYTES);
        System.out.println("CANTIDAD Bites integer= " + Integer.SIZE);
        System.out.println("Maximo de un integer = " + Integer.MAX_VALUE);
        System.out.println("Mínimo de un integer = " + Integer.MIN_VALUE);

        long numeroLong = 2147483648L;
        System.out.println("\nMi int = " + numeroLong);
        System.out.println("CANTIDAD BYTES long= " + Long.BYTES);
        System.out.println("CANTIDAD Bites long= " + Long.SIZE);
        System.out.println("Maximo de un long = " + Long.MAX_VALUE);
        System.out.println("Mínimo de un long = " + Long.MIN_VALUE);


    }
}