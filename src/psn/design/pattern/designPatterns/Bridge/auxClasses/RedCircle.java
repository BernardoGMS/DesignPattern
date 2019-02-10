package psn.design.pattern.designPatterns.Bridge.auxClasses;

import psn.design.pattern.designPatterns.Bridge.DrawAPI;

public class RedCircle implements DrawAPI {

    public RedCircle(){

        System.out.println(" --- New red circle created! ---");
    }

    public void drawCircle(int radius, int x, int y) {

        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", position: " + x + ", " + y + "]");
    }
}
