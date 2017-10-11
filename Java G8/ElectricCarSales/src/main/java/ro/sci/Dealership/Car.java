package ro.sci.Dealership;
/*
Cars can be final, except the second hand cars witch can have different mileages
 */

public class Car extends Dealership {

    private final String BRANDNAME; //The Automaker's name
    private final String MODELNAME; //The car's model name as the consumer sees it
    private final String SERIALNUMBER; //Since there can be more cars with the same name/model a unique serial no is necessary
    private final double ELECTRICBATTERIES;// The total capacity of the batteries (Kw/H)
    private final double ELECTRICMOTOR; //The peak power of the electric motor (Kw)
    private final double ENERGYCONSUMPTION;//Average energy consumption / 100 km (Kwh / 100km)
    private final int PRODUCTIONYEAR; // The year the car has been manufactured.
    boolean secondHand; // Is it new?


    public String getBRANDNAME() {
        String marca = BRANDNAME;
        return marca;
    }

    public String getMODELNAME() {
        String model = MODELNAME;
        return model;
    }

    public String ge2tSERIALNUMBER() {
        String serial = SERIALNUMBER;
        return SERIALNUMBER;
    }

    public double getELECTRICBATTERIES() {
        double baterie = ELECTRICBATTERIES;
        return ELECTRICBATTERIES;
    }

    public double getELECTRICMOTOR() {
        double motor = ELECTRICMOTOR;
        return ELECTRICMOTOR;
    }

    public double getENERGYCONSUMPTION() {
        double consum = ENERGYCONSUMPTION;
        return ENERGYCONSUMPTION;
    }

    public int getPRODUCTIONYEAR() {
        int dinAnul = PRODUCTIONYEAR;
        return PRODUCTIONYEAR;
    }

    public Car(String marca, String model, String serial, double baterie, double motor, double consum, int dinAnul, boolean uzata) {
        this.BRANDNAME = marca;
        this.MODELNAME = model;
        this.SERIALNUMBER = serial;
        this.ELECTRICBATTERIES = baterie;
        this.ELECTRICMOTOR = motor;
        this.ENERGYCONSUMPTION = consum;
        this.PRODUCTIONYEAR = dinAnul;
        this.secondHand = uzata;
    }

    public boolean isSecondHand() {
        boolean uzata = secondHand;
        return secondHand;


    }

}
