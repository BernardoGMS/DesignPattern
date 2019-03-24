package psn.design.pattern.designPatterns.Command.auxClasses;

import psn.design.pattern.designPatterns.Command.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList = new ArrayList<Order>();

    public Broker() {

        System.out.println("Creating the broker object...");
    }

    public void takeOrder(Order order){

        System.out.println(order.toString());
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
