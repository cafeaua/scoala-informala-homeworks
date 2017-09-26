/**
 * Tema 3, partial rezolvata de Sipos Zoltan, supusa pentru review in 18.08.2017
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Working dandy");

        SalesRep reps[] = new SalesRep[20]; //defining the number of blocks in the array.

        SalesRep s1 = new SalesRep();  // defining the array's values
        s1.Name = "Gigi";
        s1.Quota = 10;
        s1.Sales = 100;
        s1.Departament = "First";

        reps[0] = s1;

        SalesRep s2 = new SalesRep();
        s2.Name = "Don";
        s2.Quota = 20;
        s2.Sales = 70;
        s2.Departament = "First";


        reps[1] = s2;

        SalesRep s3 = new SalesRep();

        s3.Name = "Andrei";
        s3.Quota = 10;
        s3.Sales = 79;
        s3.Departament = "First";

        reps[2] = s3;

        SalesRep s4 = new SalesRep();

        s4.Name = "Emil";
        s4.Quota = 10;
        s4.Sales = 16;
        s4.Departament = "First";

        reps[3] = s4;

        SalesRep s5 = new SalesRep();

        s5.Name = "Johny";
        s5.Quota = 98;
        s5.Sales = 34;
        s5.Departament = "First";

        reps[4] = s5;

        SalesRep s6 = new SalesRep();  // Second departament
        s6.Name = "Jiji";
        s6.Quota = 13;
        s6.Sales = 100;
        s6.Departament = "Second";

        reps[5] = s6;

        SalesRep s7 = new SalesRep();
        s7.Name = "Dona";
        s7.Quota = 21;
        s7.Sales = 73;
        s7.Departament = "Second";


        reps[6] = s7;

        SalesRep s8 = new SalesRep();

        s8.Name = "Andrea";
        s8.Quota = 10;
        s8.Sales = 80;
        s8.Departament = "Second";

        reps[7] = s8;

        SalesRep s9 = new SalesRep();

        s9.Name = "Emilia";
        s9.Quota = 15;
        s9.Sales = 17;
        s9.Departament = "Second";

        reps[8] = s9;

        SalesRep s10 = new SalesRep();

        s10.Name = "Ioana";
        s10.Quota = 48;
        s10.Sales = 14;
        s10.Departament = "Second";

        reps[9] = s10;

        SalesRep s11 = new SalesRep();  // Third deparatment
        s11.Name = "Gita";
        s11.Quota = 29;
        s11.Sales = 130;
        s11.Departament = "Third";

        reps[10] = s11;

        SalesRep s12 = new SalesRep();
        s12.Name = "Pedro";
        s12.Quota = 66;
        s12.Sales = 71;
        s12.Departament = "Third";


        reps[11] = s12;

        SalesRep s13 = new SalesRep();

        s13.Name = "Crina";
        s13.Quota = 6;
        s13.Sales = 170;
        s13.Departament = "Third";

        reps[12] = s13;

        SalesRep s14 = new SalesRep();

        s14.Name = "Emanuela";
        s14.Quota = 190;
        s14.Sales = 16;
        s14.Departament = "Third";

        reps[13] = s14;

        SalesRep s15 = new SalesRep();

        s15.Name = "Dia";
        s15.Quota = 9;
        s15.Sales = 166;
        s15.Departament = "Third";

        reps[14] = s15;

        SalesRep s16 = new SalesRep();  // Fourth department.
        s16.Name = "Angi";
        s16.Quota = 17;
        s16.Sales = 120;
        s16.Departament = "Fourth";

        reps[15] = s16;

        SalesRep s17 = new SalesRep();
        s17.Name = "Baxtor";
        s17.Quota = 65;
        s17.Sales = 33;
        s17.Departament = "Fourth";


        reps[16] = s17;

        SalesRep s18 = new SalesRep();

        s18.Name = "Amy";
        s18.Quota = 9;
        s18.Sales = 200;
        s18.Departament = "Fourth";

        reps[17] = s18;

        SalesRep s19 = new SalesRep();

        s19.Name = "Louie";
        s19.Quota = 75;
        s19.Sales = 26;
        s19.Departament = "Fourth";

        reps[18] = s19;

        SalesRep s20 = new SalesRep();

        s20.Name = "Ramada";
        s20.Quota = 44;
        s20.Sales = 84;
        s20.Departament = "Fourth";

        reps[19] = s20;

        int globalSales = s1.GetTotalSales() + s2.GetTotalSales() + s3.GetTotalSales() + s4.GetTotalSales()
                + s5.GetTotalSales() + s6.GetTotalSales() + s7.GetTotalSales() + s8.GetTotalSales()
                + s9.GetTotalSales() + s10.GetTotalSales() + s11.GetTotalSales() + s12.GetTotalSales()
                + s13.GetTotalSales() + s14.GetTotalSales() + s15.GetTotalSales() + s16.GetTotalSales()
                + s17.GetTotalSales() + s18.GetTotalSales() + s19.GetTotalSales() + s20.GetTotalSales();
        System.out.println("Global sales " //Calculating the total value based on get total sales.
                + globalSales);


        SalesRepUtils.BubbleSortReps(reps);//Summoning the sorting algorithm.

    }
}
