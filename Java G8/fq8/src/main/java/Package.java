class Package {
    public double distanceInKilometers;
    public double merchandiseValue;
    public String ID,targetLocation, deliveryDate;

    public Package(String ID,String targetLocation, double distanceInKilometers, double merchandiseValue, String deliveryDate){
        this.ID = ID;
        this.targetLocation = targetLocation;
        this.distanceInKilometers = distanceInKilometers;
        this.merchandiseValue = merchandiseValue;
        this.deliveryDate = deliveryDate;
    }
    @Override
    public String toString(){
        return "Package{"
                +"ID=" +ID+ '\''+
                "targetLocation - " + targetLocation + '\''+
                "distanceInKilometers Km:" + distanceInKilometers +  '\''+
                "merchandiseValue $" + merchandiseValue+ '\''+
                "deliveryDate - "+ deliveryDate + '\''+ '}'+ System.getProperty("line.separator");
    }


}


