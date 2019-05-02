package psn.design.pattern.designPatterns.Flyweight.auxClasses;

import psn.design.pattern.designPatterns.Flyweight.Building;

import java.util.HashMap;

public class BuildingFactory {

    private static final HashMap circleMap = new HashMap();

    public static Building getHouse(String color) {
        House house = (House)circleMap.get(color);

        if(house == null) {
            house = new House(color);
            circleMap.put(color, house);
            System.out.println("Constructing house of color : " + color);
        }
        return house;
    }
}