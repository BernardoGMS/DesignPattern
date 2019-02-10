package psn.design.pattern.designPatterns.Bridge.auxClasses;

import psn.design.pattern.designPatterns.Bridge.DrawAPI;

public class PurpleCircle implements DrawAPI {

    public PurpleCircle(){

        System.out.println(" --- New purple circle created! ---");
    }

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: purple, radius: " + radius + ", position: " + x + ", " + y + "]");
    }
}
