package psn.design.pattern.controllers;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.AbstractsView;

public class MainController implements AbstractsController{

    protected AbstractsView mainView;
    private String[] options = new String[3];
    private Integer languageID;

    public MainController(AbstractsView mainView) {

        this.mainView = mainView;
        this.languageID = mainView.getLanguageID();

        options[0] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_SHOWCONCEPTS : MessagesPT.INITIAL_OPTIONS_SHOWCONCEPTS;
        options[1] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_CASESTUDY : MessagesPT.INITIAL_OPTIONS_CASESTUDY ;
        options[2] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_BACK : MessagesPT.INITIAL_OPTIONS_BACK ;
    }

    public void constructOptions(Integer languageID) {

        this.languageID = languageID;

        MenuInputScanner optionsList = new MenuInputScanner(options);
        optionsList.setMessage((this.languageID==0) ? MessagesEN.INITIAL_QUESTION : MessagesPT.INITIAL_QUESTION);

        this.mainView.showOptions(optionsList);

    }
}
