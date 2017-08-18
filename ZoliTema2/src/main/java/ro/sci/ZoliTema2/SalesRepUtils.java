package main.java.ro.sci.ZoliTema2;

/**
 * The Bubble Sort Algorithm, set to sort in a ascending order. 
 * Modified for review purposes 18.08.2017
 */
public class SalesRepUtils {
    public static void BubbleSortReps(SalesRep[] reps) {

        for (int j = 0; j < reps.length; j++) {
            for (int i = 0; i < reps.length; i++) {
                if (i + 1 < reps.length) {
                    if (reps[i].GetTotalSales() > reps[i + 1].GetTotalSales()) {
                        SalesRep temp = reps[i];
                        reps[i] = reps[i + 1];
                        reps[i + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < reps.length; i++) {
            System.out.println(reps[i].Name + "   :   " + reps[i].GetTotalSales()); //combining names with numbers.
        }
    }
}
