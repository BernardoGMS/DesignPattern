package psn.design.pattern.designPatterns.AbstractFactory;

import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductB;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.ProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.ProductC;

public class ConcreteFactory1 extends AbstractFactoryDP{

    public AbstractProductA createProductA(String productName){

        this.productName = productName;
        return new ProductA(productName);
    }

    public AbstractProductB createProductB(String productName){

        this.productName = productName;
        return new ProductC(productName);
    }

    @Override
    public String toString() {

        return "CONCRETE FACTORY 1";
    }
}
