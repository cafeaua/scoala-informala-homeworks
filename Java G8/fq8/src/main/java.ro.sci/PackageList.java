import java.util.ArrayList;
import java.util.Date;


/**
 * Class modelling a list of packages.
 *
 * We are using the class to store all the packages that need to be shipped, but also to store
 * the packages in a delivery.
 */


public class PackageList {

    private ArrayList<Package> packages = new ArrayList<>();
    private int totalValue;
    private int profit;
    private int priceRate = 10;


    /*
     * Calculate the total value of the packages in the.
     * @return
     */

    public int getTotalValue() {
        int valueReturn = 0;

        for(Package p : getPackages()){
            valueReturn += p.getValue();
        }

        return valueReturn;
    }

    /**
     * Calculate the profit we get when all the packages in the list are shipped.
     * @return
     */


    public int getProfit() {
        int profitReturn = 0;
        for(Package p : getPackages()){
            profitReturn += p.getDistance() * priceRate;
        }
        return profitReturn;
    }

    public void setPackages(ArrayList<Package> packages) {
        this.packages = packages;
    }


    public void addPackage(Package p){
        this.getPackages().add(p);
    }

    public ArrayList<Package> getPackages(){
        return this.packages;
    }


    /**
     *
     * @param date
     * @param location
     * @return
     *
     * Will return all the packages to be delivered on a certain day to a certain location.
     * We use this later on to create a subset of all the packages that need to be part of a delivery.
     */

    public PackageList getPackages(Date date, String location){
        ArrayList<Package> returnPackages = new ArrayList<Package>();

        for(Package p : getPackages()) {
            if (p.getDeliveryDate().equals(date) && p.getLocation().equals(location)) {
                returnPackages.add(p);
            }
        }

        PackageList returnPackageList = new PackageList();

        returnPackageList.setPackages(returnPackages);

        return returnPackageList;

    }

    public Package getPackage(int i){
        return packages.get(i);
    }

}
