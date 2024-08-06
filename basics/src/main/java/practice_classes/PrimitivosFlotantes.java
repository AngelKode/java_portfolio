package practice_classes;

public class PrimitivosFlotantes {
    public static void main(String[] args) {
        float realFlot = 1.0e-10f;
        System.out.println("Mi float = " + realFlot );
        System.out.println("CANTIDAD BYTES = " + Float.BYTES);
        System.out.println("CANTIDAD Bites = " + Float.SIZE);
        System.out.println("Maximo de un float= " + Float.MAX_VALUE);
        System.out.println("Mínimo de un float= " + Float.MIN_VALUE);

        double realDouble = 1.0e3;
        System.out.println("\nMi double = " + realDouble);
        System.out.println("CANTIDAD BYTES = " + Double.BYTES);
        System.out.println("CANTIDAD Bites = " + Double.SIZE);
        System.out.println("Maximo de un double = " + Double.MAX_VALUE);
        System.out.println("Mínimo de un double = " + Double.MIN_VALUE);
    }
}
