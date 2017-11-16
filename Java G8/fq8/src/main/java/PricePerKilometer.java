public interface PricePerKilometer {

    //Setam pretul per kilometru ca sa putem sa-l modificam usor.

    default double pricePerKilometer(){
        return 3.5;
    }
}
