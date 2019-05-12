package psn.design.pattern.designPatterns.Memento.auxClasses;

import psn.design.pattern.designPatterns.Memento.Memento;

public class Originator {
    private String state;

    public Originator() {

        System.out.println("Originator created.");
    }

    public void setState(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
