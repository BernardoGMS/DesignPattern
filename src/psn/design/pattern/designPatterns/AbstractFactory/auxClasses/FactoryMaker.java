package psn.design.pattern.designPatterns.AbstractFactory.auxClasses;

import psn.design.pattern.designPatterns.AbstractFactory.AbstractFactoryDP;
import psn.design.pattern.designPatterns.AbstractFactory.ConcreteFactory1;
import psn.design.pattern.designPatterns.AbstractFactory.ConcreteFactory2;

public class FactoryMaker{

    private static AbstractFactoryDP pf = null;

   public static AbstractFactoryDP getFactory(String choice){

        if(choice.equals("a")){

            pf = new ConcreteFactory1();
        }else if(choice.equals("b")){

            pf = new ConcreteFactory2();
        }

        return pf;
    }
}
