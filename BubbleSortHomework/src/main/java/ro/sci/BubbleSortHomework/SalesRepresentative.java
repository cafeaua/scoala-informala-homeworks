package main.java.ro.sci.BubbleSortHomework;
/**
 * Created by Sipos Zoltan 30-7-2017
 */

import java.util.Arrays;

public class SalesRepresentative {
    public static void main(String[] args) {
        int sales;
        int quota;

        int gigi[] = {sales = 17, quota = 230}; // giving people some value, not sure how to sort names.
        int calin[] = {sales = 13, quota = 185};
        int alin[] = {sales = 8, quota = 300};
        int andrei[] = {sales = 5, quota = 780};
        int ionut[] = {sales = 22, quota = 440};

        int[] worthOfSales = getWorthOfSales(gigi, calin, alin, andrei, ionut); // Refactored the method sales*quota
        BubbleSortAlgorithm.BubbleSort(worthOfSales); //sent the bad boy to the sorting algorithm.

        System.out.println("The wonderful computer says that ");
        System.out.println(Arrays.toString(worthOfSales)); //I pushed the buttons of IJ, and a magic string appeared.

    }

    private static int[] getWorthOfSales(int[] gigi, int[] calin, int[] alin, int[] andrei, int[] ionut) {
        return getInts(gigi, calin, alin, andrei, ionut);
    }

    private static int[] getInts(int[] gigi, int[] calin, int[] alin, int[] andrei, int[] ionut) {
        return new int[]{(gigi[0] * gigi[1]), (calin[0] * calin[1]), (alin[0] * alin[1]), (andrei[0] * andrei[1]), (ionut[0] * ionut[1])};
    }


}


