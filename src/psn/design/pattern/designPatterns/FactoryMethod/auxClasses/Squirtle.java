package psn.design.pattern.designPatterns.FactoryMethod.auxClasses;

import psn.design.pattern.designPatterns.FactoryMethod.Pokemon;

public class Squirtle implements Pokemon {

        @Override
        public void callPokemon() {

            System.out.println("Squirtle called::callPokemon() method.");
        }

}
