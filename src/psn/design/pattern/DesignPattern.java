package psn.design.pattern;

import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.designPatterns.Proxy.SocketInterface;
import psn.design.pattern.designPatterns.Proxy.auxClasses.SocketProxy;
import psn.design.pattern.views.AbstractsView;

import java.util.Scanner;

public class DesignPattern {

    public static void main(String[] args) {

        AppSetter appSetter = new AppSetter();
        appSetter.initApp();
        Integer languageID = appSetter.getLanguageID();
        AbstractsView view = appSetter.getMainView();
        view.init(languageID);
    }
}
