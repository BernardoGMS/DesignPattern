package psn.design.pattern.designPatterns.Decorator;

public abstract class RoomDecorator implements Room {

    protected Room decoratedRoom;

    public RoomDecorator(Room decoratedRoom){
        this.decoratedRoom = decoratedRoom;
    }

    @Override
    public void decorateRoom(){
        decoratedRoom.decorateRoom();
    }
}
