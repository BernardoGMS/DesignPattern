package psn.design.pattern.designPatterns.AbstractFactory.auxClasses;

public class ProductE extends AbstractProductB {

    public ProductE(String name){

        this.productName = name;
        System.out.println("Name of the created product: " + name);
    }
    public void operationB1() { }
    public void operationB2() { }

    @Override
    public String toString() {

        return "This is a product " + productName;
    }
}
