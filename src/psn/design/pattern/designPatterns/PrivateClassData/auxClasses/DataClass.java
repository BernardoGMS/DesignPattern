package psn.design.pattern.designPatterns.PrivateClassData.auxClasses;

public class DataClass {

    private int height;
    private int weight;
    private int width;

    public DataClass(int height, int weight, int width){

        this.height = height;
        this.weight = weight;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
