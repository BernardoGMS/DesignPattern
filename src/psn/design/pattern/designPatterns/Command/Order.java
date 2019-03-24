package psn.design.pattern.designPatterns.Command;

public interface Order {

    void execute();

    @Override
    String toString();
}
