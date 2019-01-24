package psn.design.pattern.designPatterns.AbstractFactory;

import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.*;

public class ConcreteFactory2 extends AbstractFactoryDP{

    public AbstractProductA createProductA(String productName){

        this.productName = productName;
        return new ProductB(productName);
    }

    public AbstractProductB createProductB(String productName){

        this.productName = productName;
        return new ProductC(productName);
    }

    @Override
    public String toString() {

        return "CONCRETE FACTORY 2";
    }
}
