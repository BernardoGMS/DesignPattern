package psn.design.pattern.designPatterns.Command.auxClasses;

import psn.design.pattern.designPatterns.Command.Order;

public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }

    @Override
    public String toString() {

        return " Taking the order to sell: " + abcStock.getName() + " | " + abcStock.getQuantity();
    }
}
