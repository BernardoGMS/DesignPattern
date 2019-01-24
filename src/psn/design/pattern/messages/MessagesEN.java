package psn.design.pattern.messages;

public class MessagesEN {

    public static String LANGUAGES_OPTIONS = "Please pick a language!";
    public static String INITIAL_QUESTION = "Please pick an option:";
    public static String CONCEPTS_OPTIONS = "Please pick a concept to explore:";
    public static String CASESTUDY_OPTIONS = "Please pick a case of study to explore:";
    public static String CONCEPTS_CONCRECT_OPTIONS = "Please pick a general concept to be displayed:";

    public static String INITIAL_OPTIONS_SHOWCONCEPTS = "Show the concepts!";
    public static String INITIAL_OPTIONS_CASESTUDY = "Show case of study!";
    public static String INITIAL_OPTIONS_BACK = "Go back!";

    public static String CONCEPTS_OPTIONS_GENERAL = "General concepts.";
    public static String CONCEPTS_OPTIONS_ABSTRACTFACTORY = "Abstract Factory Pattern.";
    public static String CONCEPTS_OPTIONS_BUILDER = "Builder Pattern.";

    public static String CONCEPTS_OPTIONS_OVERVIEW = "Overview.";
    public static String CONCEPTS_OPTIONS_CREATIONALPATTERNS = "Creational Patterns.";
    public static String CONCEPTS_OPTIONS_STRUCTURAL = "Structural Patterns.";
    public static String CONCEPTS_OPTIONS_BEHAVIORAL = "Behavioral Patterns.";

    public static String CASESTUDY_ABSTRACTFACTORY = "Abstract Factory.";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P1 = " * Provide an interface for creating families of related or" +
            "dependent objects without specifying their concrete classes;";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P2 = " * A hierarchy that encapsulates: many possible 'platforms'" +
            ", and the construction of a suite of 'products';";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P3 = " * The new operator considered harmful.";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P4 = "  If an application is to be portable, it needs to encapsulates" +
            " platform dependencies. These 'platforms' might include: windowing system, operating system, database, etc." +
            " Too often, this encapsulation is not engineered in advance, and lots of #ifdef case statements with options" +
            " for all currently supported platforms begin to procreate like rabbits throughout the code.";

    // Messages used during the case of study implementation - ABSTRACT FACTORY
    public static String CASESTUDY_CREATE_FACTORIES = " 1. Creating two cookies factories using the static method of the class" +
            " FactoryMaker...";
    public static String CASESTUDY_CREATE_PRODUCTS_FACA = " 2. Creating 2 different (Choc and Maria) of products using factory A, where" +
            " both product are of type A...";
    public static String CASESTUDY_CREATE_PRODUCTS_FACB = " 3. Creating 3 different (Cuetara, Oreo and Cream) of products using factory B" +
            " where product C is of type A and others of type B...";

    public static String CASESTUDY_INTENT = "INTENT";
    public static String CASESTUDY_PROBLEM = "PROBLEM";

    public static String TEXT_OVERVIEW_TITLE = "OVERVIEW";
    public static String TEXT_OVERVIEW_P1 = "In software engineering, a design pattern is a general repeatable solution to a commonly " +
            "occurring problem in software design. A design pattern isn't that can be transformed directly into code. It is a description" +
            " or template for how to solve a problem that can be used in many different situations.";
    public static String TEXT_OVERVIEW_P2 = "Design patterns are useful because:";
    public static String TEXT_OVERVIEW_P2_A = "* Can speed up the development process by providing tested, proven development paradigms" +
            ". Effective software design requires considering issues that maynot become visible until later in the implementation;";
    public static String TEXT_OVERVIEW_P2_B = "* Reusing design patterns helps to prevent subtle issues that can cause major problems" +
            " and improves code readability for coders and architects familiar with the patterns;";
    public static String TEXT_OVERVIEW_P2_C = "* Patterns allow developers to communicate using well-known, well understood names" +
            " for software interactions. Common design patterns can be improved over time, making tham more robust than adhoc designs.";

    public static String TEXT_OVERVIEW_P3 = "However These techniques are difficult to apply to a broader range of problems. Design patterns" +
            " provide general solutions, documented in a format that doesn't require specifics tied to a particular problem.";

    public static String HALL_UP_DOWN = "************************************************************************************";

    public static String QUIT_MESSAGE = "See you another time!";
}
