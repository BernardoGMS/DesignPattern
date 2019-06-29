package psn.design.pattern.designPatterns.Prototype.auxClasses;

class BlueColor extends ColorMap
{
    public BlueColor()
    {
        this.colorName = "blue";
    }

    @Override
    public void addColor()
    {
        System.out.println("Blue color added");
    }

}
