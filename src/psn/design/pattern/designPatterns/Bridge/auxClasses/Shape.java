package psn.design.pattern.designPatterns.Bridge.auxClasses;

import psn.design.pattern.designPatterns.Bridge.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
