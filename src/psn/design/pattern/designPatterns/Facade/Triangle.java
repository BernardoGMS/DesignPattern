package psn.design.pattern.designPatterns.Facade;

public class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle::draw()");
    }
}
