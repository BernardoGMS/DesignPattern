package psn.design.pattern.designPatterns.PrivateClassData;

import psn.design.pattern.designPatterns.PrivateClassData.auxClasses.DataClass;

public class MainClass {

    private DataClass dataClass;

    public MainClass(int height, int weight, int width){

        System.out.println("Main class was instantiated...");
        dataClass = new DataClass(height,weight,width);
        System.out.println("Data Class created with the 3 variables:");
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("Width:" + width);
    }

    public DataClass getDataClass() {
        return dataClass;
    }

    public void setDataClass(DataClass dataClass) {
        this.dataClass = dataClass;
    }
}
