package psn.design.pattern.designPatterns.Command.auxClasses;

import psn.design.pattern.designPatterns.Command.Order;

public class BuyStock implements Order {

    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }

    @Override
    public String toString() {

        return " Taking the order to buy: " + abcStock.getName() + " | " + abcStock.getQuantity();
    }
}
