public class SalesRep {

    /**
     * The players in the arena, stated below.
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
