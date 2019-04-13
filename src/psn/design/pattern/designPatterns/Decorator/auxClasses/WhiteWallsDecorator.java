package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class WhiteWallsDecorator extends RoomDecorator {

    public WhiteWallsDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setWhiteWalls(decoratedRoom);
    }

    private void setWhiteWalls(Room decoratedRoom){
        System.out.println("Walls Color: White");
    }
}
