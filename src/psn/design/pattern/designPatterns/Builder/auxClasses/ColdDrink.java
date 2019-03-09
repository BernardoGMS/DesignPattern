package psn.design.pattern.designPatterns.Builder.auxClasses;

import psn.design.pattern.designPatterns.Builder.Item;
import psn.design.pattern.designPatterns.Builder.Packing;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
