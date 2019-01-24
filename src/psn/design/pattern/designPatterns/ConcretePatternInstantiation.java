package psn.design.pattern.designPatterns;

import psn.design.pattern.designPatterns.AbstractFactory.AbstractFactoryDP;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductB;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.FactoryMaker;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsConstructorEN;

public class ConcretePatternInstantiation implements ImplPatternInterface {

    public void implementAbstractFactory(TextsConstructor constructor){

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_FACTORIES);
            constructor.constructText();

            AbstractFactoryDP factory1 = FactoryMaker.getFactory("a");
            AbstractFactoryDP factory2 = FactoryMaker.getFactory("b");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_PRODUCTS_FACA);
            constructor.constructText();

            AbstractProductA productA = factory1.createProductA("Choc");
            AbstractProductA productB = factory1.createProductA("Maria");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_PRODUCTS_FACB);
            constructor.constructText();

            AbstractProductA productC = factory2.createProductA("Cuetara");
            AbstractProductB productD = factory2.createProductB("Oreo");
            AbstractProductB productE = factory2.createProductB("Cream");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_FACTORIES);
            constructor.constructText();

            AbstractFactoryDP factory1 = FactoryMaker.getFactory("a");
            AbstractFactoryDP factory2 = FactoryMaker.getFactory("b");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_PRODUCTS_FACA);
            constructor.constructText();

            AbstractProductA productA = factory1.createProductA("Choc");
            AbstractProductA productB = factory1.createProductA("Maria");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_PRODUCTS_FACB);
            constructor.constructText();

            AbstractProductA productC = factory2.createProductA("Cuetara");
            AbstractProductB productD = factory2.createProductB("Oreo");
            AbstractProductB productE = factory2.createProductB("Cream");

            constructor.constructTextDown(2);

        }

    }
}
