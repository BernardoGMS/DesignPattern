package psn.design.pattern.designPatterns.AbstractFactory.auxClasses;

public class ProductA extends AbstractProductA {

    public ProductA(String name){

        this.productName = name;
        System.out.println("Name of the created product: " + name);
    }
    public void operationA1() { }
    public void operationA2() { }

    @Override
    public String toString() {

        return "This is a product " + productName;
    }
}
