package psn.design.pattern.designPatterns.Prototype.auxClasses;

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