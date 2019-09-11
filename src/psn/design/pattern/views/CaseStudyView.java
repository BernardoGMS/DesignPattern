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
        if (answer==22) {this.mainView.init(languageID);}

        if (answer==1) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(5).displayEnglishTexts();
                this.patternInterface.implementAbstractFactory(textsConstructor);
            }else{

                this.textsInterfaceMap.get(5).displayPortugueseTexts();
                this.patternInterface.implementAbstractFactory(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==2) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(7).displayEnglishTexts();
                this.patternInterface.implementAdapter(textsConstructor);
            }else{

                this.textsInterfaceMap.get(7).displayPortugueseTexts();
                this.patternInterface.implementAdapter(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==3) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(9).displayEnglishTexts();
                this.patternInterface.implementBridge(textsConstructor);
            }else{

                this.textsInterfaceMap.get(9).displayPortugueseTexts();
                this.patternInterface.implementBridge(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==4) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(11).displayEnglishTexts();
                this.patternInterface.implementBuilder(textsConstructor);
            }else{

                this.textsInterfaceMap.get(11).displayPortugueseTexts();
                this.patternInterface.implementBuilder(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==5) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(13).displayEnglishTexts();
                this.patternInterface.implementChainofResponsability(textsConstructor);
            }else{

                this.textsInterfaceMap.get(13).displayPortugueseTexts();
                this.patternInterface.implementChainofResponsability(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==6) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(15).displayEnglishTexts();
                this.patternInterface.implementCommand(textsConstructor);
            }else{

                this.textsInterfaceMap.get(15).displayPortugueseTexts();
                this.patternInterface.implementCommand(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==7) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(17).displayEnglishTexts();
                this.patternInterface.implementComposite(textsConstructor);
            }else{

                this.textsInterfaceMap.get(17).displayPortugueseTexts();
                this.patternInterface.implementComposite(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==8) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(19).displayEnglishTexts();
                this.patternInterface.implementDecorator(textsConstructor);
            }else{

                this.textsInterfaceMap.get(19).displayPortugueseTexts();
                this.patternInterface.implementDecorator(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==9) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(21).displayEnglishTexts();
                this.patternInterface.implementFacade(textsConstructor);
            }else{

                this.textsInterfaceMap.get(21).displayPortugueseTexts();
                this.patternInterface.implementFacade(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==10) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(23).displayEnglishTexts();
                this.patternInterface.implementFactoryMethod(textsConstructor);
            }else{

                this.textsInterfaceMap.get(23).displayPortugueseTexts();
                this.patternInterface.implementFactoryMethod(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==11) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(25).displayEnglishTexts();
                this.patternInterface.implementFlyweight(textsConstructor);
            }else{

                this.textsInterfaceMap.get(25).displayPortugueseTexts();
                this.patternInterface.implementFlyweight(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==12) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(27).displayEnglishTexts();
                this.patternInterface.implementInterpreter(textsConstructor);
            }else{

                this.textsInterfaceMap.get(27).displayPortugueseTexts();
                this.patternInterface.implementInterpreter(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==13) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(29).displayEnglishTexts();
                this.patternInterface.implementIterator(textsConstructor);
            }else{

                this.textsInterfaceMap.get(29).displayPortugueseTexts();
                this.patternInterface.implementIterator(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==14) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(31).displayEnglishTexts();
                this.patternInterface.implementMediator(textsConstructor);
            }else{

                this.textsInterfaceMap.get(31).displayPortugueseTexts();
                this.patternInterface.implementMediator(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==15) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(33).displayEnglishTexts();
                this.patternInterface.implementMemento(textsConstructor);
            }else{

                this.textsInterfaceMap.get(33).displayPortugueseTexts();
                this.patternInterface.implementMemento(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==16) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(35).displayEnglishTexts();
                this.patternInterface.implementNullObject(textsConstructor);
            }else{

                this.textsInterfaceMap.get(35).displayPortugueseTexts();
                this.patternInterface.implementNullObject(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==17) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(37).displayEnglishTexts();
                this.patternInterface.implementObjectPool(textsConstructor);
            }else{

                this.textsInterfaceMap.get(37).displayPortugueseTexts();
                this.patternInterface.implementObjectPool(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==18) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(39).displayEnglishTexts();
                this.patternInterface.implementObserver(textsConstructor);
            }else{

                this.textsInterfaceMap.get(39).displayPortugueseTexts();
                this.patternInterface.implementObserver(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==19) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(41).displayEnglishTexts();
                this.patternInterface.implementPrivateClassData(textsConstructor);
            }else{

                this.textsInterfaceMap.get(41).displayPortugueseTexts();
                this.patternInterface.implementPrivateClassData(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==20) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(43).displayEnglishTexts();
                this.patternInterface.implementPrototype(textsConstructor);
            }else{

                this.textsInterfaceMap.get(43).displayPortugueseTexts();
                this.patternInterface.implementPrototype(textsConstructor);
            }

            this.init(languageID);
        }

        if (answer==21) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsInterfaceMap.get(45).displayEnglishTexts();
                this.patternInterface.implementProxy(textsConstructor);
            }else{

                this.textsInterfaceMap.get(45).displayPortugueseTexts();
                this.patternInterface.implementProxy(textsConstructor);
            }

            this.init(languageID);
        }

    }
}
