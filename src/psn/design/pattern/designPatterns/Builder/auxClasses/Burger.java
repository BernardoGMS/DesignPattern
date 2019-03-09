package psn.design.pattern.designPatterns.Builder.auxClasses;

import psn.design.pattern.designPatterns.Builder.Item;
import psn.design.pattern.designPatterns.Builder.Packing;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
