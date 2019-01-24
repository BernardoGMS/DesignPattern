package psn.design.pattern.designPatterns.AbstractFactory;

import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductB;

public abstract class AbstractFactoryDP{

    protected String productName;

    public abstract AbstractProductA createProductA(String productName);
    public abstract AbstractProductB createProductB(String productName);
}
