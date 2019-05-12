package psn.design.pattern.designPatterns.NullObject.auxClasses;

import psn.design.pattern.designPatterns.NullObject.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
