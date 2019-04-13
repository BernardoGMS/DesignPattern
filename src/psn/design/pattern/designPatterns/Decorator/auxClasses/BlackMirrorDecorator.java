package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class BlackMirrorDecorator extends RoomDecorator {

    public BlackMirrorDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setBlackMirror(decoratedRoom);
    }

    private void setBlackMirror(Room decoratedRoom){
        System.out.println("Object: Black Mirror");
    }
}
