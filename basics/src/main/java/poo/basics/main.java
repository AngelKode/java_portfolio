package poo.basics;

public class main {
    public static void main(String[] args) {
        BaseLocation myLocation = new BaseLocation(12.34521,-190);
        myLocation.setLatitude(-180.0);
        System.out.println(myLocation.getLatitude());
    }
}
