package psn.design.pattern.controllers;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.AbstractsView;

public class ConceptsListController implements  AbstractsController{

    protected AbstractsView conceptsListView;
    private String[] options = new String[5];
    private Integer languageID;

    public ConceptsListController(AbstractsView conceptsListView) {

        this.conceptsListView = conceptsListView;
        this.languageID = conceptsListView.getLanguageID();

        options[0] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_OVERVIEW : MessagesPT.CONCEPTS_OPTIONS_OVERVIEW;
        options[1] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_CREATIONALPATTERNS : MessagesPT.CONCEPTS_OPTIONS_CREATIONALPATTERNS;
        options[2] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_STRUCTURAL: MessagesPT.CONCEPTS_OPTIONS_STRUCTURAL;
        options[3] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_BEHAVIORAL: MessagesPT.CONCEPTS_OPTIONS_BEHAVIORAL;
        options[4] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_BACK : MessagesPT.INITIAL_OPTIONS_BACK ;
    }

    @Override
    public void constructOptions(Integer languageID) {

        this.languageID = languageID;

        MenuInputScanner optionsList = new MenuInputScanner(options);
        optionsList.setMessage((this.languageID==0) ? MessagesEN.CONCEPTS_CONCRECT_OPTIONS : MessagesPT.CONCEPTS_CONCRECT_OPTIONS);

        this.conceptsListView.showOptions(optionsList);

    }
}
