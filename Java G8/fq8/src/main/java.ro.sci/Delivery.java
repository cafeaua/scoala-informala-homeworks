import java.util.Date;

public class Delivery extends Thread{

    //region Properties
    private PackageList packages = new PackageList();
    private String location;
    private int distance;


    //region Accessors


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    //endregion

    //region Constructor

    public Delivery(Package p, PackageList pl){
        this.location = p.getLocation();
        this.distance = p.getDistance();
        this.packages = pl.getPackages(p.getDeliveryDate(), p.getLocation());
    }

    //endregion


    /**
     * We start the thread and printout a message.
     */


    public void StartDelivery(){
        System.out.println("Starting a delivery to location: " + location );
        this.start();
    }

    /**
     * The actual logic of the thread.
     */

    public void run(){


        //we make a note of when the thread has started

        long startTime = new Date().getTime();
        int completedDistance = 0;


        try {
            //we check if the overall distance oompleted equals the distance to the destination
            while (completedDistance < this.distance) {


                //calculate time passed and time left

                long timePassed = new Date().getTime()-startTime;
                long timeLeft = (this.distance * 1000) - timePassed;

                System.out.println("Delivery on route to " + this.getLocation() + ". Time since departure: " + timePassed + ". Time to destination: " + timeLeft );

                //add to the completed distance 1km/sec
                completedDistance += 1;

                //sleep the thread for one second
                sleep(1000);
            }
        }
        catch (Exception x){
            System.out.println("Error has occurred!");
        }

        //when we get here we are out of the while loop meaning we reached destination.

        System.out.println("Package has arrived to destination: " + this.getLocation() + ". Distance :" + this.distance + " , Profit: " + this.packages.getProfit());

    }

}
