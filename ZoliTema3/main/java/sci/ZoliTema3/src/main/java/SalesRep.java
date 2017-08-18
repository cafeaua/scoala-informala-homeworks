public class SalesRep {

    /**
     * Tema 3 
     */

    public String Name;
    public int Sales;
    public int Quota;
    public int globalSales;
    public String Departament;



    public int GetTotalSales() {
        return Quota * Sales;
    } // the total sales formula.
}
