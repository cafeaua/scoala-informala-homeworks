package ro.sci.Sales;

/*
Created by Sipos Zoltan 14 Sept 2017
Continued on 19 Sept 2017
 */
public class Sales extends SalesAgent {

    static SalesAgent[] agents = new SalesAgent[20];
    //declaring the array

    public static void main(String[] args) {
        //initialise the sales team
        initSalesTeam(1, "Ana", 1, 10, 100);
        initSalesTeam(2, "bob", 1, 14, 400);
        initSalesTeam(3, "Bubu", 1, 20, 103);
        initSalesTeam(4, "Adi", 1, 12, 55);
        initSalesTeam(5, "dodo", 1, 21, 202);

        initSalesTeam(6, "Ale", 2, 19, 98);
        initSalesTeam(7, "Dana", 2, 11, 320);
        initSalesTeam(8, "didi", 2, 17, 340);
        initSalesTeam(9, "soso", 2, 23, 105);
        initSalesTeam(10, "edi", 2, 20, 123);

        initSalesTeam(11, "flo", 3, 40, 333);
        initSalesTeam(12, "feli", 3, 30, 110);
        initSalesTeam(13, "giz", 3, 18, 167);
        initSalesTeam(14, "lov", 3, 10, 302);
        initSalesTeam(15, "pop", 3, 14, 144);

        initSalesTeam(16, "mis", 4, 27, 87);
        initSalesTeam(17, "moc", 4, 5, 230);
        initSalesTeam(18, "doc", 4, 40, 100);
        initSalesTeam(19, "dic", 4, 55, 54);
        initSalesTeam(0, "zozo", 4, 25, 145);

        //printing out the results of the methods
        SalesAgent bestAgent = getBestSalesAgent();
        System.out.println("Cel mai mult a vandut --->  " + bestAgent.name + "\n Total ---> "
                + computesWorthOfSales(bestAgent) +
                "\n din departamentul cu numarul ---> " + bestAgent.departament);

    }


}

