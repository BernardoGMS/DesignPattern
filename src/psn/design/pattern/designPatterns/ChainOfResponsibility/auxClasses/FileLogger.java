package psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses;

import psn.design.pattern.designPatterns.ChainOfResponsibility.AbstractLogger;

public class FileLogger extends AbstractLogger {

    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}