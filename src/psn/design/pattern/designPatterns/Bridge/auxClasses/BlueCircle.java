package psn.design.pattern.designPatterns.Bridge.auxClasses;

import psn.design.pattern.designPatterns.Bridge.DrawAPI;

public class BlueCircle implements DrawAPI {

    public BlueCircle(){

        System.out.println(" --- New blue circle created! ---");
    }

    public void drawCircle(int radius, int x, int y) {

        System.out.println("Drawing Circle[ color: blue, radius: " + radius + ", position: " + x + ", " + y + "]");
    }
}
