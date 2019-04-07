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
    public static String CONCEPTS_OPTIONS_ABSTRACT_FACTORY = "Abstract Factory Pattern.";
    public static String CONCEPTS_OPTIONS_ADAPTER = "Adapter Pattern.";
    public static String CONCEPTS_OPTIONS_BRIDGE = "Bridge Pattern.";
    public static String CONCEPTS_OPTIONS_BUILDER = "Builder Pattern.";
    public static String CONCEPTS_OPTIONS_CHAIN_OF_RESPONSIBILITY = "Chain of responsibility Pattern.";
    public static String CONCEPTS_OPTIONS_COMMAND = "Command Pattern.";
    public static String CONCEPTS_OPTIONS_COMPOSITE = "Composite Pattern.";

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

    public static String CASESTUDY_ADAPTER = "Adapter.";
    public static String CASESTUDY_ADAPTER_TEXT_P1 = " * Convert the interface of a class into another interface clients expect." +
            " Adapter lets classes work together that couldn't otherwise because of incompatible interfaces;";
    public static String CASESTUDY_ADAPTER_TEXT_P2 = " * Wrap an existing class with a new interface;";
    public static String CASESTUDY_ADAPTER_TEXT_P3 = " * Impedance match an old component to a new system.";
    public static String CASESTUDY_ADAPTER_TEXT_P4 = "  An 'off the shelf' component offers compelling functionality that you would" +
            "like to reuse, but its 'views of the world' is not compatible with the philosophy and architecture of the system " +
            "currently being developed.";

    public static String CASESTUDY_BRIDGE = "Bridge.";
    public static String CASESTUDY_NEED_SCHEME = "-- (NEED A SCHEME) --";
    public static String CASESTUDY_NEED_OTHER_SCHEME = "-- (ANOTHER SCHEME) --";
    public static String CASESTUDY_BRIDGE_TEXT_P1 = " * Decouple an abstraction from its implementation so that the two can vary" +
            " independently;";
    public static String CASESTUDY_BRIDGE_TEXT_P2 = " * Publish interface in an inheritance hierarchy, and bury implementation" +
            " in its own inheritance hierarchy;";
    public static String CASESTUDY_BRIDGE_TEXT_P3 = " * Beyond encapsulation, to insulation;";
    public static String CASESTUDY_BRIDGE_TEXT_P4 = " 'Hardening of the software arteries' has occurred by using subclassing" +
            " of an abstract base class to provide alternative implementations. This locks in compile-time binding between" +
            " interface and implementation. The abstraction and implementation cannot be independently extended or composed.";
    public static String CASESTUDY_BRIDGE_TEXT_P5_1 = " Consider the domain of 'thread scheduling':";
    public static String CASESTUDY_BRIDGE_TEXT_P5_2 = " There are two types of thread schedules, and two types of operating systems " +
            "or 'platforms'. Given this approach to specialization, we have to define a class for each permutation of these two " +
            "dimensions. If we add a new platform (say... JVM), what would our hierarchy look like?";
    public static String CASESTUDY_BRIDGE_TEXT_P5_3 = " What if we have three kinds of thread schedules, and four kinds" +
            " of platforms? What if we had five kinds of thread schedules, and ten kinds of platforms? The number of classes we" +
            " would to define is the product of the number of scheduling schemes and the number of platforms. ";
    public static String CASESTUDY_BRIDGE_TEXT_P5_4 = " The Bridge design pattern proposes refactoring this exponentially explosive " +
            "inheritance hierarchy into two orthogonal hierarchies - one for platform-independent abstractions, and the other for " +
            "platform-dependent implementations.";

    public static String CASESTUDY_BUILDER = "Builder.";
    public static String CASESTUDY_BUILDER_TEXT_P1 = " * Separete the construction of a complex object from its representation" +
            " so that the same construction process can create different representations;";
    public static String CASESTUDY_BUILDER_TEXT_P2 = " * Parse a complex representation, create one of several targets;";
    public static String CASESTUDY_BUILDER_TEXT_P3 = " An application needs to create the elements of a complex aggregate. The" +
            " specification for the aggregate exists on secondary storage and one of many representations needs to be built" +
            " in primary storage.";

    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY = "Chain of Responsibility.";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P1 = " * Avoid coupling the sender of a request to its receiver by giving" +
            " more than one chance to handle the request. Chain the receiving objects and pass the request along the chain until an object" +
            " handles it;";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P2 = " * Launch-and-leave requests with a single proceeding pipeline that" +
            " contains many possible handlers;";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P3 = " * An object-oriented linked list with recursive traversal.";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P4 = " There is a potentially variable number of 'handler' or 'processing " +
            "element' or 'node' objects, and a stream of requests that must be handled. Need to efficiently process the requests without" +
            " hard-wiring handler relationships and precedence, or request-to-handler mappings.";

    public static String CASESTUDY_COMMAND = "Command.";
    public static String CASESTUDY_COMMAND_TEXT_P1 = " * Encapsulate a request as an object, thereby letting you parameterize clients" +
            " with different requests, queue or log requests, and support undoable operations;";
    public static String CASESTUDY_COMMAND_TEXT_P2 = " * Promote 'invocantion of a method on an object' to full object status;";
    public static String CASESTUDY_COMMAND_TEXT_P3 = " * An object-oriented callback.";
    public static String CASESTUDY_COMMAND_TEXT_P4 = " Need to issue requests to objects without knowing anything about the operation" +
            " being requested or the receiver of the request.";

    public static String CASESTUDY_COMPOSITE= "Composite.";
    public static String CASESTUDY_COMPOSITE_TEXT_P1 = " * Compose objects into tree structures to represent whole-part hierarchies." +
            " Composite lets clients treat individual objects and compositions of objects uniformly;";
    public static String CASESTUDY_COMPOSITE_TEXT_P2 = " * Recursive composition;";
    public static String CASESTUDY_COMPOSITE_TEXT_P3 = " * 'Directories contain entries, each of which could be a directory';";
    public static String CASESTUDY_COMPOSITE_TEXT_P4 = " * One-to-many 'has a' up the 'is a' hierarchy;";
    public static String CASESTUDY_COMPOSITE_TEXT_P5 = " Application needs to manipulate a hierarchical collection of 'primitive' and" +
            " 'composite' objects. Processing of a primitive objects is handled own way, and processing of a composite object is handeled" +
            " differently. Having to query the 'type' of each object before attempting to process it is not desirable.";

    // Messages used during the case of study implementation - ABSTRACT FACTORY
    public static String CASESTUDY_CREATE_FACTORIES = " 1. Creating two cookies factories using the static method of the class" +
            " FactoryMaker...";
    public static String CASESTUDY_CREATE_PRODUCTS_FACA = " 2. Creating 2 different (Choc and Maria) of products using factory A, where" +
            " both product are of type A...";
    public static String CASESTUDY_CREATE_PRODUCTS_FACB = " 3. Creating 3 different (Cuetara, Oreo and Cream) of products using factory B" +
            " where product C is of type A and others of type B...";
    public static String CASESTUDY_ABSTRACTFACTORY_DOING_OPERATIONS = " 4. Making some operations with the products:";

    // Messages used during the case of study implementation - ADAPTER
    public static String CASESTUDY_CREATE_AUDIOPLAYER = "1. Creating audio players ONE and TWO. Both support .mp3 files only!";
    public static String CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_ONE = "2.1 Playing song 'only you.mp3' on audio player ONE...";
    public static String CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_TWO = "2.2 Playing song 'need to know.mp3' on audio player TWO...";
    public static String CASESTUDY_PLAY_MP4_FILE_AUDIOPLAYER_ONE = "3.1 Playing song 'only you.mp4' on audio player ONE, which " +
            "need to be adapted by using a method to do the job. Until now it was used the interface MediaPlayer instead of the " +
            "current AdvancedMediaPlayer which provides the ability to read .mp4 and .vlc files.";
    public static String CASESTUDY_PLAY_VLC_FILE_AUDIOPLAYER_TWO = "3.2 Playing song 'judas.vlc' on audio player TWO, by using the" +
            " same process used right before.";
    public static String CASESTUDY_PLAY_AVI_FILE_AUDIOPLAYER_TWO = "4. Trying to play file 'love, simon.avi' on audio player TWO," +
            " which is impossible because the audio player does not have a specific adapter to provide it the ability of reading" +
            " such files type.";

    // Messages used during the case of study implementation - BRIDGE
    public static String CASESTUDY_EXPLANATION_CIRCLE_STRUCTURE = "0. In that example there is an interface API which" +
            " is owned by the class Circle (through Shape abstract class). The concrete classes, which are more specific," +
            " i.e., have specific colors, implement DrawAPI interface and are instantiated by creating a Circle object which" +
            " extends from shape abstract class and can use method drawCircle overriding the DrawAPI;";
    public static String CASESTUDY_CREATE_RED_CIRCLE = "1. Creating a red circle (RedCircle class)...";
    public static String CASESTUDY_CREATE_PURPLE_CIRCLE = "2. Creating a purple circle (PurpleCircle class)...";
    public static String CASESTUDY_CREATE_BLUE_CIRCLE = "3. Creating a blue circle (BlueCircle class)...";
    public static String CASESTUDY_DRAW_CIRCLES = "4. Drawing all the circles.";

    // Messages used during the case of study implementation - BUILDER
    public static String CASESTUDY_CREATE_MEALBUILDER = "1. The Meals Builder is being created: this class has a set of" +
            " methods that are called according clients requirements...";
    public static String CASESTUDY_VEGMEAL_1 = "2.1 First client asked for a Veg Meal which is composed by one vegburger" +
            " and a coke...";
    public static String CASESTUDY_VEGMEAL_2 = "2.2 But he also asked for an additional coke (with such pattern one can" +
            " add any item we want, providing to the client the possibility of asking for whatever he wants, and in the " +
            "final the total price is automatically computed).";
    public static String CASESTUDY_NONVEGMEAL_1 = "3. Second client just asked for a Non-vegmeal...";

    // Messages used during the case of study implementation - CHAIN OF RESPONSIBILITY
    public static String CASESTUDY_CONSTRUCT_CHAIN_OF_LOGGERS = "1. Firstly, the chain logger is being construct. This class, which has" +
            " a static method is responsible to create the loggers and put it in the chain through the method .setNextLogger. In that" +
            " example, we are creating a total of 3 loggers, one is INFO, another is DEBUG and at last we've an ERROR;";
    public static String CASESTUDY_PRINTING_INFORMATIONS_LEVEL_1 = "2.1 Then the messages will be printed according the level of each" +
            " logger included in the chain: first the INFO...";
    public static String CASESTUDY_PRINTING_INFORMATIONS_LEVEL_2 = "2.2 Then the DEBUG message...";
    public static String CASESTUDY_PRINTING_INFORMATIONS_LEVEL_3 = "2.3 And at last the ERROR message!";

    // Messages used during the case of study implementation - COMMAND
    public static String CASESTUDY_STOCK_CREATION = "1. In first place, we are creating three types of stocks: bananas," +
            " strawberries and oranges, with different quantities, and it is represented by the class Stock with a method for" +
            " buying stock and other to sell it. This method is invoked just within the method execute of Order interface" +
            " which differs according the class and implementation that implements the interface. Indeed the method is totally encapsulated.";
    public static String CASESTUDY_BUYSELL_BANANAS_ORDER_EXECUTION = "2.1 Then we execute the orders to buy and sell bananas...";
    public static String CASESTUDY_BUYSELL_STRAWBERRIES_ORDER_EXECUTION = "2.2 The order to buy and sell strawberries...";
    public static String CASESTUDY_BUYSELL_ORANGES_ORDER_EXECUTION = "2.3 And the order to buy and sell oranges...";
    public static String CASESTUDY_BROKER_CREATION = "3. Now the Broker, which is responsible to take and execute the orders is being" +
            " created...";
    public static String CASESTUDY_TAKING_FRUITS_ORDERS = "4. Then, the Broker is taking to the requests list all the fruits orders.";
    public static String CASESTUDY_EXECUTING_FRUITS_ORDERS = "5. Finally the list is cleaned up after execution.";

    // Messages used during the case of study implementation - COMPOSITE
    public static String CASESTUDY_EMPLOYEES_CREATION = "1. In first place, we should create all the employees, from CEO to the most" +
            " low level of the firm hierarchy. Indeed, we instantiate the class Employee to create the CEO, two sales executives, two clerks" +
            ", one headsales and one headmarketing:";
    public static String CASESTUDY_ADD_LOW_LEVELS_1 = "2.1 Now, it's time to establish the hierarchy by initiating to compose the 'CEO" +
            " employee list' with headmarketing and headsales.";
    public static String CASESTUDY_ADD_LOW_LEVELS_2 = "2.2 Secondly the headsales list is composed by the two sales executives.";
    public static String CASESTUDY_ADD_LOW_LEVELS_3 = "2.3 Lastly the headmarketing list is composed by the two clerks.";
    public static String CASESTUDY_PRINT_ALL_EMPLOYEES = "3. In the end, all the employees are printed:";
    public static String CASESTUDY_TO_NOT_FORGET = " (Don't forget that the classe Employee has a method: remove, which should be used" +
            " when we want to remove someone from the hierarchy, but must be used carefully because that employee could have a list of" +
            " other employees that will be also removed...)";

    public static String CASESTUDY_INTENT = "INTENT";
    public static String CASESTUDY_PROBLEM = "PROBLEM";
    public static String CASESTUDY_EXEMPLIFICATION = "CONCRETE EXAMPLE";
    public static String CASESTUDY_MOTIVATION = "MOTIVATION";

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

    public static String TEXT_CREATIONALPATTERN_CONCEPT_TITLE = "CREATIONAL PATTERNS";
    public static String TEXT_CREATIONALPATTERN_CONCEPT_P1 = "  This design is all about instantiation. This pattern can be further" +
            "divided into class-creation patterns and object-creational patterns. While class-creation patterns use" +
            "inheritance effectively in the instantiation process, object-creation patterns use delegation effectively to get job done. " +
            "As examples of those kind of patterns, we have Abstract factory, builder, factory method, object pool, prototype and singleton";

    public static String TEXT_STRUCTURALPATTERN_CONCEPT_TITLE = "STRUCTURAL PATTERNS";
    public static String TEXT_STRUCTURALPATTERN_CONCEPT_P1 = "  This design patterns is all about Class ans Object composition. " +
            "Structural class-creation patterns use inheritance to compose interfaces. Structural object-patterns define ways" +
            "to compose objects to obtain new functionality. Examples of such patterns are adapter, bridge, composite, decorator," +
            " façade, flyweight, private class data and proxy.";

    public static String TEXT_BEHAVIORALPATTERN_CONCEPT_TITLE = "BEHAVIORAL PATTERNS";
    public static String TEXT_BEHAVIORALPATTERN_CONCEPT_P1 = "  This design patterns is all about Class's objects communication" +
            ". Behavioral patterns are those patterns that are most specifically concerned with communication between objects. " +
            "Example of such patterns are chain of responsibility, command, interpreter, iterator, mediator, memento, null object," +
            " observer, state, strategy, template method and visitor.";

    public static String HALL_UP_DOWN = "************************************************************************************";

    public static String QUIT_MESSAGE = "See you another time!";

    public static String SOURCE_MESSAGE = "Source: Shevets, A., 'Design Patterns - Explained Simple.' :)";
}
