package psn.design.pattern;

import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.string.StringInputScanner;

public class DesignPattern {

    public static void main(String[] args) {

        System.out.println("Hello");

        Prompt prompt = new Prompt(System.in, System.out);

        StringInputScanner question1 = new StringInputScanner();
        question1.setMessage("Say your name!");

        String answer1 = prompt.getUserInput(question1);

        System.out.println("my name is: " + answer1);



    }
}
