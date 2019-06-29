package psn.design.pattern.designPatterns.Prototype.auxClasses;

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
