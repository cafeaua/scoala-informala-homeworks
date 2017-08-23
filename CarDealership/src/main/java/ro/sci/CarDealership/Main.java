package ro.sci.CarDealership;
/**
 * Created by Sipos Zoltan on 23/08/17.
 */

public class Main {

    public static void main(String[] args) {
        Car myNewCar = new Car(2017, "Honda", "Civic",
                "8BHJSD0", 56.3, 44.4, 82.0, true);
        System.out.println(myNewCar.carToSring());
    }

}
