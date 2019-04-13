package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;

public class SmallRoom implements Room {


    @Override
    public void decorateRoom() {

        System.out.println("Room: Small");
    }
}
