package psn.design.pattern.designPatterns.FactoryMethod.auxClasses;

import psn.design.pattern.designPatterns.FactoryMethod.Pokemon;

public class Pikachu implements Pokemon {

    @Override
    public void callPokemon() {

        System.out.println("Pikachu called::callPokemon() method.");
    }
}
