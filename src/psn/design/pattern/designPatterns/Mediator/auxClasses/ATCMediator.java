package psn.design.pattern.designPatterns.Mediator.auxClasses;

import psn.design.pattern.designPatterns.Mediator.Mediator;

import java.util.Date;

public class ATCMediator implements Mediator {

    //create an object of SingleObject
    private static Mediator instance = new ATCMediator();

    private ATCMediator(){}

    //Get the only object available
    public static Mediator getInstance(){
        return instance;
    }

    @Override
    public void showMessage(Flight flight, String message) {

        System.out.println(new Date().toString() + " [" + flight.getName() + "] : " + message);
    }
}
