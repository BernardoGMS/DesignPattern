package psn.design.pattern.designPatterns;

import psn.design.pattern.designPatterns.AbstractFactory.AbstractFactoryDP;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductB;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.FactoryMaker;
import psn.design.pattern.designPatterns.Adapter.auxClasses.AudioPlayer;
import psn.design.pattern.designPatterns.Bridge.auxClasses.*;
import psn.design.pattern.designPatterns.Builder.Meal;
import psn.design.pattern.designPatterns.Builder.MealBuilder;
import psn.design.pattern.designPatterns.Builder.auxClasses.Coke;
import psn.design.pattern.designPatterns.ChainOfResponsibility.AbstractLogger;
import psn.design.pattern.designPatterns.ChainOfResponsibility.ChainPatternDemo;
import psn.design.pattern.designPatterns.Command.auxClasses.Broker;
import psn.design.pattern.designPatterns.Command.auxClasses.BuyStock;
import psn.design.pattern.designPatterns.Command.auxClasses.SellStock;
import psn.design.pattern.designPatterns.Command.auxClasses.Stock;
import psn.design.pattern.designPatterns.Composite.Employee;
import psn.design.pattern.designPatterns.Decorator.Room;
import psn.design.pattern.designPatterns.Decorator.auxClasses.*;
import psn.design.pattern.designPatterns.Facade.auxClasses.ShapeMaker;
import psn.design.pattern.designPatterns.FactoryMethod.Pokemon;
import psn.design.pattern.designPatterns.FactoryMethod.auxClasses.PokemonFactory;
import psn.design.pattern.designPatterns.Flyweight.auxClasses.BuildingFactory;
import psn.design.pattern.designPatterns.Flyweight.auxClasses.Colors;
import psn.design.pattern.designPatterns.Flyweight.auxClasses.House;
import psn.design.pattern.designPatterns.Interpreter.Expression;
import psn.design.pattern.designPatterns.Interpreter.auxClasses.ExpressionsImpl;
import psn.design.pattern.designPatterns.Iterator.Iterator;
import psn.design.pattern.designPatterns.Iterator.auxClasses.DragonBallRepository;
import psn.design.pattern.designPatterns.Mediator.auxClasses.Flight;
import psn.design.pattern.designPatterns.Memento.auxClasses.CareTaker;
import psn.design.pattern.designPatterns.Memento.auxClasses.Originator;
import psn.design.pattern.designPatterns.NullObject.AbstractCustomer;
import psn.design.pattern.designPatterns.NullObject.auxClasses.CustomerFactory;
import psn.design.pattern.designPatterns.ObjectPool.auxClasses.ExpensiveResource;
import psn.design.pattern.designPatterns.ObjectPool.auxClasses.ExpensiveResourcePool;
import psn.design.pattern.designPatterns.Observer.auxClasses.BinaryObserver;
import psn.design.pattern.designPatterns.Observer.auxClasses.HexaObserver;
import psn.design.pattern.designPatterns.Observer.auxClasses.OctalObserver;
import psn.design.pattern.designPatterns.Observer.auxClasses.Subject;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsConstructorEN;

import java.sql.Connection;
import java.util.concurrent.BlockingQueue;

public class ConcretePatternInstantiation implements ImplPatternInterface {

    public void implementAbstractFactory(TextsConstructor constructor){

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_FACTORIES);
            constructor.constructText();

