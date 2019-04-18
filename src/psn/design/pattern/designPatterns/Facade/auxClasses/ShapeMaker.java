package psn.design.pattern.designPatterns.Facade.auxClasses;

import psn.design.pattern.designPatterns.Facade.Circle;
import psn.design.pattern.designPatterns.Facade.Rectangle;
import psn.design.pattern.designPatterns.Facade.Shape;
import psn.design.pattern.designPatterns.Facade.Triangle;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }

    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawTriangle(){
        triangle.draw();
    }
}
