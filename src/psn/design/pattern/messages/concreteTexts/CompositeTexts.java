package psn.design.pattern.messages.concreteTexts;

import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsInterface;

public class CompositeTexts implements TextsInterface {

    private TextsConstructor textsConstructor;

    @Override
    public void displayEnglishTexts() {

        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_COMPOSITE_TEXT_P1);
        this.textsConstructor.setCurrentTitle(MessagesEN.CASESTUDY_COMPOSITE.toUpperCase());
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_INTENT);
        this.textsConstructor.constructTextSubTitle();

        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_COMPOSITE_TEXT_P2);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_COMPOSITE_TEXT_P3);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_COMPOSITE_TEXT_P4);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_PROBLEM);
        this.textsConstructor.constructTextSubTitle();
        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_COMPOSITE_TEXT_P5);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_EXEMPLIFICATION);
        this.textsConstructor.constructTextSubTitle();
    }

    @Override
    public void displayPortugueseTexts() {

        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_COMPOSITE_TEXT_P1);
        this.textsConstructor.setCurrentTitle(MessagesPT.CASESTUDY_COMPOSITE.toUpperCase());
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_INTENT);
        this.textsConstructor.constructTextSubTitle();

        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_COMPOSITE_TEXT_P2);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_COMPOSITE_TEXT_P3);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_COMPOSITE_TEXT_P4);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_PROBLEM);
        this.textsConstructor.constructTextSubTitle();
        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_COMPOSITE_TEXT_P5);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_EXEMPLIFICATION);
        this.textsConstructor.constructTextSubTitle();
    }

    @Override
    public void setConstructor(TextsConstructor constructor) {

        this.textsConstructor = constructor;

    }
}
