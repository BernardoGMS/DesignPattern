package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.*;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;

public class ConceptsListView implements AbstractsView {

    private Prompt prompt;
    private Integer languageID;
    private AppSetter appSetter;
    protected AbstractsView conceptsView;
    protected AbstractsController conceptsListController;
    protected TextsConstructor textsConstructor;

    public ConceptsListView(Prompt prompt, AppSetter appSetter) {

        this.prompt = prompt;
        this.appSetter = appSetter;
        this.languageID = appSetter.getLanguageID();
        if (this.languageID ==0){
            this.textsConstructor = new TextsConstructorEN();
        }else{
            this.textsConstructor = new TextsConstructorPT();
        }
    }

    @Override
    public void init(Integer languageID) {

        this.languageID = languageID;
        conceptsListController.constructOptions(languageID);
    }

    @Override
    public Integer getLanguageID() {

        return this.languageID;
    }

    @Override
    public AppSetter getAppGetter() {
        return this.appSetter;
    }

    @Override
    public void setController(AbstractsController controller) {

        this.conceptsListController = controller;
    }

    @Override
    public void setView(AbstractsView view) {

        this.conceptsView = view;
        this.languageID = this.conceptsView.getLanguageID();
    }

    @Override
    public void showOptions(MenuInputScanner optionsList) {

        int answer = this.prompt.getUserInput(optionsList);
        if (answer==5) {this.conceptsView.init(languageID);}

        if (answer==1) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P1);
                this.textsConstructor.setCurrentTitle(MessagesEN.TEXT_OVERVIEW_TITLE);
                this.textsConstructor.constructTextTitle();
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2_A);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2_B);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2_C);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P3);
                this.textsConstructor.constructText();
                this.textsConstructor.constructTextDown(3);

            }else{

                this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P1);
                this.textsConstructor.setCurrentTitle(MessagesPT.TEXT_OVERVIEW_TITLE);
                this.textsConstructor.constructTextTitle();
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2_A);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2_B);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2_C);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P3);
                this.textsConstructor.constructText();
                this.textsConstructor.constructTextDown(3);

            }

            this.init(languageID);

            /*
            this.conceptsListView = mainView.getAppGetter().getConceptsListView();
            this.conceptsListView.init(this.languageID);
            */
        }

    }
}
