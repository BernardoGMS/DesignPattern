package psn.design.pattern.designPatterns.Observer.auxClasses;

import psn.design.pattern.designPatterns.Observer.Observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Hexagonal Observer created!");
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}