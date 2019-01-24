package psn.design.pattern.views;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;
import psn.design.pattern.designPatterns.ConcretePatternInstantiation;
import psn.design.pattern.designPatterns.ImplPatternInterface;
import psn.design.pattern.messages.*;

public class CaseStudyView implements AbstractsView {

    private Prompt prompt;
    private Integer languageID;
    private AppSetter appSetter;
    protected AbstractsController caseStudyController;
    protected AbstractsView mainView;
    protected TextsConstructor textsConstructor;
    protected ImplPatternInterface patternInterface;

    public CaseStudyView(Prompt prompt, AppSetter appSetter) {

        this.prompt = prompt;
        this.languageID = appSetter.getLanguageID();
        this.patternInterface = new ConcretePatternInstantiation();
        if (this.languageID ==0){
            this.textsConstructor = new TextsConstructorEN();
        }else{
            this.textsConstructor = new TextsConstructorPT();
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
        if (answer==2) {this.mainView.init(languageID);}

        if (answer==1) {

            if (this.textsConstructor instanceof TextsConstructorEN) {

                this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_ABSTRACTFACTORY_TEXT_P1);
                this.textsConstructor.setCurrentTitle(MessagesEN.CASESTUDY_ABSTRACTFACTORY.toUpperCase());
                this.textsConstructor.constructTextTitle();
                this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_INTENT);
                this.textsConstructor.constructTextSubTitle();

                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_ABSTRACTFACTORY_TEXT_P2);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_ABSTRACTFACTORY_TEXT_P3);
                this.textsConstructor.constructText();
                this.textsConstructor.constructTextDown(1);

                this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_PROBLEM);
                this.textsConstructor.constructTextSubTitle();
                this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_ABSTRACTFACTORY_TEXT_P4);
                this.textsConstructor.constructText();
                this.textsConstructor.constructTextDown(1);

                this.patternInterface.implementAbstractFactory(textsConstructor);

            }else{

                this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_ABSTRACTFACTORY_TEXT_P1);
                this.textsConstructor.setCurrentTitle(MessagesPT.CASESTUDY_ABSTRACTFACTORY.toUpperCase());
                this.textsConstructor.constructTextTitle();
                this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_INTENT);
                this.textsConstructor.constructTextSubTitle();

                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_ABSTRACTFACTORY_TEXT_P2);
                this.textsConstructor.constructText();
                this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_ABSTRACTFACTORY_TEXT_P3);
                this.textsConstructor.constructText();
                this.textsConstructor.constructTextDown(1);

                this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_PROBLEM);
                this.textsConstructor.constructTextSubTitle();
                this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_ABSTRACTFACTORY_TEXT_P4);
                this.textsConstructor.constructText();
                this.textsConstructor.constructTextDown(1);

                this.patternInterface.implementAbstractFactory(textsConstructor);


            }

            this.init(languageID);
        }

    }
}
