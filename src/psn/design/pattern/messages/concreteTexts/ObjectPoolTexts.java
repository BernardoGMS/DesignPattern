package psn.design.pattern.messages.concreteTexts;

import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsInterface;

public class ObjectPoolTexts implements TextsInterface {

    private TextsConstructor textsConstructor;

    @Override
    public void displayEnglishTexts() {

        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_OBJECT_POOL_TEXT_P1);
        this.textsConstructor.setCurrentTitle(MessagesEN.CASESTUDY_OBJECT_POOL.toUpperCase());
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_INTENT);
        this.textsConstructor.constructTextSubTitle();
        this.textsConstructor.constructText();

        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_PROBLEM);
        this.textsConstructor.constructTextSubTitle();
        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_OBJECT_POOL_TEXT_P2);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.CASESTUDY_OBJECT_POOL_TEXT_P3);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesEN.CASESTUDY_EXEMPLIFICATION);
        this.textsConstructor.constructTextSubTitle();
    }

    @Override
    public void displayPortugueseTexts() {

        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_OBJECT_POOL_TEXT_P1);
        this.textsConstructor.setCurrentTitle(MessagesPT.CASESTUDY_OBJECT_POOL.toUpperCase());
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_INTENT);
        this.textsConstructor.constructTextSubTitle();
        this.textsConstructor.constructText();

        this.textsConstructor.constructTextDown(1);

        this.textsConstructor.setCurrentSubTitle(MessagesPT.CASESTUDY_PROBLEM);
        this.textsConstructor.constructTextSubTitle();
        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_OBJECT_POOL_TEXT_P2);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.CASESTUDY_OBJECT_POOL_TEXT_P3);
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
