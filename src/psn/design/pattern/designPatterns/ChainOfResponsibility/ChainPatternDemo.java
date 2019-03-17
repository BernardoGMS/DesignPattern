package psn.design.pattern.designPatterns.ChainOfResponsibility;

import psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses.ConsoleLogger;
import psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses.ErrorLogger;
import psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses.FileLogger;

public class ChainPatternDemo {

    public static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }
}