            AbstractFactoryDP factory1 = FactoryMaker.getFactory("a");
            AbstractFactoryDP factory2 = FactoryMaker.getFactory("b");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_PRODUCTS_FACA);
            constructor.constructText();

            AbstractProductA productA = factory1.createProductA("Choc");
            AbstractProductA productB = factory1.createProductB("Maria");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_PRODUCTS_FACB);
            constructor.constructText();

            AbstractProductA productC = factory2.createProductC("Cuetara");
            AbstractProductB productD = factory2.createProductD("Oreo");
            AbstractProductB productE = factory2.createProductE("Cream");

            constructor.setCurrentText(MessagesEN.CASESTUDY_ABSTRACTFACTORY_DOING_OPERATIONS);
            constructor.constructText();

            doOperations(productA, productB, productC, productD, productE);

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.oodesign.com/abstract-factory-pattern.html");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_FACTORIES);
            constructor.constructText();

            AbstractFactoryDP factory1 = FactoryMaker.getFactory("a");
            AbstractFactoryDP factory2 = FactoryMaker.getFactory("b");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_PRODUCTS_FACA);
            constructor.constructText();

            AbstractProductA productA = factory1.createProductA("Choc");
            AbstractProductA productB = factory1.createProductB("Maria");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_PRODUCTS_FACB);
            constructor.constructText();

            AbstractProductA productC = factory2.createProductC("Cuetara");
            AbstractProductB productD = factory2.createProductD("Oreo");
            AbstractProductB productE = factory2.createProductE("Cream");

            constructor.setCurrentText(MessagesPT.CASESTUDY_ABSTRACTFACTORY_DOING_OPERATIONS);
            constructor.constructText();

            doOperations(productA, productB, productC, productD, productE);

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.oodesign.com/abstract-factory-pattern.html");

            constructor.constructTextDown(2);

        }

    }

    private void doOperations(AbstractProductA productA, AbstractProductA productB, AbstractProductA productC, AbstractProductB productD, AbstractProductB productE){

        productA.operationA1();
        productA.operationA2();

        productB.operationA1();

        productC.operationA1();
        productC.operationA2();

        productD.operationB1();
        productD.operationB2();

        productE.operationB1();

    }

    @Override
    public void implementAdapter(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_AUDIOPLAYER);
            constructor.constructText();

            AudioPlayer audioPlayer1 = new AudioPlayer();
            AudioPlayer audioPlayer2 = new AudioPlayer();

            constructor.setCurrentText(MessagesEN.CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_ONE);
            constructor.constructText();

            audioPlayer1.play("mp3", "only you.mp3");

            constructor.setCurrentText(MessagesEN.CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_TWO);
            constructor.constructText();

            audioPlayer2.play("mp3", "need to know.mp3");

            constructor.setCurrentText(MessagesEN.CASESTUDY_PLAY_MP4_FILE_AUDIOPLAYER_ONE);
            constructor.constructText();

            audioPlayer2.play("mp4", "only you.mp4");

            constructor.setCurrentText(MessagesEN.CASESTUDY_PLAY_VLC_FILE_AUDIOPLAYER_TWO);
            constructor.constructText();

            audioPlayer2.play("vlc", "judas.vlc");

            constructor.setCurrentText(MessagesEN.CASESTUDY_PLAY_AVI_FILE_AUDIOPLAYER_TWO);
            constructor.constructText();

            audioPlayer2.play("avi", "love, simon.avi");

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_AUDIOPLAYER);
            constructor.constructText();

            AudioPlayer audioPlayer1 = new AudioPlayer();
            AudioPlayer audioPlayer2 = new AudioPlayer();

            constructor.setCurrentText(MessagesPT.CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_ONE);
            constructor.constructText();

            audioPlayer1.play("mp3", "only you.mp3");

            constructor.setCurrentText(MessagesPT.CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_TWO);
            constructor.constructText();

            audioPlayer2.play("mp3", "need to know.mp3");

            constructor.setCurrentText(MessagesPT.CASESTUDY_PLAY_MP4_FILE_AUDIOPLAYER_ONE);
            constructor.constructText();

            audioPlayer2.play("mp4", "only you.mp4");

            constructor.setCurrentText(MessagesPT.CASESTUDY_PLAY_VLC_FILE_AUDIOPLAYER_TWO);
            constructor.constructText();

            audioPlayer2.play("vlc", "judas.vlc");

            constructor.setCurrentText(MessagesPT.CASESTUDY_PLAY_AVI_FILE_AUDIOPLAYER_TWO);
            constructor.constructText();

            audioPlayer2.play("avi", "love, simon.avi");

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/adapter_pattern.htm");

            constructor.constructTextDown(2);
        }
    }

    @Override
    public void implementBridge(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_EXPLANATION_CIRCLE_STRUCTURE);
            constructor.constructText();
            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_RED_CIRCLE);
            constructor.constructText();
            Shape redCircle = new Circle(100,100, 10, new RedCircle());
            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_PURPLE_CIRCLE);
            constructor.constructText();
            Shape purpleCircle = new Circle(100,100, 10, new PurpleCircle());
            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_BLUE_CIRCLE);
            constructor.constructText();
            Shape blueCircle = new Circle(200,100, 15, new BlueCircle());
            constructor.setCurrentText(MessagesEN.CASESTUDY_DRAW_CIRCLES);
            constructor.constructText();
            redCircle.draw();
            purpleCircle.draw();
            blueCircle.draw();

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_EXPLANATION_CIRCLE_STRUCTURE);
            constructor.constructText();
            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_RED_CIRCLE);
            constructor.constructText();
            Shape redCircle = new Circle(100,100, 10, new RedCircle());
            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_PURPLE_CIRCLE);
            constructor.constructText();
            Shape purpleCircle = new Circle(100,100, 10, new PurpleCircle());
            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_BLUE_CIRCLE);
            constructor.constructText();
            Shape blueCircle = new Circle(200,100, 15, new BlueCircle());
            constructor.setCurrentText(MessagesPT.CASESTUDY_DRAW_CIRCLES);
            constructor.constructText();
            redCircle.draw();
            purpleCircle.draw();
            blueCircle.draw();

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/bridge_pattern.htm");

            constructor.constructTextDown(2);
        }
    }

    @Override
    public void implementBuilder(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_MEALBUILDER);
            constructor.constructText();
            MealBuilder mealBuilder = new MealBuilder();
            constructor.setCurrentText(MessagesEN.CASESTUDY_VEGMEAL_1);
            constructor.constructText();
            Meal vegMeal = mealBuilder.prepareVegMeal();
            System.out.println("Veg Meal");
            vegMeal.showItems();
            constructor.setCurrentText(MessagesEN.CASESTUDY_VEGMEAL_2);
            constructor.constructText();
            vegMeal.addItem(new Coke());
            vegMeal.showItems();
            System.out.println("Total Cost: " + vegMeal.getCost());
            constructor.setCurrentText(MessagesEN.CASESTUDY_NONVEGMEAL_1);
            constructor.constructText();
            Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
            System.out.println("Non-Veg Meal");
            nonVegMeal.showItems();
            System.out.println("Total Cost: " + nonVegMeal.getCost());

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_MEALBUILDER);
            constructor.constructText();
            MealBuilder mealBuilder = new MealBuilder();
            constructor.setCurrentText(MessagesPT.CASESTUDY_VEGMEAL_1);
            constructor.constructText();
            Meal vegMeal = mealBuilder.prepareVegMeal();
            System.out.println("Refeição Vegan");
            vegMeal.showItems();
            constructor.setCurrentText(MessagesPT.CASESTUDY_VEGMEAL_2);
            constructor.constructText();
            vegMeal.addItem(new Coke());
            vegMeal.showItems();
            System.out.println("Custo total: " + vegMeal.getCost());
            constructor.setCurrentText(MessagesPT.CASESTUDY_NONVEGMEAL_1);
            constructor.constructText();
            Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
            System.out.println("Refeição Não-Vegan");
            nonVegMeal.showItems();
            System.out.println("Custo total: " + nonVegMeal.getCost());

            constructor.constructTextDown(2);

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/builder_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementChainofResponsability(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CONSTRUCT_CHAIN_OF_LOGGERS);
            constructor.constructText();
                AbstractLogger loggerChain = ChainPatternDemo.getChainOfLoggers();

            constructor.setCurrentText(MessagesEN.CASESTUDY_PRINTING_INFORMATIONS_LEVEL_1);
            constructor.constructText();

                loggerChain.logMessage(AbstractLogger.INFO,
                        "This is an information.");

            constructor.setCurrentText(MessagesEN.CASESTUDY_PRINTING_INFORMATIONS_LEVEL_2);
            constructor.constructText();

                loggerChain.logMessage(AbstractLogger.DEBUG,
                        "This is an debug level information.");

            constructor.setCurrentText(MessagesEN.CASESTUDY_PRINTING_INFORMATIONS_LEVEL_3);
            constructor.constructText();

                loggerChain.logMessage(AbstractLogger.ERROR,
                        "This is an error information. \n");

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CONSTRUCT_CHAIN_OF_LOGGERS);
            constructor.constructText();
            AbstractLogger loggerChain = ChainPatternDemo.getChainOfLoggers();

            constructor.setCurrentText(MessagesPT.CASESTUDY_PRINTING_INFORMATIONS_LEVEL_1);
            constructor.constructText();

            loggerChain.logMessage(AbstractLogger.INFO,
                    "This is an information.");

            constructor.setCurrentText(MessagesPT.CASESTUDY_PRINTING_INFORMATIONS_LEVEL_2);
            constructor.constructText();

            loggerChain.logMessage(AbstractLogger.DEBUG,
                    "This is an debug level information.");

            constructor.setCurrentText(MessagesPT.CASESTUDY_PRINTING_INFORMATIONS_LEVEL_3);
            constructor.constructText();

            loggerChain.logMessage(AbstractLogger.ERROR,
                    "This is an error information. \n");

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/chain_of_responsibility_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementCommand(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_STOCK_CREATION);
            constructor.constructText();

            Stock bananasStock = new Stock("Banana", 20);
            Stock strawberriesStorck = new Stock("Strawberry", 15);
            Stock orangesStock = new Stock("Orange", 25);

            constructor.setCurrentText(MessagesEN.CASESTUDY_BUYSELL_BANANAS_ORDER_EXECUTION);
            constructor.constructText();

            BuyStock buyBananaStockOrder = new BuyStock(bananasStock);
            SellStock sellBananaStockOrder = new SellStock(bananasStock);

            constructor.setCurrentText(MessagesEN.CASESTUDY_BUYSELL_STRAWBERRIES_ORDER_EXECUTION);
            constructor.constructText();

            BuyStock buyStrawberryStockOrder = new BuyStock(strawberriesStorck);
            SellStock sellStrawberryStockOrder = new SellStock(strawberriesStorck);

            constructor.setCurrentText(MessagesEN.CASESTUDY_BUYSELL_ORANGES_ORDER_EXECUTION);
            constructor.constructText();

            BuyStock buyOrangeStockOrder = new BuyStock(orangesStock);
            SellStock sellOrangeStockOrder = new SellStock(orangesStock);

            constructor.setCurrentText(MessagesEN.CASESTUDY_BROKER_CREATION);
            constructor.constructText();

            Broker broker = new Broker();

            constructor.setCurrentText(MessagesEN.CASESTUDY_TAKING_FRUITS_ORDERS);
            constructor.constructText();

            broker.takeOrder(buyBananaStockOrder);
            broker.takeOrder(sellBananaStockOrder);

            broker.takeOrder(buyStrawberryStockOrder);
            broker.takeOrder(sellStrawberryStockOrder);

            broker.takeOrder(buyOrangeStockOrder);
            broker.takeOrder(sellOrangeStockOrder);

            constructor.setCurrentText(MessagesEN.CASESTUDY_EXECUTING_FRUITS_ORDERS);
            constructor.constructText();

            broker.placeOrders();

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/command_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_STOCK_CREATION);
            constructor.constructText();

            Stock bananasStock = new Stock("Banana", 20);
            Stock strawberriesStorck = new Stock("Morango", 15);
            Stock orangesStock = new Stock("Laranja", 25);

            constructor.setCurrentText(MessagesPT.CASESTUDY_BUYSELL_BANANAS_ORDER_EXECUTION);
            constructor.constructText();

            BuyStock buyBananaStockOrder = new BuyStock(bananasStock);
            SellStock sellBananaStockOrder = new SellStock(bananasStock);

            constructor.setCurrentText(MessagesPT.CASESTUDY_BUYSELL_STRAWBERRIES_ORDER_EXECUTION);
            constructor.constructText();

            BuyStock buyStrawberryStockOrder = new BuyStock(strawberriesStorck);
            SellStock sellStrawberryStockOrder = new SellStock(strawberriesStorck);

            constructor.setCurrentText(MessagesPT.CASESTUDY_BUYSELL_ORANGES_ORDER_EXECUTION);
            constructor.constructText();

            BuyStock buyOrangeStockOrder = new BuyStock(orangesStock);
            SellStock sellOrangeStockOrder = new SellStock(orangesStock);

            constructor.setCurrentText(MessagesPT.CASESTUDY_BROKER_CREATION);
            constructor.constructText();

            Broker broker = new Broker();

            constructor.setCurrentText(MessagesPT.CASESTUDY_TAKING_FRUITS_ORDERS);
            constructor.constructText();

            broker.takeOrder(buyBananaStockOrder);
            broker.takeOrder(sellBananaStockOrder);

            broker.takeOrder(buyStrawberryStockOrder);
            broker.takeOrder(sellStrawberryStockOrder);

            broker.takeOrder(buyOrangeStockOrder);
            broker.takeOrder(sellOrangeStockOrder);

            constructor.setCurrentText(MessagesPT.CASESTUDY_EXECUTING_FRUITS_ORDERS);
            constructor.constructText();

            broker.placeOrders();

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/command_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementComposite(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_EMPLOYEES_CREATION);
            constructor.constructText();

            Employee CEO = new Employee("John","CEO", 30000);

            System.out.println("1.1 " + CEO.toString() + " created...");

            Employee headSales = new Employee("Robert","Head Sales", 20000);

            System.out.println("1.2 " + headSales.toString() + " created...");

            Employee headMarketing = new Employee("Michel","Head Marketing", 20000);

            System.out.println("1.3 " + headMarketing.toString() + " created...");

            Employee clerk1 = new Employee("Laura","Marketing", 10000);
            Employee clerk2 = new Employee("Bob","Marketing", 10000);

            System.out.println("1.4.1 " + headSales.toString() + " created...");
            System.out.println("1.4.2 " + headSales.toString() + " created...");

            Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
            Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

            System.out.println("1.5.1 " + salesExecutive1.toString() + " created...");
            System.out.println("1.5.2 " + salesExecutive2.toString() + " created...");

            constructor.setCurrentText(MessagesEN.CASESTUDY_ADD_LOW_LEVELS_1);
            constructor.constructText();

            CEO.add(headSales);
            CEO.add(headMarketing);

            constructor.setCurrentText(MessagesEN.CASESTUDY_ADD_LOW_LEVELS_2);
            constructor.constructText();

            headSales.add(salesExecutive1);
            headSales.add(salesExecutive2);

            constructor.setCurrentText(MessagesEN.CASESTUDY_ADD_LOW_LEVELS_3);
            constructor.constructText();

            headMarketing.add(clerk1);
            headMarketing.add(clerk2);

            constructor.setCurrentText(MessagesEN.CASESTUDY_PRINT_ALL_EMPLOYEES);
            constructor.constructText();

            System.out.println(CEO);

            for (Employee headEmployee : CEO.getSubordinates()) {
                System.out.println(headEmployee);

                for (Employee employee : headEmployee.getSubordinates()) {
                    System.out.println(employee);
                }
            }

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/composite_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_EMPLOYEES_CREATION);
            constructor.constructText();

            Employee CEO = new Employee("João","CEO", 30000);

            System.out.println("1.1 " + CEO.toString() + " criado...");

            Employee diretorVendas = new Employee("Roberto","Diretor de vendas", 20000);

            System.out.println("1.2 " + diretorVendas.toString() + " criado...");

            Employee diretorPublicidade = new Employee("Miguel","Diretor de publicidade", 20000);

            System.out.println("1.3 " + diretorPublicidade.toString() + " criado...");

            Employee empregado1 = new Employee("Laura","Publicidade", 10000);
            Employee empregado2 = new Employee("José","Publicidade", 10000);

            System.out.println("1.4.1 " + empregado1.toString() + " criado...");
            System.out.println("1.4.2 " + empregado2.toString() + " criado...");

            Employee executorVendas1 = new Employee("Ricardo","Vendas", 10000);
            Employee executorVendas2 = new Employee("Rolando","Vendas", 10000);

            System.out.println("1.5.1 " + executorVendas1.toString() + " criado...");
            System.out.println("1.5.2 " + executorVendas2.toString() + " criado...");

            constructor.setCurrentText(MessagesPT.CASESTUDY_ADD_LOW_LEVELS_1);
            constructor.constructText();

            CEO.add(diretorVendas);
            CEO.add(diretorPublicidade);

            constructor.setCurrentText(MessagesPT.CASESTUDY_ADD_LOW_LEVELS_2);
            constructor.constructText();

            diretorVendas.add(executorVendas1);
            diretorVendas.add(executorVendas2);

            constructor.setCurrentText(MessagesPT.CASESTUDY_ADD_LOW_LEVELS_3);
            constructor.constructText();

            diretorPublicidade.add(empregado1);
            diretorPublicidade.add(empregado2);

            constructor.setCurrentText(MessagesPT.CASESTUDY_PRINT_ALL_EMPLOYEES);
            constructor.constructText();

            System.out.println(CEO);

            for (Employee headEmployee : CEO.getSubordinates()) {
                System.out.println(headEmployee);

                for (Employee employee : headEmployee.getSubordinates()) {
                    System.out.println(employee);
                }
            }

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/composite_pattern.htm");

            constructor.constructTextDown(2);


        }
    }

    @Override
    public void implementDecorator(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_SMALL_ROOMS_DECORATION);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_SMALL_ROOM_1);
            constructor.constructText();
            Room smallSimpleRoom = new SmallRoom();
            smallSimpleRoom.decorateRoom();
            constructor.setCurrentText(MessagesEN.CASESTUDY_SMALL_ROOM_2);
            constructor.constructText();
            Room smallRoomWhiteWallsRedCandle = new WhiteWallsDecorator(new RedCandleDecorator( new SmallRoom()));
            smallRoomWhiteWallsRedCandle.decorateRoom();
            constructor.setCurrentText(MessagesEN.CASESTUDY_SMALL_ROOM_3);
            constructor.constructText();
            Room smallRoomWhiteWallsWoodyFloor = new WhiteWallsDecorator(new WoodyFloorDecorator( new SmallRoom()));
            smallRoomWhiteWallsWoodyFloor.decorateRoom();

            constructor.setCurrentText(MessagesEN.CASESTUDY_AVERAGE_ROOMS_DECORATION);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_AVERAGE_ROOM_1);
            constructor.constructText();
            Room averageRoomWhiteWallsRedCandleYellowBed = new WhiteWallsDecorator(new RedCandleDecorator( new YellowBedDecorator( new AverageRoom())));
            averageRoomWhiteWallsRedCandleYellowBed.decorateRoom();
            constructor.setCurrentText(MessagesEN.CASESTUDY_AVERAGE_ROOM_2);
            constructor.constructText();
            Room averageRoomRedCandleBlackMirror = new RedCandleDecorator(new BlackMirrorDecorator( new AverageRoom()));
            averageRoomRedCandleBlackMirror.decorateRoom();

            constructor.setCurrentText(MessagesEN.CASESTUDY_BIG_ROOM_DECORATION);
            constructor.constructText();
            Room bigRoomBlueWallsYellowBedShinyFloorRedCandle = new BlueWallsDecorator(new YellowBedDecorator( new ShinyFloorDecorator( new RedCandleDecorator( new BigRoom()))));
            bigRoomBlueWallsYellowBedShinyFloorRedCandle.decorateRoom();

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_SMALL_ROOMS_DECORATION);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_SMALL_ROOM_1);
            constructor.constructText();
            Room smallSimpleRoom = new SmallRoom();
            smallSimpleRoom.decorateRoom();
            constructor.setCurrentText(MessagesPT.CASESTUDY_SMALL_ROOM_2);
            constructor.constructText();
            Room smallRoomWhiteWallsRedCandle = new WhiteWallsDecorator(new RedCandleDecorator( new SmallRoom()));
            smallRoomWhiteWallsRedCandle.decorateRoom();
            constructor.setCurrentText(MessagesPT.CASESTUDY_SMALL_ROOM_3);
            constructor.constructText();
            Room smallRoomWhiteWallsWoodyFloor = new WhiteWallsDecorator(new WoodyFloorDecorator( new SmallRoom()));
            smallRoomWhiteWallsWoodyFloor.decorateRoom();

            constructor.setCurrentText(MessagesPT.CASESTUDY_AVERAGE_ROOMS_DECORATION);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_AVERAGE_ROOM_1);
            constructor.constructText();
            Room averageRoomWhiteWallsRedCandleYellowBed = new WhiteWallsDecorator(new RedCandleDecorator( new YellowBedDecorator( new AverageRoom())));
            averageRoomWhiteWallsRedCandleYellowBed.decorateRoom();
            constructor.setCurrentText(MessagesPT.CASESTUDY_AVERAGE_ROOM_2);
            constructor.constructText();
            Room averageRoomRedCandleBlackMirror = new RedCandleDecorator(new BlackMirrorDecorator( new AverageRoom()));
            averageRoomRedCandleBlackMirror.decorateRoom();

            constructor.setCurrentText(MessagesPT.CASESTUDY_BIG_ROOM_DECORATION);
            constructor.constructText();
            Room bigRoomBlueWallsYellowBedShinyFloorRedCandle = new BlueWallsDecorator(new YellowBedDecorator( new ShinyFloorDecorator( new RedCandleDecorator( new BigRoom()))));
            bigRoomBlueWallsYellowBedShinyFloorRedCandle.decorateRoom();

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm");

            constructor.constructTextDown(2);

        }
    }

    @Override
    public void implementFacade(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_INTERFACES_EXPL);
            constructor.constructText();
            constructor.setCurrentText(MessagesEN.CASESTUDY_SHAPE_MAKER_CREATION);
            constructor.constructText();
            ShapeMaker shapeMaker = new ShapeMaker();

            constructor.setCurrentText(MessagesEN.CASESTUDY_DRAW_CIRCLE);
            constructor.constructText();
            shapeMaker.drawCircle();
            constructor.setCurrentText(MessagesEN.CASESTUDY_DRAW_RECTANGLE);
            constructor.constructText();
            shapeMaker.drawRectangle();
            constructor.setCurrentText(MessagesEN.CASESTUDY_DRAW_TRIANGLE);
            constructor.constructText();
            shapeMaker.drawTriangle();

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/facade_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_INTERFACES_EXPL);
            constructor.constructText();
            constructor.setCurrentText(MessagesPT.CASESTUDY_SHAPE_MAKER_CREATION);
            constructor.constructText();
            ShapeMaker shapeMaker = new ShapeMaker();

            constructor.setCurrentText(MessagesPT.CASESTUDY_DRAW_CIRCLE);
            constructor.constructText();
            shapeMaker.drawCircle();
            constructor.setCurrentText(MessagesPT.CASESTUDY_DRAW_RECTANGLE);
            constructor.constructText();
            shapeMaker.drawRectangle();
            constructor.setCurrentText(MessagesPT.CASESTUDY_DRAW_TRIANGLE);
            constructor.constructText();
            shapeMaker.drawTriangle();

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/facade_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementFactoryMethod(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_POKE_FACTORY);
            constructor.constructText();
            PokemonFactory factory = new PokemonFactory();

            constructor.setCurrentText(MessagesEN.CASESTUDY_GET_PIKACHU);
            constructor.constructText();
            Pokemon pikachu = factory.getPokemon("PIKACHU");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CALL_PIKACHU);
            constructor.constructText();
            pikachu.callPokemon();

            constructor.setCurrentText(MessagesEN.CASESTUDY_GET_SQUIRTLE);
            constructor.constructText();
            Pokemon squirtle = factory.getPokemon("SQUIRTLE");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CALL_SQUIRTLE);
            constructor.constructText();
            squirtle.callPokemon();

            constructor.setCurrentText(MessagesEN.CASESTUDY_GET_CHARIZARD);
            constructor.constructText();
            Pokemon charizard = factory.getPokemon("CHARIZARD");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CALL_CHARIZARD);
            constructor.constructText();
            charizard.callPokemon();

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_POKE_FACTORY);
            constructor.constructText();
            PokemonFactory factory = new PokemonFactory();

            constructor.setCurrentText(MessagesPT.CASESTUDY_GET_PIKACHU);
            constructor.constructText();
            Pokemon pikachu = factory.getPokemon("PIKACHU");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CALL_PIKACHU);
            constructor.constructText();
            pikachu.callPokemon();

            constructor.setCurrentText(MessagesPT.CASESTUDY_GET_SQUIRTLE);
            constructor.constructText();
            Pokemon squirtle = factory.getPokemon("SQUIRTLE");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CALL_SQUIRTLE);
            constructor.constructText();
            squirtle.callPokemon();

            constructor.setCurrentText(MessagesPT.CASESTUDY_GET_CHARIZARD);
            constructor.constructText();
            Pokemon charizard = factory.getPokemon("CHARIZARD");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CALL_CHARIZARD);
            constructor.constructText();
            charizard.callPokemon();

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/factory_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementFlyweight(TextsConstructor constructor) {


        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_FLYWEIGHT_EXPL);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_FLYWEIGHT_EXPL_1);
            constructor.constructText();

                for(int i=0; i < 20; ++i) {
                    House house = (House) BuildingFactory.getHouse(Colors.getRandomColor());
                    house.setHorizontalCoordinate(Colors.getRandomHorizontalCoord());
                    house.setVerticalCoordinate(Colors.getRandomVerticalCoord());
                    house.setArea(100);
                    house.construct();
                }

            constructor.setCurrentText(MessagesEN.CASESTUDY_FLYWEIGHT_FINAL_EXPL);
            constructor.constructText();

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_FLYWEIGHT_EXPL);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_FLYWEIGHT_EXPL_1);
            constructor.constructText();

            for(int i=0; i < 20; ++i) {
                House house = (House) BuildingFactory.getHouse(Colors.getRandomColor());
                house.setHorizontalCoordinate(Colors.getRandomHorizontalCoord());
                house.setVerticalCoordinate(Colors.getRandomVerticalCoord());
                house.setArea(100);
                house.construct();
            }

            constructor.setCurrentText(MessagesPT.CASESTUDY_FLYWEIGHT_FINAL_EXPL);
            constructor.constructText();

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/flyweight_pattern.htm");

            constructor.constructTextDown(2);

        }
    }

    @Override
    public void implementInterpreter(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            Expression isMale = ExpressionsImpl.getMaleExpression();
            Expression isMarriedWoman = ExpressionsImpl.getMarriedWomanExpression();

            constructor.setCurrentText(MessagesEN.CASESTUDY_INTERPRETER_EXPL);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_INTERPRETER_EXPL_1);
            constructor.constructText();

            System.out.println("John is male? " + isMale.interpret("John"));

            constructor.setCurrentText(MessagesEN.CASESTUDY_INTERPRETER_EXPL_2);
            constructor.constructText();

            System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            Expression isMale = ExpressionsImpl.getMaleExpression();
            Expression isMarriedWoman = ExpressionsImpl.getMarriedWomanExpression();

            constructor.setCurrentText(MessagesPT.CASESTUDY_INTERPRETER_EXPL);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_INTERPRETER_EXPL_1);
            constructor.constructText();

            System.out.println("John is male? " + isMale.interpret("John"));

            constructor.setCurrentText(MessagesPT.CASESTUDY_INTERPRETER_EXPL_2);
            constructor.constructText();

            System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/interpreter_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementIterator(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_ITERATOR_1);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_ITERATOR_1_1);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_ITERATOR_1_2);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_ITERATOR_REPOSITORY);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_ITERATOR_INTERATION);
            constructor.constructText();

            DragonBallRepository DBRepository = new DragonBallRepository();

            for(Iterator iter = DBRepository.getIterator(); iter.hasNext();){
                String name = (String)iter.next();
                System.out.println("Character Name: " + name);
            }

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesEN.CASESTUDY_ITERATOR_1);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_ITERATOR_1_1);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_ITERATOR_1_2);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_ITERATOR_REPOSITORY);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_ITERATOR_INTERATION);
            constructor.constructText();

            DragonBallRepository DBRepository = new DragonBallRepository();

            for(Iterator iter = DBRepository.getIterator(); iter.hasNext();){
                String name = (String)iter.next();
                System.out.println("Character Name: " + name);
            }

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/iterator_pattern.htm");

            constructor.constructTextDown(2);
        }
    }

    @Override
    public void implementMediator(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEDIATOR_1);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEDIATOR_2);
            constructor.constructText();

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEDIATOR_3);
            constructor.constructText();

            Flight flight1 = new Flight("747",10,40,55);
            Flight flight2 = new Flight("1011",50,45,0);
            Flight flight3 = new Flight("112",70,11,44);

            flight1.sendMessage("Hi! My position now is: Lat: " + flight1.getLatitude() + "; Long: " + flight1.getLongitude() + "; Alt: " + flight1.getAltitude());
            flight1.sendMessage("I am in an airport. My position now is: Lat: " + flight2.getLatitude() + "; Long: " + flight2.getLongitude() + "; Alt: " + flight2.getAltitude());
            flight1.sendMessage("Hello mates! My position now is: Lat: " + flight3.getLatitude() + "; Long: " + flight3.getLongitude() + "; Alt: " + flight3.getAltitude());

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEDIATOR_1);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEDIATOR_2);
            constructor.constructText();

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEDIATOR_3);
            constructor.constructText();

            Flight flight1 = new Flight("747",10,40,55);
            Flight flight2 = new Flight("1011",50,45,0);
            Flight flight3 = new Flight("112",70,11,44);

            flight1.sendMessage("Hi! My position now is: Lat: " + flight1.getLatitude() + "; Long: " + flight1.getLongitude() + "; Alt: " + flight1.getAltitude());
            flight1.sendMessage("I am in an airport. My position now is: Lat: " + flight2.getLatitude() + "; Long: " + flight2.getLongitude() + "; Alt: " + flight2.getAltitude());
            flight1.sendMessage("Hello mates! My position now is: Lat: " + flight3.getLatitude() + "; Long: " + flight3.getLongitude() + "; Alt: " + flight3.getAltitude());

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/mediator_pattern.htm");

            constructor.constructTextDown(2);
        }

    }

    @Override
    public void implementMemento(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEMENTO_CREATE_ORIGINATOR);
            constructor.constructText();
            Originator originator = new Originator();

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEMENTO_CREATE_CARETAKER);
            constructor.constructText();
            CareTaker careTaker = new CareTaker();

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEMENTO_SET_STATE_1_AND_2_AND_SAVE_2);
            constructor.constructText();
            originator.setState("State #1");
            originator.setState("State #2");
            careTaker.add(originator.saveStateToMemento());

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEMENTO_SET_AND_SAVE_STATE_3);
            constructor.constructText();
            originator.setState("State #3");
            careTaker.add(originator.saveStateToMemento());

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEMENTO_SET_AND_GET_STATE_4);
            constructor.constructText();
            originator.setState("State #4");
            System.out.println("Current State: " + originator.getState());

            constructor.setCurrentText(MessagesPT.CASESTUDY_MEMENTO_CHECK_SAVED_STATES);
            constructor.constructText();
            originator.getStateFromMemento(careTaker.get(0));
            System.out.println("First saved State: " + originator.getState());
            originator.getStateFromMemento(careTaker.get(1));
            System.out.println("Second saved State: " + originator.getState());

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/memento_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEMENTO_CREATE_ORIGINATOR);
            constructor.constructText();
            Originator originator = new Originator();

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEMENTO_CREATE_CARETAKER);
            constructor.constructText();
            CareTaker careTaker = new CareTaker();

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEMENTO_SET_STATE_1_AND_2_AND_SAVE_2);
            constructor.constructText();
            originator.setState("State #1");
            originator.setState("State #2");
            careTaker.add(originator.saveStateToMemento());

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEMENTO_SET_AND_SAVE_STATE_3);
            constructor.constructText();
            originator.setState("State #3");
            careTaker.add(originator.saveStateToMemento());

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEMENTO_SET_AND_GET_STATE_4);
            constructor.constructText();
            originator.setState("State #4");
            System.out.println("Current State: " + originator.getState());

            constructor.setCurrentText(MessagesEN.CASESTUDY_MEMENTO_CHECK_SAVED_STATES);
            constructor.constructText();
            originator.getStateFromMemento(careTaker.get(0));
            System.out.println("First saved State: " + originator.getState());
            originator.getStateFromMemento(careTaker.get(1));
            System.out.println("Second saved State: " + originator.getState());

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/memento_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementNullObject(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_GET_ALL_CUSTOMERS_BY_NAME);
            constructor.constructText();
            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_FOUR_CUSTOMERS);
            constructor.constructText();

            AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
            AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
            AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
            AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

            constructor.setCurrentText(MessagesEN.CASESTUDY_CHECK_CUSTOMERS);
            constructor.constructText();

            System.out.println("Customers:");
            System.out.println(customer1.getName());
            System.out.println(customer2.getName());
            System.out.println(customer3.getName());
            System.out.println(customer4.getName());

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_GET_ALL_CUSTOMERS_BY_NAME);
            constructor.constructText();
            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_FOUR_CUSTOMERS);
            constructor.constructText();

            AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");
            AbstractCustomer customer2 = CustomerFactory.getCustomer("Bob");
            AbstractCustomer customer3 = CustomerFactory.getCustomer("Julie");
            AbstractCustomer customer4 = CustomerFactory.getCustomer("Laura");

            constructor.setCurrentText(MessagesPT.CASESTUDY_CHECK_CUSTOMERS);
            constructor.constructText();

            System.out.println("Customers:");
            System.out.println(customer1.getName());
            System.out.println(customer2.getName());
            System.out.println(customer3.getName());
            System.out.println(customer4.getName());

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/null_object_pattern.htm");

            constructor.constructTextDown(2);

        }

    }

    @Override
    public void implementObjectPool(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_GET_ALL_CUSTOMERS_BY_NAME);
            constructor.constructText();
            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_FOUR_CUSTOMERS);
            constructor.constructText();

            final ExpensiveResourcePool pool = new ExpensiveResourcePool(3);

            System.out.println("Simple usage");
            System.out.println();
            System.out.println("Pool size:" + pool.size());

            /* simple usage - get the object */
            ExpensiveResource obj0 = (ExpensiveResource) pool.get();
            /* simple usage - use the object */
            obj0.doSomething();

            /* to check that the object was removed from the pool */
            System.out.println("Pool size:" + pool.size());

            /* simple usage - return the object */
            pool.release((BlockingQueue) obj0);

            System.out.println();
            System.out.println("extended usage");
            System.out.println();

            final ExpensiveResource obj1 = (ExpensiveResource) pool.get();
            ExpensiveResource obj2 = (ExpensiveResource) pool.get();
            ExpensiveResource obj3 = (ExpensiveResource) pool.get();

            /* to check that the object was removed from the pool */
            System.out.println("Pool size:" + pool.size());
            obj1.doSomething();
            obj2.doSomething();
            obj3.doSomething();

            /* create a new thread to simulate the long operation for obj1 - this will avoid blocking the test app */
            Runnable exec = new Runnable() {

                @Override
                public void run() {
                    try {
                        Thread.sleep(10 * 1000);
                    } catch (InterruptedException e)	{
                        e.printStackTrace();
                    }
                    pool.release((BlockingQueue) obj1);
                }
            };
            Thread thread = new Thread(exec);
            thread.start();

            /* will wait until the thread will finish and will return the object to the pool - 10 sec
             * will be the same object as for obj1.
             */
            System.out.println("Pool size:" + pool.size());
            ExpensiveResource obj4 = (ExpensiveResource) pool.get();
            obj4.doSomething();

            /*return all objects to the pool */
            pool.release((BlockingQueue) obj4);
            pool.release((BlockingQueue) obj2);
            pool.release((BlockingQueue) obj3);

            /* check the pool size */
            System.out.println("Pool size:" + pool.size());

            /* shutdown the pool*/
            pool.shutdown();

            /* check the pool size */
            System.out.println("Pool size:" + pool.size());

            constructor.constructTextDown(2);

            System.out.println("Source: https://sourcemaking.com/design_patterns/object_pool/java");

            constructor.constructTextDown(2);

        }else{



        }
    }

    @Override
    public void implementObserver(TextsConstructor constructor) {

        if (constructor instanceof TextsConstructorEN) {

            constructor.setCurrentText(MessagesEN.CASESTUDY_CREATE_SUBJECT_TO_BE_OBSERVED);
            constructor.constructText();

            Subject subject = new Subject();

            constructor.setCurrentText(MessagesEN.CASESTUDY_ADD_THREE_OBSERVERS);
            constructor.constructText();

            new HexaObserver(subject);
            new OctalObserver(subject);
            new BinaryObserver(subject);

            constructor.setCurrentText(MessagesEN.CASESTUDY_SET_STATE);
            constructor.constructText();

            System.out.println("First state change: 15");
            subject.setState(15);
            System.out.println("Second state change: 10");
            subject.setState(10);

            constructor.constructTextDown(2);

            System.out.println("Source: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm");

            constructor.constructTextDown(2);

        }else{

            constructor.setCurrentText(MessagesPT.CASESTUDY_CREATE_SUBJECT_TO_BE_OBSERVED);
            constructor.constructText();

            Subject subject = new Subject();

            constructor.setCurrentText(MessagesPT.CASESTUDY_ADD_THREE_OBSERVERS);
            constructor.constructText();

            new HexaObserver(subject);
            new OctalObserver(subject);
            new BinaryObserver(subject);

            constructor.setCurrentText(MessagesPT.CASESTUDY_SET_STATE);
            constructor.constructText();

            System.out.println("First state change: 15");
            subject.setState(15);
            System.out.println("Second state change: 10");
            subject.setState(10);

            constructor.constructTextDown(2);

            System.out.println("Fonte: https://www.tutorialspoint.com/design_pattern/observer_pattern.htm");

            constructor.constructTextDown(2);

        }
    }
}
