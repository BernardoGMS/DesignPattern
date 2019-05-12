package psn.design.pattern.designPatterns.NullObject.auxClasses;

import psn.design.pattern.designPatterns.NullObject.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
