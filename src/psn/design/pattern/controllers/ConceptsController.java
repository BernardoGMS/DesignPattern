package psn.design.pattern.controllers;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.AbstractsView;

public class ConceptsController implements AbstractsController {

    protected AbstractsView conceptsView;
    private String[] options = new String[7];
    private Integer languageID;

    public ConceptsController(AbstractsView conceptsView) {

        this.conceptsView = conceptsView;
        this.languageID = conceptsView.getLanguageID();

        options[0] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_GENERAL : MessagesPT.CONCEPTS_OPTIONS_GENERAL;
        options[1] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_ABSTRACT_FACTORY : MessagesPT.CONCEPTS_OPTIONS_ABSTRACT_FACTORY;
        options[2] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_ADAPTER : MessagesPT.CONCEPTS_OPTIONS_ADAPTER;
        options[3] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_BRIDGE : MessagesPT.CONCEPTS_OPTIONS_BRIDGE;
        options[4] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_BUILDER : MessagesPT.CONCEPTS_OPTIONS_BUILDER;
        options[5] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_CHAIN_OF_RESPONSIBILITY : MessagesPT.CONCEPTS_OPTIONS_CHAIN_OF_RESPONSIBILITY;
        options[6] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_BACK : MessagesPT.INITIAL_OPTIONS_BACK ;

    }

    @Override
    public void constructOptions(Integer languageID) {

        this.languageID = languageID;

        MenuInputScanner optionsList = new MenuInputScanner(options);
        optionsList.setMessage((this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS : MessagesPT.CONCEPTS_OPTIONS);

        this.conceptsView.showOptions(optionsList);
    }
}