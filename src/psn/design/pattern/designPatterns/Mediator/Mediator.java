package psn.design.pattern.designPatterns.Mediator;

import psn.design.pattern.designPatterns.Mediator.auxClasses.Flight;

public interface Mediator {

    void showMessage(Flight flight, String message);
}
