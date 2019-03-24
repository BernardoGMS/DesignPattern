package psn.design.pattern.designPatterns;

import com.sun.xml.internal.bind.v2.TODO;
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
import psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses.ConsoleLogger;
import psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses.ErrorLogger;
import psn.design.pattern.designPatterns.ChainOfResponsibility.auxClasses.FileLogger;
import psn.design.pattern.designPatterns.Command.auxClasses.Broker;
import psn.design.pattern.designPatterns.Command.auxClasses.BuyStock;
import psn.design.pattern.designPatterns.Command.auxClasses.SellStock;
import psn.design.pattern.designPatterns.Command.auxClasses.Stock;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.messages.TextsConstructor;
import psn.design.pattern.messages.TextsConstructorEN;

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
}
