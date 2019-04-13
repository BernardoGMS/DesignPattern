package psn.design.pattern.designPatterns.Decorator.auxClasses;

import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.RoomDecorator;

public class RedCandleDecorator extends RoomDecorator {

    public RedCandleDecorator(Room decoratedRoom) {
        super(decoratedRoom);
    }

    @Override
    public void decorateRoom() {
        decoratedRoom.decorateRoom();
        setRedCandle(decoratedRoom);
    }

    private void setRedCandle(Room decoratedRoom){
        System.out.println("Object: Red Candle");
    }
}
