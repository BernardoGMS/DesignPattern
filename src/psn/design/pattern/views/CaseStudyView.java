package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;
import psn.design.pattern.designPatterns.ConcretePatternInstantiation;
import psn.design.pattern.designPatterns.ImplPatternInterface;
import psn.design.pattern.messages.*;
import psn.design.pattern.messages.TextsInterface;

import java.util.Map;

public class CaseStudyView implements AbstractsView {

    private Prompt prompt;
    private Integer languageID;
    private AppSetter appSetter;
    protected AbstractsController caseStudyController;
    protected AbstractsView mainView;
    protected TextsConstructor textsConstructor;
    protected ImplPatternInterface patternInterface;
    protected Map<Integer, TextsInterface> textsInterfaceMap;

    public CaseStudyView(Prompt prompt, AppSetter appSetter) {

        this.prompt = prompt;
        this.languageID = appSetter.getLanguageID();
        this.patternInterface = new ConcretePatternInstantiation();
        this.textsInterfaceMap = appSetter.getTextsInfacesMap();
        if (this.languageID ==0){
            this.textsConstructor = new TextsConstructorEN();
        }else{
            this.textsConstructor = new TextsConstructorPT();
        }
        for (TextsInterface t : textsInterfaceMap.values()) {
            t.setConstructor(this.textsConstructor);
        }
    }

    @Override
    public void init(Integer languageID) {

        this.languageID = languageID;
        caseStudyController.constructOptions(languageID);
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

        this.caseStudyController = controller;
    }

    @Override
    public void setView(AbstractsView view) {

        this.mainView = view;
    }

    @Override
    public void showOptions(MenuInputScanner optionsList) {

        int answer = this.prompt.getUserInput(optionsList);
        if (answer==3) {this.mainView.init(languageID);}

        if (answer==1) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(1).displayEnglishTexts();
                this.patternInterface.implementAbstractFactory(textsConstructor);
            }else{

                this.textsInterfaceMap.get(1).displayPortugueseTexts();
                this.patternInterface.implementAbstractFactory(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==2) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(6).displayEnglishTexts();
                this.patternInterface.implementAdapter(textsConstructor);
            }else{

                this.textsInterfaceMap.get(6).displayPortugueseTexts();
                this.patternInterface.implementAdapter(textsConstructor);
            }

            this.init(languageID);
        }

    }
}
