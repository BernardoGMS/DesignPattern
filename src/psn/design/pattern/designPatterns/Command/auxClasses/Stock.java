package psn.design.pattern.designPatterns.Command.auxClasses;

public class Stock {

    private String name;
    private int quantity;

    public Stock(String name, int quantity) {

        System.out.println("Creating a stock of " + quantity + " " + name + "(s).");
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void buy(){
        System.out.println("Stock [ Name: "+ name + ", Quantity: " + quantity + " ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+ name +", Quantity: " + quantity + " ] sold");
    }
}
