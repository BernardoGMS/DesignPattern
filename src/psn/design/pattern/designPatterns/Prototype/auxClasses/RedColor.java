package psn.design.pattern.designPatterns.Prototype.auxClasses;

import psn.design.pattern.designPatterns.Prototype.ColorMap;

class RedColor extends ColorMap
{
    public RedColor()
    {
        this.colorName = "red";
    }

    @Override
    public void addColor()
    {
        System.out.println("Red color added");
    }

}