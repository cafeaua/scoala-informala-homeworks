package ro.sci.Dealership;

public class Car {
    String brandName; //The Automaker's name
    String modelName; //The car's model name as the consumer sees it
    String serialNumber; //Since there can be more cars with the same name/model a unique serial no is necessary
    double electricBatteries;// The total capacity of the batteries (Kw/H)
    double electricMotor; //The peak power of the electric motor (Kw)
    double energyConsumption;//Average energy consumption / 100 km (Kwh / 100km)
    int productionYear; // The year the car has been manufactured.
    boolean secondHand; // Is it new?

    public Car(String brandName, String modelName, String serialNumber, double electricBatteries, double electricMotor, double energyConsumption, int productionYear, boolean secondHand) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.serialNumber = serialNumber;
        this.electricBatteries = electricBatteries;
        this.electricMotor = electricMotor;
        this.energyConsumption = energyConsumption;
        this.productionYear = productionYear;
        this.secondHand = secondHand;
    }
}



//        Car OOP Model.
//        Car have electric motors and electric batteries (kw).
//        Car have an energy consumption (kw/km)
//        Car have manufacturers, models and production year.
