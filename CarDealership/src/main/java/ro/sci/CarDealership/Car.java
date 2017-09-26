package ro.sci.CarDealership;
//The car's main characteristics are defined here.
public class Car {
    private int productionYear;
    private String manufacturer;
    private String modelName;
    private String chassisSeries;
    private double electricMotor;
    private double energyConsumption;
    private double batteryCapacity;
    private boolean secondHand;


//Below we have an example of encapsulation.
    public Car(int whatYear, String manufacturerName, String carModelName, String chassisSerialNumber,
               double motorKW, double consumptionKWH, double batterySizeKW, boolean isItNew) {
        productionYear = whatYear;
        manufacturer = manufacturerName;
        modelName = carModelName;
        chassisSeries = chassisSerialNumber;
        electricMotor = motorKW;
        energyConsumption = consumptionKWH;
        batteryCapacity = batterySizeKW;
        secondHand = isItNew;

    }
//A blueprint for a println method.
    public String carToSring() {
        return "This is a " + manufacturer + " " + modelName +
                "\n From " + productionYear + " year " +
                "\n Chassis No:" + chassisSeries +
                "\n Electic motor power " + electricMotor + " KW" +
                "\n Consuming " + energyConsumption + " KWH" +
                "\n From a " + batteryCapacity + " KWH battery" +
                "\n Is it new? ---->" + secondHand;
    }


}
