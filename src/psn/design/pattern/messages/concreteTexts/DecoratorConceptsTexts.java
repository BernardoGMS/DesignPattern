package psn.design.pattern.messages.concreteTexts;

import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsInterface;

public class DecoratorConceptsTexts implements TextsInterface {

    private TextsConstructor textsConstructor;

    @Override
    public void displayEnglishTexts() {

    }

    @Override
    public void displayPortugueseTexts() {

    }

    @Override
    public void setConstructor(TextsConstructor constructor) {

        this.textsConstructor = constructor;
    }
}
