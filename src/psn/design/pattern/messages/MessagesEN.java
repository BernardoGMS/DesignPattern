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
    public static String CONCEPTS_OPTIONS_DECORATOR = "Decorator Pattern.";
    public static String CONCEPTS_OPTIONS_FACADE = "Facade Pattern.";
    public static String CONCEPTS_OPTIONS_FACTORY_METHOD = "Factory Method Pattern.";
    public static String CONCEPTS_OPTIONS_FLYWEIGHT = "Flyweight Pattern.";
    public static String CONCEPTS_OPTIONS_INTERPRETER = "Interpreter Pattern.";
    public static String CONCEPTS_OPTIONS_ITERATOR = "Iterator Pattern.";
    public static String CONCEPTS_OPTIONS_MEDIATOR = "Mediator Pattern.";
    public static String CONCEPTS_OPTIONS_MEMENTO = "Memento Pattern.";
    public static String CONCEPTS_OPTIONS_NULL_OBJECT = "Null Object Pattern.";
    public static String CONCEPTS_OPTIONS_OBJECT_POOL = "Object Pool Pattern.";
    public static String CONCEPTS_OPTIONS_OBSERVER = "Observer Pattern.";
    public static String CONCEPTS_OPTIONS_PRIVATE_CLASS_DATA = "Private Class Data Pattern.";
    public static String CONCEPTS_OPTIONS_PROTOTYPE = "Prototype Pattern.";

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

    public static String CASESTUDY_DECORATOR= "Decorator.";
    public static String CASESTUDY_DECORATOR_TEXT_P1 = " * Attach additional responsibilities to an object dynamically. Decorators provide" +
            " a flexible alternative to subclassing for extending functionality;";
    public static String CASESTUDY_DECORATOR_TEXT_P2 = " * Client-specific embellishment of a core object by recursively wrapping it;";
    public static String CASESTUDY_DECORATOR_TEXT_P3 = " * Wrapping a gift, putting it in a box, and wrapping the box.";
    public static String CASESTUDY_DECORATOR_TEXT_P4 = " You want to add behavior or state to individual objects at run-time. Inheritance" +
            " is not feasible because it is static and applies to an entire class.";

    public static String CASESTUDY_FACADE= "Facade.";
    public static String CASESTUDY_FACADE_TEXT_P1 = " * Provide a interface to a set of interfaces in a subsystem. Facade defines" +
            " a higher-level interface that makes the subsystem easier to use;";
    public static String CASESTUDY_FACADE_TEXT_P2 = " * Wrap a complicated subsystem with a simpler interface.";
    public static String CASESTUDY_FACADE_TEXT_P3 = " A segment of the client community needs a simplified interface to the overall" +
            " functionality of a complex subsystem.";

    public static String CASESTUDY_FACTORY_METHOD= "Factory Method.";
    public static String CASESTUDY_FACTORY_METHOD_TEXT_P1 = " * Define an interface for creating an object, but let subclasses decide" +
            " which class to instantiate. Factory Method lets a class defer instantiation to subclasses;";
    public static String CASESTUDY_FACTORY_METHOD_TEXT_P2 = " * Defining a 'virtual' constructor;";
    public static String CASESTUDY_FACTORY_METHOD_TEXT_P3 = " * The new operator considered harmful.";
    public static String CASESTUDY_FACTORY_METHOD_TEXT_P4 = " A framework needs to standardize the architectural model for a range" +
            " of applications, but allow for individual applications to define their own domain objects and provide for their instantiation.";

    public static String CASESTUDY_FLYWEIGHT = "Flyweight.";
    public static String CASESTUDY_FLYWEIGHT_TEXT_P1 = " * Use sharing to support large number of fine-grained objects efficiently;";
    public static String CASESTUDY_FLYWEIGHT_TEXT_P2 = " * The Motif GUI strategy of replacing heavy-widgets with light-weight gadgets.";
    public static String CASESTUDY_FLYWEIGHT_TEXT_P3 = " Designing objects down to the lowest levels of system 'granularity' provides" +
            " optional flexibility, but can be unacceptably expensive in terms of performance and memory usage.";

    public static String CASESTUDY_INTERPRETER = "Interpreter.";
    public static String CASESTUDY_INTERPRETER_TEXT_P1 = " * Given a language, define a representation for a grammar along with an" +
            " interpreter that uses the representation to interpret sentences in the language;";
    public static String CASESTUDY_INTERPRETER_TEXT_P2 = " * Map a domain to a language, the language to a grammar, and the grammar" +
            " to a hierarchical object-oriented design.";
    public static String CASESTUDY_INTERPRETER_TEXT_P3 = " A class of problems occurs repeatedly in a well-defined and well-understood" +
            " domain. If the domain were characterized with a 'language', then problems could be easily solved with an interpretation" +
            " 'engine'.";

    public static String CASESTUDY_ITERATOR = "Iterator.";
    public static String CASESTUDY_ITERATOR_TEXT_P1 = " * Provide a way to access the elements of an aggregate object sequentially" +
            " without exposing its underlying representation;";
    public static String CASESTUDY_ITERATOR_TEXT_P2 = " * The C++ and Java library abstraction that makes it possible to decouple" +
            " collection classes and algorithms;";
    public static String CASESTUDY_ITERATOR_TEXT_P3 = " * Promote to 'full object status' the traversal of a collection;";
    public static String CASESTUDY_ITERATOR_TEXT_P4 = " * Polymorphic traversal.";
    public static String CASESTUDY_ITERATOR_TEXT_P5 = " Need to 'abstract' the traversal of widly different data structures" +
            " so that algorithms can be defined that are capable of interfacing with each transparently.";

    public static String CASESTUDY_MEDIATOR = "Mediator.";
    public static String CASESTUDY_MEDIATOR_TEXT_P1 = " * Define an object encapsulates how a set of objects interact, Mediator" +
            " promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you very their" +
            " interaction independently;";
    public static String CASESTUDY_MEDIATOR_TEXT_P2 = " * Design an intermediary to decouple many peers;";
    public static String CASESTUDY_MEDIATOR_TEXT_P3 = " * Promote the many-to-many relationships between interacting peers to" +
            " 'full object status';";
    public static String CASESTUDY_MEDIATOR_TEXT_P4 = " We want to design reusable components, but dependencies between the" +
            " potentially reusable pieces demonstrates the 'spaghetti code' phenomenon (trying to scoop a single serving results" +
            " in an 'all or nothing clump').";

    public static String CASESTUDY_MEMENTO = "Memento.";
    public static String CASESTUDY_MEMENTO_TEXT_P1 = " * Without violating encapsulation, capture and externalize an object's" +
            " internal state so that the object can be returned to this state later;";
    public static String CASESTUDY_MEMENTO_TEXT_P2 = " * A magic cookie that encapsulates a 'check point' capability;";
    public static String CASESTUDY_MEMENTO_TEXT_P3 = " * Promote undo or rollback to full object status.";
    public static String CASESTUDY_MEMENTO_TEXT_P4 = " Need to restore an object back to its previous state (undo or rollback" +
            " operations).";

    public static String CASESTUDY_NULL_OBJECT = "Null Object.";
    public static String CASESTUDY_NULL_OBJECT_TEXT_P1 = " The intent of a Null Object is to encapsulate the absence of an object" +
            " by providing a substitutable alternative that offers suitable default do nothing behaviour. In short, a design where" +
            " 'nothing will come of nothing'. Use Null Object Pattern when:";
    public static String CASESTUDY_NULL_OBJECT_TEXT_P2 = " * An object requires a collaborator. The Null Object Pattern does not introduce" +
            " this collaboration - it makes use of a collaboration that already exists;";
    public static String CASESTUDY_NULL_OBJECT_TEXT_P3 = " * Some collaborator instances should do nothing;";
    public static String CASESTUDY_NULL_OBJECT_TEXT_P4 = " * You want to abstract the handling of null from the client.";
    public static String CASESTUDY_NULL_OBJECT_TEXT_P5 = " Given that an object reference may be optionally null, and that the result" +
            " of a null check is to do nothing or use some default value, how can the absence of an object - the presence of a null" +
            " reference - be treated transparently?";

    public static String CASESTUDY_OBJECT_POOL = "Object Pool.";
    public static String CASESTUDY_OBJECT_POOL_TEXT_P1 = " Object pooling can offer a significant performance boost; it is most" +
            " effective in situations where the cost of initializing a class instance is high, the rate of instantiation of a class" +
            " is high, and the number of instantiation in use at any time is low.";
    public static String CASESTUDY_OBJECT_POOL_TEXT_P2 = " Object pools (otherwise known as resource pools) are used to manage the" +
            " object caching. A client with access to an Object Pool can avoid creating a new Objects by simply asking the pool for" +
            " one that has already been instantiated instead. Generally the pool will be a growing pool, i.e., the pool itself will" +
            " create new objects if the pool is empty, or we can have a pool, which restricts the number of objects created.";
    public static String CASESTUDY_OBJECT_POOL_TEXT_P3 = " It is desirable to keep all Reusable objects that are not currently" +
            " in use in the same object pool so that can be managed by one coherent policy. To achieve this, the Reusable Pool" +
            " class is designed to be singleton class.";

    public static String CASESTUDY_OBSERVER = "Observer.";
    public static String CASESTUDY_OBSERVER_TEXT_P1 = " * Define a one-to-many dependency between objects so that when one object" +
            "changes state, all its dependents are notified and updated automatically;";
    public static String CASESTUDY_OBSERVER_TEXT_P2 = " * Encapsulate the core (or common or engine) components in a subject abstraction," +
            " and the variable (or optional or user interface) components in an Observer hierarchy;";
    public static String CASESTUDY_OBSERVER_TEXT_P3 = " * The 'view' part of Model-View-Controller.";
    public static String CASESTUDY_OBSERVER_TEXT_P4 = " A large monolithic design does not scale well as new graphing or monitoring" +
            " requirements are levied.";

    public static String CASESTUDY_PRIVATE_CLASS_DATA = "Private Class Data.";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P1 = " * Control write access to class attributes;";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P2 = " * Separate data from methods that use it;";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P3 = " * Encapsulate class data initialization;";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P4 = " * Providing new type of final - final after constructor";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P5 = " A class may expose its attributes (class variables) to manipulation" +
            " when manipulation is no longer desirable, e.g., after construction. Using the private class data design pattern" +
            " prevents that undesirable manipulation.";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P6 = " A class may have one-time mutable attributes that cannot be declared" +
            " final. Using this design pattern allows one-time setting of those class attributes.";
    public static String CASESTUDY_PRIVATE_CLASS_DATA_TEXT_P7 = " The motivation for this design pattern comes from the design goal of" +
            " protecting class state by minimizing the visibility of its attributes (data).";

    public static String CASESTUDY_PROTOTYPE = "Prototype.";
    public static String CASESTUDY_PROTOTYPE_TEXT_P1 = " * Specify the kinds of objects to create using a prototypical instance" +
            ", and create new objects by copying this prototype;";
    public static String CASESTUDY_PROTOTYPE_TEXT_P2 = " * Co-opt one instance of a class for use as a breeder of all future instances;";
    public static String CASESTUDY_PROTOTYPE_TEXT_P3 = " * The new operator considered harmful.";
    public static String CASESTUDY_PROTOTYPE_TEXT_P4 = " Application 'hard wires' the class of object to create in each 'new' expression.";

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

    // Messages used during the case of study implementation - DECORATOR
    public static String CASESTUDY_SMALL_ROOMS_DECORATION = "1. In first place, using the approach explained before to decorate the rooms" +
            " by wrapping then recursively, we create three small rooms using the class SmallRoom which implements Room Interface." +
            " All the decorations are executed by using the specific classes of individual choices:";
    public static String CASESTUDY_SMALL_ROOM_1 = "1.1 First we create a simple room with no decoration;";
    public static String CASESTUDY_SMALL_ROOM_2 = "1.2 Then we create and decorate a room with white walls and a red candle;";
    public static String CASESTUDY_SMALL_ROOM_3 = "1.3 The last small room has white walls and woody floors.";
    public static String CASESTUDY_AVERAGE_ROOMS_DECORATION = "2. Another type of rooms is the average. By using the same process, we will" +
            " create another 2 rooms, but of such type:";
    public static String CASESTUDY_AVERAGE_ROOM_1 = "2.1 The first has white walls, a red candle and a yellow bed;";
    public static String CASESTUDY_AVERAGE_ROOM_2 = "2.2 The second is decorated by a red candle and a black mirror;";
    public static String CASESTUDY_BIG_ROOM_DECORATION = "3. At last we could have a enchanted big room with blue walls, a yellow bed, " +
            "a shiny floor and a red candle.";

    // Messages used during the case of study implementation - FACADE
    public static String CASESTUDY_INTERFACES_EXPL = "1. To begin with the process, we create a high-level interface named Shape," +
            "which will be implemented by the interfaces Circle, Triangle and Rectangle. Then those three interfaces have their own behavior." +
            " When we want to draw some of then, for example, through the class ShapeMaker, we just need to call the required method," +
            " which 'inner attributes' corresponds to the specific shape we want, but always called as the general interface.";
    public static String CASESTUDY_SHAPE_MAKER_CREATION = "2. Secondly we create the ShapeMaker with three methods, one for each shape," +
            " and it will be used to implement the method draw() owned by the interface Shape;";
    public static String CASESTUDY_DRAW_CIRCLE = "3.1 Now, by calling drawCircle() from ShapeMaker, we can draw the circle (a Shape);";
    public static String CASESTUDY_DRAW_RECTANGLE = "3.2 Similarly, we to the same thing with rectangle by calling drawRectangle();";
    public static String CASESTUDY_DRAW_TRIANGLE = "3.3 And at last, by calling drawTriangle(), we draw a triangle shape.";

    // Messages used during the case of study implementation - FACTORY METHOD
    public static String CASESTUDY_CREATE_POKE_FACTORY = "1. The creation of an factory will provide us a method that give us the" +
            " permission to instantiate a specific 'subtype' of pokemon chosen in run time (getPokemon(pokemonType)). That exactly the" +
            " first step to use the design pattern:";
    public static String CASESTUDY_GET_PIKACHU = "2.1 In the current example there are implemented three different types os pokemons:" +
            " Pikachu, Squirtle and Charizard. The first to be instantiate is Pikachu.";
    public static String CASESTUDY_CALL_PIKACHU = "2.1.1 Then, once instantiated, it is time to call him:";
    public static String CASESTUDY_GET_SQUIRTLE = "2.2 Secondly, lets create a squirtle...";
    public static String CASESTUDY_CALL_SQUIRTLE = "2.2.1 And of course call him:";
    public static String CASESTUDY_GET_CHARIZARD = "2.3 At last, we instantiate a charizard...";
    public static String CASESTUDY_CALL_CHARIZARD = "2.3.1 And we call him.";

    // Messages used during the case of study implementation - FLYWEIGHT
    public static String CASESTUDY_FLYWEIGHT_EXPL = "1. In the next example, we have a interface Building which has a void method:" +
            " construct() and is irhantate by House Class. We pretend to create a set of 20 houses, with random parameters as color," +
            " coordinates and area, but in order to save some memory, one can instantiate a new house just when it wasn't created" +
            " one with the pretended color: i.e, if we pretend to create more than one red house, for example, the second, third," +
            " and so on... houses will be the same as the red house instantiate in first place, just changing the coordinates and area:";
    public static String CASESTUDY_FLYWEIGHT_EXPL_1 = "1.1 Below one can see the list of created house and respective parameters:";
    public static String CASESTUDY_FLYWEIGHT_FINAL_EXPL = "2. As we can observe above, in any situation we had repeat the the instantiation" +
            " of a house with the same color.";

    // Messages used during the case of study implementation - INTERPRETER
    public static String CASESTUDY_INTERPRETER_EXPL = "1. That example pretends to interpret if some expressions are true or false." +
            " This is done by using the interface Expression which is implemented by 3 classes, each of them representing distinct" +
            " meanings. AndExpression represents the operator AND and OrExpression the OR.";
    public static String CASESTUDY_INTERPRETER_EXPL_1 = "1.1 By using some methods that relate the expressions with the respective" +
            " classes, we can verify, for example, by creating a method getMaleExpression() which contains a list of male names and" +
            " return a OrExpression(Expression, Expression), if some name is a male name or not, using the interpreter interface.";
    public static String CASESTUDY_INTERPRETER_EXPL_2 = "1.2 For example, if we want to verify is a woman is married, one can use" +
            " the same approach, but using another method that returns a AndExpression which is interpreted by the interpreter, but" +
            " instead of looking for an OR expression, seek for a expression like 'womanName' + 'married', to give the true boolean!";

    // Messages used during the case of study implementation - ITERATOR
    public static String CASESTUDY_ITERATOR_1 = "1. To exemplify that pattern, we create a interface Iterator which has two methods:";
    public static String CASESTUDY_ITERATOR_1_1 = "1.1 hasNext(), returns a boolean that says if there is a next object in the collection" +
            " or not;";
    public static String CASESTUDY_ITERATOR_1_2 = "1.1 next(), returns an object contained by the collection, if exists.";
    public static String CASESTUDY_ITERATOR_REPOSITORY = "2. Then, we have a Repository that implements the container which has a" +
            " method to create a new iterator that implements iterator interface. In that example we created a container of Strings" +
            " representing the names of Dragon Ball characters;";
    public static String CASESTUDY_ITERATOR_INTERATION = "3. Lastly, using the methods next and hasNext, one can traverse all" +
            " the objects contained in the container even if we do not know in advance the class of those objects.";

    // Messages used during the case of study implementation - MEDIATOR
    public static String CASESTUDY_MEDIATOR_1 = "1. To begin that example, we need to instantiate a mediator (unique) which implements the" +
            " showMessage() method from Mediator Interface to send a message.";
    public static String CASESTUDY_MEDIATOR_2 = "2. The messages are created to be sent between flights, in this case, to inform" +
            " each others their current positions.";
    public static String CASESTUDY_MEDIATOR_3 = "3. After instantiate the three flights, the mediator is responsible for send the" +
            " messages between flights.";

    // Messages used during the case of study implementation - MEMENTO
    public static String CASESTUDY_MEMENTO_CREATE_ORIGINATOR = "1. In first place, we start the example by creating the originator," +
            " which has a state and is responsible to save the state in a List beloging to CareTaker class, by using the method" +
            " saveStateToMemento() and the method add() of the careTaker, that will be instantiated later.";
    public static String CASESTUDY_MEMENTO_CREATE_CARETAKER = "2. Secondly we create a caretaker that is the object responsible to" +
            " know why and when the originator needs to save and restore itself.";
    public static String CASESTUDY_MEMENTO_SET_STATE_1_AND_2_AND_SAVE_2 = "3. Now we set the state 1 and 2 to the originator," +
            " but only the second is saved.";
    public static String CASESTUDY_MEMENTO_SET_AND_SAVE_STATE_3 = "4. Then, we can set the state 3 and save it.";
    public static String CASESTUDY_MEMENTO_SET_AND_GET_STATE_4 = "5. Now, one can set the state 4 and check what is the current" +
            " originator status. It is not saved.";
    public static String CASESTUDY_MEMENTO_CHECK_SAVED_STATES = "6. Lastly, we can check all the states that were saved by using" +
            " the memento list, i.e., in the example we had just saved 2 states:";

    // Messages used during the case of study implementation - NULL OBJECT
    public static String CASESTUDY_GET_ALL_CUSTOMERS_BY_NAME = "1. Using the Customer Factory Class, which has a set of customers" +
            " names saved in an array, we pretend by giving a name, that the Factory creates real customers if it finds the given" +
            " name: if not, it will create a null customer. In this example we have Rob, Joe and Julie!";
    public static String CASESTUDY_CREATE_FOUR_CUSTOMERS = "2. To show how it works, lets ask to the Factory  to create four customers with names" +
            " Rob, Bob, Julie and Laura.";
    public static String CASESTUDY_CHECK_CUSTOMERS = "2.1 At last, we can ask the four customers to print their names: if the customers" +
            " creates null objects, then it will print 'Not Available in Customer Database':";

    // Messages used during the case of study implementation - OBSERVER
    public static String CASESTUDY_CREATE_SUBJECT_TO_BE_OBSERVED = "1. To start with the example, we will have to create a subject" +
            " that has a state and a changeble list of observers.";
    public static String CASESTUDY_ADD_THREE_OBSERVERS = "2. In second place, we will add to the subject list three different types" +
            " of observer that share the interface Observer, with the method update, responsible to notify the observers" +
            " and is called each time the subject state changes. The three observer are BinaryObserver, OctalObserver and " +
            "HexaObserver and each one of them change print a message in the corresponding numeric base system: binary, octagonal " +
            "or hexagonal.";
    public static String CASESTUDY_SET_STATE = "3. Finally, by changing twice the subject state, all the observers" +
            " contained in his list are notified.";

    // Messages used during the case of study implementation - Private Data Class
    public static String CASESTUDY_CREATE_MAIN_CLASS = "1. In first place we should instantiate the Main Class, which will contain" +
            " the data class that has three attributes: height, weight and width.";
    public static String CASESTUDY_INSTANTIATE_DATA_CLASS= "1.1 We must give to each attribute the a specific value!";
    public static String CASESTUDY_GET_VALUES= "2. Then we can get each attributes but asking to the the mainClass:";

    // Messages used during the case of study implementation - Private Data Class
    public static String CASESTUDY_COLORSTORE = "1. To begin, we must have a class with a static Color Map List which contains" +
            " a set of colors, classes that extends from the 'prototype' color which implements cloneable interface.";
    public static String CASESTUDY_GETCOLOR = "2. In that way we can use the method getColor, and by using the String Key" +
            ", we create a new object according the color and add to the new list:";
    public static String CASESTUDY_COLORS = "3. The example above showed that it was added 4 colors: twice red, one of blue, " +
            "and one of white!";

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
