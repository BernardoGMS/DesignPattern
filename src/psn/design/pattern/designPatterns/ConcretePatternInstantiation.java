package psn.design.pattern.designPatterns;

import com.sun.xml.internal.bind.v2.TODO;
import psn.design.pattern.designPatterns.AbstractFactory.AbstractFactoryDP;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductA;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.AbstractProductB;
import psn.design.pattern.designPatterns.AbstractFactory.auxClasses.FactoryMaker;
import psn.design.pattern.designPatterns.Adapter.auxClasses.AudioPlayer;
import psn.design.pattern.designPatterns.Bridge.auxClasses.*;
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
}
