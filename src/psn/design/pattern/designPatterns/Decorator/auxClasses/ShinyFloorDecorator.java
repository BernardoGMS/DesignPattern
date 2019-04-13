package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class ShinyFloorDecorator extends RoomDecorator {

    public ShinyFloorDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setShinyFloor(decoratedRoom);
    }

    private void setShinyFloor(Room decoratedRoom){
        System.out.println("Floor type: Shiny");
    }
}

