package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.*;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;

import java.util.Map;

public class ConceptsListView implements AbstractsView {

    private Prompt prompt;
    private Integer languageID;
    private AppSetter appSetter;
    protected AbstractsView conceptsView;
    protected AbstractsController conceptsListController;
    protected TextsConstructor textsConstructor;
    protected Map<Integer, TextsInterface> textsInterfaceMap;

    public ConceptsListView(Prompt prompt, AppSetter appSetter) {

        this.prompt = prompt;
        this.appSetter = appSetter;
        this.languageID = appSetter.getLanguageID();
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

                    this.textsInterfaceMap.get(1).displayEnglishTexts();
                }else{

                    this.textsInterfaceMap.get(1).displayPortugueseTexts();
                }

            }

        if (answer==2) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(2).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(2).displayPortugueseTexts();
            }
        }

        if (answer==3) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(3).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(3).displayPortugueseTexts();
            }
        }

        if (answer==4) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(4).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(4).displayPortugueseTexts();
            }
        }

        this.init(languageID);
    }
}
