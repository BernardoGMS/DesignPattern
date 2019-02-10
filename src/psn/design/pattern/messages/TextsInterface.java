package psn.design.pattern.messages;

import psn.design.pattern.messages.TextsConstructor;

public interface TextsInterface {

    void displayEnglishTexts();

    void displayPortugueseTexts();

    void setConstructor(TextsConstructor constructor);
}
