package psn.design.pattern.designPatterns.AbstractFactory.auxClasses;

public class ProductB extends AbstractProductA  {

    public ProductB(String name){

        this.productName = name;
        System.out.println("Name of the created product: " + name);
    }
    public void operationA1() {

        System.out.println(" First operation (A1 - Packing) with " + productName + " done!");
    }
    public void operationA2() {

        System.out.println(" Second operation (A2 - Distributing) with " + productName + " done!");
    }

    @Override
    public String toString() {

        return "This is a product " + productName;
    }
}
