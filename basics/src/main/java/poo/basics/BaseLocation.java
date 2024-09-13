package poo.basics;

public class BaseLocation {
    private double latitude, longitude;

    BaseLocation(double _latitude, double _longitude){
        if(! (isLatitudeValid(_latitude) && isLongitudeValid(_longitude) )){
            throw new Error("Can't initialize BaseLocation object due to bad range in one or two parameters.");
        }
        this.latitude = _latitude;
        this.longitude = _longitude;
    }
    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double _latitude) {
        if(isLatitudeValid(_latitude)){
            System.out.println("Can't set the new latitude value. Out of range error");
            return;
        }

        this.latitude = _latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double _longitude) {
        if(isLongitudeValid(_longitude)){
            System.out.println("Can't set the new longitude value. Out of range error");
            return;
        }
        this.longitude = _longitude;
    }

    private boolean isLatitudeValid(double _latitude){
        return (_latitude >= -90D && _latitude <= 90D);
    }

    private boolean isLongitudeValid(double _latitude){
        return (_latitude >= -180D && _latitude <= 180D);
    }
}
