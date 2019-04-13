package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;

public class BigRoom implements Room {

    @Override
    public void decorateRoom() {

        System.out.println("Room: Big");
    }
}
