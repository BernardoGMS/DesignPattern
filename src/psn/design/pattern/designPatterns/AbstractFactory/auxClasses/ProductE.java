package psn.design.pattern.designPatterns.AbstractFactory.auxClasses;

public class ProductE extends AbstractProductB {

    public ProductE(String name){

        this.productName = name;
        System.out.println("Name of the created product: " + name);
    }
    public void operationB1() {

        System.out.println(" First operation (B1 - Covering) with " + productName + " done!");
    }
    public void operationB2() {

        System.out.println(" Second operation (B2 - Covering) with " + productName + " done!");
    }

    @Override
    public String toString() {

        return "This is a product " + productName;
    }
}
