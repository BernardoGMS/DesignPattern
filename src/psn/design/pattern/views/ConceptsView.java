package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsConstructorEN;
import psn.design.pattern.messages.TextsConstructorPT;
import psn.design.pattern.messages.TextsInterface;

import java.util.Map;

public class ConceptsView implements AbstractsView {

    private Prompt prompt;
    private Integer languageID;
    private AppSetter appSetter;
    protected AbstractsController conceptsController;
    protected AbstractsView mainView;
    protected AbstractsView conceptsListView;
    protected TextsConstructor textsConstructor;
    protected Map<Integer, TextsInterface> textsInterfaceMap;

    public ConceptsView(Prompt prompt, AppSetter appSetter) {

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

    public void init(Integer languageID) {

        this.languageID = languageID;
        conceptsController.constructOptions(languageID);
    }

    public Integer getLanguageID() {

        return this.languageID;
    }

    @Override
    public AppSetter getAppGetter() {
        return this.appSetter;
    }

    public void setController(AbstractsController conceptsController) {

        this.conceptsController = conceptsController;
    }

    public void setView(AbstractsView mainView) {

        this.mainView = mainView;
        this.languageID = mainView.getLanguageID();
    }

    public void showOptions(MenuInputScanner optionsList) {

        int answer = this.prompt.getUserInput(optionsList);
        if (answer==11) {this.mainView.init(languageID);}

        if (answer==1) {

            this.conceptsListView = mainView.getAppGetter().getConceptsListView();
            this.conceptsListView.init(this.languageID);
        }

        if (answer==2) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(6).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(6).displayPortugueseTexts();
            }

        }

        if (answer==3) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(8).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(8).displayPortugueseTexts();
            }

        }

        if (answer==4) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(10).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(10).displayPortugueseTexts();
            }

        }

        if (answer==5) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(12).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(12).displayPortugueseTexts();
            }

        }

        if (answer==6) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(14).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(14).displayPortugueseTexts();
            }

        }

        if (answer==7) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(16).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(16).displayPortugueseTexts();
            }

        }

        if (answer==8) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(18).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(18).displayPortugueseTexts();
            }

        }

        if (answer==9) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(20).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(20).displayPortugueseTexts();
            }

        }

        if (answer==10) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(22).displayEnglishTexts();
            }else{

                this.textsInterfaceMap.get(22).displayPortugueseTexts();
            }

        }

    }
}
