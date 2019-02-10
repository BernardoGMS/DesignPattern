package psn.design.pattern.designPatterns.AbstractFactory;

import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.*;

public class ConcreteFactory2 extends AbstractFactoryDP{

    public AbstractProductA createProductA(String productName){

        this.productName = productName;
        return new ProductA(productName);
    }

    public AbstractProductA createProductB(String productName){

        this.productName = productName;
        return new ProductB(productName);
    }

    @Override
    public AbstractProductA createProductC(String productName) {

        this.productName = productName;
        return new ProductC(productName);
    }

    @Override
    public AbstractProductB createProductD(String productName) {

        this.productName = productName;
        return new ProductD(productName);
    }

    @Override
    public AbstractProductB createProductE(String productName) {

        this.productName = productName;
        return new ProductE(productName);
    }

    @Override
    public String toString() {

        return "CONCRETE FACTORY 2";
    }
}
