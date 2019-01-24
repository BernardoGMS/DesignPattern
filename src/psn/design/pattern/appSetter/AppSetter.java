package psn.design.pattern.appSetter;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.controllers.*;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.views.*;


public class AppSetter {

    private String[] languagesOptions = new String[3];
    private Prompt prompt = new Prompt(System.in, System.out);
    private Integer languageID;
    private AbstractsView mainView;
    private AbstractsView conceptsView;
    private AbstractsView conceptsListView;
    private AbstractsView caseStudyView;
    private AbstractsController mainController;
    private AbstractsController conceptsController;
    private AbstractsController conceptsListController;
    private AbstractsController caseStudyController;

    public AppSetter() {

        this.languagesOptions[0] = "English";
        this.languagesOptions[1] = "Português";
        this.languagesOptions[2] = "Quit /Sair";
    }

    public AbstractsView getMainView() {

        return mainView;
    }

    public AbstractsView getConceptsView() {

        return conceptsView;
    }

    public AbstractsView getCaseStudyView() {

        return caseStudyView;
    }

    public AbstractsView getConceptsListView() {

        return conceptsListView;
    }

    public AbstractsController getConceptsController() {

        return conceptsController;
    }

    public AbstractsController getCaseStudyController() {

        return caseStudyController;
    }

    public Integer getLanguageID() {

        return languageID;
    }

    public Prompt initApp() {

        MenuInputScanner languageList = new MenuInputScanner(languagesOptions);
        languageList.setMessage(MessagesEN.LANGUAGES_OPTIONS+ "/ "+ MessagesPT.LANGUAGES_OPTIONS);

        int answer = prompt.getUserInput(languageList);
        this.languageID = answer-1;

        this.mainView = new MainView(this.prompt,this);
        this.mainController = new MainController(this.mainView);
        this.mainView.setController(this.mainController);

        this.conceptsView = new ConceptsView(this.prompt);
        this.conceptsView.setView(mainView);
        this.conceptsController = new ConceptsController(conceptsView);
        this.conceptsView.setController(conceptsController);

        this.mainView.setView(conceptsView);

        this.conceptsListView = new ConceptsListView(this.prompt,this);
        this.conceptsListView.setView(conceptsView);
        this.conceptsListController = new ConceptsListController(conceptsListView);
        this.conceptsListView.setController(conceptsListController);

        this.caseStudyView= new CaseStudyView(this.prompt, this);
        this.caseStudyView.setView(mainView);
        this.caseStudyController = new CaseStudyController(caseStudyView);
        this.caseStudyView.setController(caseStudyController);

        return prompt;
    }
}
