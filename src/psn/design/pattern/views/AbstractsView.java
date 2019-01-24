package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;

public interface AbstractsView {

    void init(Integer languageID);

    Integer getLanguageID();

    AppSetter getAppGetter();

    void setController(AbstractsController controller);

    void setView(AbstractsView view);

    void showOptions(MenuInputScanner menuInputScanner);


}
