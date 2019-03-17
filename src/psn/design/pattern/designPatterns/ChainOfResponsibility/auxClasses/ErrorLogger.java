package psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses;

import psn.design.pattern.designPatterns.ChainOfResponsibility.AbstractLogger;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
