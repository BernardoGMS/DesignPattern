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
    }
}
