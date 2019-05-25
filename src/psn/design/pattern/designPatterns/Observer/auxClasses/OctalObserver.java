package psn.design.pattern.designPatterns.Observer.auxClasses;

import psn.design.pattern.designPatterns.Observer.Observer;

public class OctalObserver extends Observer {

    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
        System.out.println("Octagonal Observer created!");
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( subject.getState() ) );
    }
}
