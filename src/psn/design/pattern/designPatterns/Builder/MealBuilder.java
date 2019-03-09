package psn.design.pattern.designPatterns.Builder;

import psn.design.pattern.designPatterns.Builder.auxClasses.ChickenBurger;
import psn.design.pattern.designPatterns.Builder.auxClasses.Coke;
import psn.design.pattern.designPatterns.Builder.auxClasses.Pepsi;
import psn.design.pattern.designPatterns.Builder.auxClasses.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}