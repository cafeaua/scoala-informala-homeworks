package main.java.ro.sci.ZoliTema2;

/**
 * The players in the arena, stated below.
 */
public class SalesRep {
    public String Name;
    public int Sales;
    public int Quota;


    public int GetTotalSales() {
        return Quota * Sales;
    } // the total sales formula.
}
