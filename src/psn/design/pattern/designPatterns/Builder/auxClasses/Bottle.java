package psn.design.pattern.designPatterns.Builder.auxClasses;

import psn.design.pattern.designPatterns.Builder.Packing;

public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}