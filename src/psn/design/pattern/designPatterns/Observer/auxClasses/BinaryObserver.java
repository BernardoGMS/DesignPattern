package psn.design.pattern.designPatterns.Observer.auxClasses;

import psn.design.pattern.designPatterns.Observer.Observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Binary Observer created!");
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( subject.getState() ) );
    }
}
