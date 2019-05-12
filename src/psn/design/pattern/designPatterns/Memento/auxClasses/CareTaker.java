package psn.design.pattern.designPatterns.Memento.auxClasses;

import psn.design.pattern.designPatterns.Memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    public CareTaker() {

        System.out.println("CareTaker created.");
    }

    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
