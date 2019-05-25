package psn.design.pattern.designPatterns.Observer;

import psn.design.pattern.designPatterns.Observer.auxClasses.Subject;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();
}