package psn.design.pattern.designPatterns.Memento;

public class Memento {
    private String state;

    public Memento( ) {

        System.out.println("New Memento created: new state saved.");
    }

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
