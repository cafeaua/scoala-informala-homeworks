package main.java.ro.sci.ZoliTema2;

/**
 * Created by Sipos Zoltan 5.8.2017
 * This program sorts the Sales agents after the total sales amount in ascending order.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Program has started");

        SalesRep reps[] = new SalesRep[4]; //defining the number of blocks in the array.

        SalesRep s1 = new SalesRep();  // defining the array's values
        s1.Name = "Gigi";
        s1.Quota = 10;
        s1.Sales = 100;

        reps[0] = s1; //The first block in the array is 0.

        SalesRep s2 = new SalesRep();
        s2.Name = "Calin";
        s2.Quota = 10;
        s2.Sales = 300;

        reps[1] = s2;

        SalesRep s3 = new SalesRep();

        s3.Name = "Andrei";
        s3.Quota = 10;
        s3.Sales = 80;

        reps[2] = s3;

        SalesRep s4 = new SalesRep();

        s4.Name = "Emil";
        s4.Quota = 10;
        s4.Sales = 16;

        reps[3] = s4;

        SalesRepUtils.BubbleSortReps(reps); //Summoning the sorting algorithm.
    }
}
