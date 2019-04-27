package psn.design.pattern.designPatterns.FactoryMethod.auxClasses;

import psn.design.pattern.designPatterns.FactoryMethod.Pokemon;

public class Charizard implements Pokemon {

    @Override
    public void callPokemon() {

        System.out.println("Charizard called::callPokemon() method.");
    }
}
