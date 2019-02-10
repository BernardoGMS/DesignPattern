package psn.design.pattern.designPatterns.AbstractFactory;

import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductB;

public abstract class AbstractFactoryDP{

    protected String productName;

    public abstract AbstractProductA createProductA(String productName);
    public abstract AbstractProductA createProductB(String productName);
    public abstract AbstractProductA createProductC(String productName);
    public abstract AbstractProductB createProductD(String productName);
    public abstract AbstractProductB createProductE(String productName);
}
