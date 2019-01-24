package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;

public class ConceptsView implements AbstractsView {

    private Prompt prompt;
    private Integer languageID;
    private AppSetter appSetter;
    protected AbstractsController conceptsController;
    protected AbstractsView mainView;
    protected AbstractsView conceptsListView;

    public ConceptsView(Prompt prompt) {

        this.prompt = prompt;
    }

    public void init(Integer languageID) {

        this.languageID = languageID;
        conceptsController.constructOptions(languageID);
    }

    public Integer getLanguageID() {

        return this.languageID;
    }

    @Override
    public AppSetter getAppGetter() {
        return this.appSetter;
    }

    public void setController(AbstractsController conceptsController) {

        this.conceptsController = conceptsController;
    }

    public void setView(AbstractsView mainView) {

        this.mainView = mainView;
        this.languageID = mainView.getLanguageID();
    }

    public void showOptions(MenuInputScanner optionsList) {

        int answer = this.prompt.getUserInput(optionsList);
        if (answer==4) {this.mainView.init(languageID);}

        if (answer==1) {

            this.conceptsListView = mainView.getAppGetter().getConceptsListView();
            this.conceptsListView.init(this.languageID);
        }
    }
}
