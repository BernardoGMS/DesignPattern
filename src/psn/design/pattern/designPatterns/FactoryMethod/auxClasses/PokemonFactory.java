package psn.design.pattern.designPatterns.FactoryMethod.auxClasses;

import psn.design.pattern.designPatterns.FactoryMethod.Pokemon;

public class PokemonFactory {

    //use getPkemon method to get object of type pokemon
    public Pokemon getPokemon(String pokeType){
        if(pokeType == null){
            return null;
        }
        if(pokeType.equalsIgnoreCase("PIKACHU")){
            return new Pikachu();

        } else if(pokeType.equalsIgnoreCase("SQUIRTLE")){
            return new Squirtle();

        } else if(pokeType.equalsIgnoreCase("CHARIZARD")){
            return new Charizard();
        }

        return null;
    }
}
