package psn.design.pattern.designPatterns.Prototype.auxClasses;

import psn.design.pattern.designPatterns.Prototype.ColorMap;

class WhiteColor extends ColorMap
{
    public WhiteColor()
    {
        this.colorName = "white";
    }

    @Override
    public void addColor()
    {
        System.out.println("White color added");
    }

}
