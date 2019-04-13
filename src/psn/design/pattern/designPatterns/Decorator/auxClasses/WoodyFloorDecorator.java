package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class WoodyFloorDecorator extends RoomDecorator {

    public WoodyFloorDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setWoodyFloor(decoratedRoom);
    }

    private void setWoodyFloor(Room decoratedRoom){
        System.out.println("Floor type: Woody");
    }
}
