package psn.design.pattern.designPatterns.Flyweight.auxClasses;

import psn.design.pattern.designPatterns.Flyweight.Building;

public class House implements Building {

    private String color;
    private int horizontalCoordinate;
    private int verticalCoordinate;
    private int area;

    public House(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorizontalCoordinate() {
        return horizontalCoordinate;
    }

    public void setHorizontalCoordinate(int horizontalCoordinate) {
        this.horizontalCoordinate = horizontalCoordinate;
    }

    public int getVerticalCoordinate() {
        return verticalCoordinate;
    }

    public void setVerticalCoordinate(int verticalCoordinate) {
        this.verticalCoordinate = verticalCoordinate;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public void construct() {
        System.out.println("House: Contruct() [Color : " + color + ", Horizontal Coord : " + verticalCoordinate + ", Vertical Coord :" + verticalCoordinate + ", area :" + area);
    }
}
