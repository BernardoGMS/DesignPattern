package psn.design.pattern;

import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.views.AbstractsView;

public class DesignPattern {

    public static void main(String[] args) {

        AppSetter appSetter = new AppSetter();
        appSetter.initApp();
        Integer languageID = appSetter.getLanguageID();
        AbstractsView view = appSetter.getMainView();
        view.init(languageID);







        /*
        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Say your name!");

        String answer1 = prompt.getUserInput(question1);

        System.out.println("my name is: " + answer1);
        */


    }
}
