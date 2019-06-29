package psn.design.pattern.designPatterns.Prototype.auxClasses;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    private static Map<String, ColorMap> colorList = new HashMap<String, ColorMap>();

    static
    {
        colorList.put("blue", new BlueColor());
        colorList.put("red", new RedColor());
        colorList.put("white", new WhiteColor());
    }

    public static ColorMap getColor(String colorName)
    {
        return (ColorMap) colorList.get(colorName).clone();
    }
}
