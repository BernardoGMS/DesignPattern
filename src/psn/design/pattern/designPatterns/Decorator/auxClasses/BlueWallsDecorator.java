package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class BlueWallsDecorator extends RoomDecorator {

    public BlueWallsDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setBlueWalls(decoratedRoom);
    }

    private void setBlueWalls(Room decoratedRoom){
        System.out.println("Walls Color: Blue");
    }
}
