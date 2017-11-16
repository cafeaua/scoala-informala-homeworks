import java.util.Date;

/**
 * Class modelling a Package that is being shipped.
 */

public class Package {
    //region Properties

    private String location;
    private int distance;
    private int value;
    private Date deliveryDate;

    //endregion

    //region Accessors

    public Package(String location, int dist, int v, Date dD) {
        this.setDeliveryDate(dD);
        this.setLocation(location);
        this.setDistance(dist);
        this.setValue(v);
    }

    public java.lang.String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    //endregion

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

}
