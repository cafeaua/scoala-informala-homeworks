package ro.sci.Dealership;

public class Main {


    public static void main(String[] args) {
        Car ev1 = new Car("Dacia", "Logan-e", "dlgne-01", 100.5, 30.4,
                40, 2017, false);
        System.out.println(ev1.secondHand);
    }
}
