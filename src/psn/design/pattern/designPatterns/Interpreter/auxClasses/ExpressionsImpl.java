package psn.design.pattern.designPatterns.Interpreter.auxClasses;

import psn.design.pattern.designPatterns.Interpreter.Expression;

public class ExpressionsImpl {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

}
