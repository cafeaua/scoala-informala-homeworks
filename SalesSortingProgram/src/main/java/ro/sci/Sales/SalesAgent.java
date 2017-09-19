package ro.sci.Sales;
/*
This program calculates the best Sales Agent from an array of Sales agents based on their Worth Of Sales
Worth of sales = sales *quota
 */
import static ro.sci.Sales.Sales.agents;

public class SalesAgent {

    String name;
 //   int position;
    int departament;
    int sales;
    int quota;
//    int toalSales;
//below is the constructor for the array so it is possible to add the values in-line
    public static void initSalesTeam(int position, String name, int departament, int sales, int quota) {
        agents[position] = new SalesAgent();
        agents[position].name = name;
        agents[position].departament = departament;
        agents[position].sales = sales;
        agents[position].quota = quota;
    }
//The method calculating Worth of Sales
    public static int computesWorthOfSales(SalesAgent agents) {
        return agents.sales * agents.quota;

    }
// Bubble sort method calculating the best sales agent based on worthofsales value
    public static SalesAgent getBestSalesAgent() {
        SalesAgent bestSalesAgent = new SalesAgent();
        int bestSeller = 0;
        for (SalesAgent agent : agents) {
            int agentSalesStar = computesWorthOfSales(agent);
            if (agentSalesStar > bestSeller) {
                bestSeller = agentSalesStar;
                bestSalesAgent = agent;
            }
        }
        return bestSalesAgent;
    }

}


