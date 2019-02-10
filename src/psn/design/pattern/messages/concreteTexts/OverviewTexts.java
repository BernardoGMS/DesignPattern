package psn.design.pattern.messages.concreteTexts;

import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsInterface;

public class OverviewTexts implements TextsInterface {

    private TextsConstructor textsConstructor;

    @Override
    public void displayEnglishTexts() {

        this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P1);
        this.textsConstructor.setCurrentTitle(MessagesEN.TEXT_OVERVIEW_TITLE);
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2_A);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2_B);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P2_C);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesEN.TEXT_OVERVIEW_P3);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(3);

    }

    @Override
    public void displayPortugueseTexts() {

        this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P1);
        this.textsConstructor.setCurrentTitle(MessagesPT.TEXT_OVERVIEW_TITLE);
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2_A);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2_B);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P2_C);
        this.textsConstructor.constructText();
        this.textsConstructor.setCurrentText(MessagesPT.TEXT_OVERVIEW_P3);
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(3);

    }

    @Override
    public void setConstructor(TextsConstructor constructor) {

        this.textsConstructor = constructor;
    }
}
