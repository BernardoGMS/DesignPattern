package psn.design.pattern.appSetter;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.controllers.*;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.concreteTexts.*;
import psn.design.pattern.messages.TextsInterface;
import psn.design.pattern.views.*;

import java.util.HashMap;
import java.util.Map;


public class AppSetter {

    private String[] languagesOptions = new String[3];
    private Prompt prompt = new Prompt(System.in, System.out);
    private Map<Integer, TextsInterface> textsInterfaceMap;
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

    public Map<Integer, TextsInterface> getTextsInfacesMap() {

        return textsInterfaceMap;
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

        this.textsInterfaceMap = new HashMap<>();
        textsInterfaceMap.put(1, new OverviewTexts());
        textsInterfaceMap.put(2, new CreationalPatternTexts());
        textsInterfaceMap.put(3, new StructuralPatternTexts());
        textsInterfaceMap.put(4, new BehavioralPatternTexts());
        textsInterfaceMap.put(5, new AbstractFactoryTexts());
        textsInterfaceMap.put(6, new AbstractFactoryConceptsTexts());
        textsInterfaceMap.put(7, new AdapterTexts());
        textsInterfaceMap.put(8, new AdapterConceptsTexts());
        textsInterfaceMap.put(9, new BridgeTexts());
        textsInterfaceMap.put(10, new BridgeConceptsTexts());
        textsInterfaceMap.put(11, new BuilderTexts());
        textsInterfaceMap.put(12, new BuilderConceptsTexts());
        textsInterfaceMap.put(13, new ChainOfResponsabilityTexts());
        textsInterfaceMap.put(14, new ChainOfResponsabilityConceptsTexts());

        this.mainView = new MainView(this.prompt,this);
        this.mainController = new MainController(this.mainView);
        this.mainView.setController(this.mainController);

        this.conceptsView = new ConceptsView(this.prompt, this);
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
