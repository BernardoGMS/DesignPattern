package psn.design.pattern.designPatterns.Builder.auxClasses;

import psn.design.pattern.designPatterns.Builder.Packing;

public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}