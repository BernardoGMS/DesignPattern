package psn.design.pattern.controllers;

import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.AbstractsView;

public class CaseStudyController implements AbstractsController {

    protected AbstractsView caseStudyView;
    private String[] options = new String[2];
    private Integer languageID;

    public CaseStudyController(AbstractsView caseStudyView) {

        this.caseStudyView = caseStudyView;
        this.languageID = caseStudyView.getLanguageID();

        options[0] = (this.languageID==0) ? MessagesEN.CASESTUDY_ABSTRACTFACTORY : MessagesPT.CASESTUDY_ABSTRACTFACTORY;
        options[1] = (this.languageID==0) ? MessagesEN.INITIAL_OPTIONS_BACK : MessagesPT.INITIAL_OPTIONS_BACK ;
    }

    @Override
    public void constructOptions(Integer languageID) {

        this.languageID = languageID;

        MenuInputScanner optionsList = new MenuInputScanner(options);
        optionsList.setMessage((this.languageID==0) ? MessagesEN.CASESTUDY_OPTIONS : MessagesPT.CASESTUDY_OPTIONS);

        this.caseStudyView.showOptions(optionsList);

    }
}
