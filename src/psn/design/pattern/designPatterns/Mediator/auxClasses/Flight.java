package psn.design.pattern.designPatterns.Mediator.auxClasses;

import psn.design.pattern.designPatterns.Mediator.Mediator;

public class Flight {

    private String name;
    private int longitude;
    private int latitude;
    private int altitude;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLongitude() {
        return longitude;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public Flight(String name, int latitude, int longitude, int altitude){

        this.name  = name;
        this.latitude = latitude;
        this. longitude = longitude;
        this.altitude = altitude;
        System.out.println("The flight " + getName() + " was instantiated");
    }

    public void sendMessage(String message){

        Mediator atcMediator = ATCMediator.getInstance();
        atcMediator.showMessage(this,message);
    }

}
