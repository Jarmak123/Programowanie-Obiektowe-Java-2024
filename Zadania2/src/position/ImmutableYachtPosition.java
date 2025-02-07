package position;

public final class ImmutableYachtPosition {
    private double latitude;
    private double longitude;
    private double altitude;

    public ImmutableYachtPosition(double latitude, double longitude, double altitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getAltitude() {
        return altitude;
    }

    @Override
    public String toString() {
        return "ImmutableYachtPosition{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                '}';
    }

    public ImmutableYachtPosition move(double latitudeChange, double longitudeChange, double altitudeChange){
        return new ImmutableYachtPosition(this.latitude+latitudeChange,this.longitude+longitudeChange,this.altitude+altitudeChange);
    }
}
