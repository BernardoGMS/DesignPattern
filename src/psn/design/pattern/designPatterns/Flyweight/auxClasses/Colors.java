package psn.design.pattern.designPatterns.Flyweight.auxClasses;

public class Colors {

    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

    public static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    public static int getRandomHorizontalCoord() {
        return (int)(Math.random()*100 );
    }
    public static int getRandomVerticalCoord() {
        return (int)(Math.random()*100);
    }

    public static String[] getColors() {
        return colors;
    }
}
