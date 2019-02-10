package psn.design.pattern.messages.concreteTexts;

import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsInterface;

public class BehavioralPatternTexts implements TextsInterface {

    private TextsConstructor textsConstructor;

    @Override
    public void displayEnglishTexts() {

        this.textsConstructor.setCurrentText(MessagesEN.TEXT_BEHAVIORALPATTERN_CONCEPT_P1);
        this.textsConstructor.setCurrentTitle(MessagesEN.TEXT_BEHAVIORALPATTERN_CONCEPT_TITLE);
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(3);
    }

    @Override
    public void displayPortugueseTexts() {

        this.textsConstructor.setCurrentText(MessagesPT.TEXT_BEHAVIORALPATTERN_CONCEPT_P1);
        this.textsConstructor.setCurrentTitle(MessagesPT.TEXT_BEHAVIORALPATTERN_CONCEPT_TITLE);
        this.textsConstructor.constructTextTitle();
        this.textsConstructor.constructText();
        this.textsConstructor.constructTextDown(3);
    }

    @Override
    public void setConstructor(TextsConstructor constructor) {

        this.textsConstructor = constructor;
    }
}
