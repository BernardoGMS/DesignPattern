package psn.design.pattern.controllers;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.AbstractsView;

public class ConceptsController implements AbstractsController {

    protected AbstractsView conceptsView;
    private String[] options = new String[16];
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
        options[6] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_COMMAND : MessagesPT.CONCEPTS_OPTIONS_COMMAND;
        options[7] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_COMPOSITE : MessagesPT.CONCEPTS_OPTIONS_COMPOSITE;
        options[8] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_DECORATOR : MessagesPT.CONCEPTS_OPTIONS_DECORATOR;
        options[9] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_FACADE : MessagesPT.CONCEPTS_OPTIONS_FACADE;
        options[10] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_FACTORY_METHOD : MessagesPT.CONCEPTS_OPTIONS_FACTORY_METHOD;
        options[11] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_FLYWEIGHT : MessagesPT.CONCEPTS_OPTIONS_FLYWEIGHT;
        options[12] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_INTERPRETER : MessagesPT.CONCEPTS_OPTIONS_INTERPRETER;
        options[13] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_ITERATOR : MessagesPT.CONCEPTS_OPTIONS_ITERATOR;
        options[14] = (this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS_MEDIATOR : MessagesPT.CONCEPTS_OPTIONS_MEDIATOR;
        options[15] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_BACK : MessagesPT.INITIAL_OPTIONS_BACK ;

    }

    @Override
    public void constructOptions(Integer languageID) {

        this.languageID = languageID;

        MenuInputScanner optionsList = new MenuInputScanner(options);
        optionsList.setMessage((this.languageID==0) ? MessagesEN.CONCEPTS_OPTIONS : MessagesPT.CONCEPTS_OPTIONS);

        this.conceptsView.showOptions(optionsList);
    }
}
