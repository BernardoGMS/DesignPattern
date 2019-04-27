package psn.design.pattern.controllers;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.AbstractsView;

public class CaseStudyController implements AbstractsController {

    protected AbstractsView caseStudyView;
    private String[] options = new String[11];
    private Integer languageID;

    public CaseStudyController(AbstractsView caseStudyView) {

        this.caseStudyView = caseStudyView;
        this.languageID = caseStudyView.getLanguageID();

        options[0] = (this.languageID==0) ? MessagesEN.CASESTUDY_ABSTRACTFACTORY : MessagesPT.CASESTUDY_ABSTRACTFACTORY;
        options[1] = (this.languageID==0) ? MessagesEN.CASESTUDY_ADAPTER : MessagesPT.CASESTUDY_ADAPTER;
        options[2] = (this.languageID==0) ? MessagesEN.CASESTUDY_BRIDGE : MessagesPT.CASESTUDY_BRIDGE;
        options[3] = (this.languageID==0) ? MessagesEN.CASESTUDY_BUILDER : MessagesPT.CASESTUDY_BUILDER;
        options[4] = (this.languageID==0) ? MessagesEN.CASESTUDY_CHAIN_OF_RESPONSIBILITY : MessagesPT.CASESTUDY_CHAIN_OF_RESPONSIBILITY;
        options[5] = (this.languageID==0) ? MessagesEN.CASESTUDY_COMMAND : MessagesPT.CASESTUDY_COMMAND;
        options[6] = (this.languageID==0) ? MessagesEN.CASESTUDY_COMPOSITE : MessagesPT.CASESTUDY_COMPOSITE;
        options[7] = (this.languageID==0) ? MessagesEN.CASESTUDY_DECORATOR : MessagesPT.CASESTUDY_DECORATOR;
        options[8] = (this.languageID==0) ? MessagesEN.CASESTUDY_FACADE : MessagesPT.CASESTUDY_FACADE;
        options[9] = (this.languageID==0) ? MessagesEN.CASESTUDY_FACTORY_METHOD : MessagesPT.CASESTUDY_FACTORY_METHOD;
        options[10] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_BACK : MessagesPT.INITIAL_OPTIONS_BACK ;
    }

    @Override
    public void constructOptions(Integer languageID) {

        this.languageID = languageID;

        MenuInputScanner optionsList = new MenuInputScanner(options);
        optionsList.setMessage((this.languageID==0) ? MessagesEN.CASESTUDY_OPTIONS : MessagesPT.CASESTUDY_OPTIONS);

        this.caseStudyView.showOptions(optionsList);

    }
}
