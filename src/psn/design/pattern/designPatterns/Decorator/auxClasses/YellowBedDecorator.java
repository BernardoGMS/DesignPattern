package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class YellowBedDecorator extends RoomDecorator {

    public YellowBedDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setYellowBed(decoratedRoom);
    }

    private void setYellowBed(Room decoratedRoom){
        System.out.println("Object: Yellow Bed");
    }
}
