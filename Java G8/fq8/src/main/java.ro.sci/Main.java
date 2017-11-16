import java.util.Date;

/*
Created by Sipos Zoltan and friends, 16 - 11 - 2017
 */
public class Main {

    public static void main(String[] args) {
        // write your code here


        //this is the list with all the packages that need to be shipped

        PackageList allPackages = new PackageList();

        //add some packages to the list


        allPackages.addPackage(new Package("Dej", 10, 40, new Date(2017, 12, 22)));
        allPackages.addPackage(new Package("Gherla", 15, 90, new Date(2017, 12, 20)));
        allPackages.addPackage(new Package("Ciurila", 18, 100, new Date(2017, 12, 18)));


        //we create two deliveries for the two locations above (Dej and Gherla)

        Delivery delivery1 = new Delivery(allPackages.getPackage(0), allPackages);
        Delivery delivery2 = new Delivery(allPackages.getPackage(1), allPackages);
        Delivery delivery3 = new Delivery(allPackages.getPackage(2), allPackages);

        //we start the deliveries

        delivery1.StartDelivery();
        delivery2.StartDelivery();
        delivery3.StartDelivery();
        allPackages.getTotalValue();

        System.out.println("Total profit is $"+ allPackages.getProfit());


    }
}
