package psn.design.pattern.messages;

public class MessagesPT {

    public static String LANGUAGES_OPTIONS = "Por favor, escolhe uma língua!";
    public static String INITIAL_QUESTION = "Por favor, escolhe uma opção:";
    public static String CONCEPTS_OPTIONS = "Por favor, escolhe um conceito para explorar:";
    public static String CASESTUDY_OPTIONS = "Por favor, esoolhe um caso de estudo para explorar:";
    public static String CONCEPTS_CONCRECT_OPTIONS = "Por favor, escolhe os conceitos gerais a serem mostrados:";

    public static String INITIAL_OPTIONS_SHOWCONCEPTS = "Mostrar os conceitos!";
    public static String INITIAL_OPTIONS_CASESTUDY = "Mostrar caso de estudo!";
    public static String INITIAL_OPTIONS_BACK = "Voltar ao menu anterior!";

    public static String CONCEPTS_OPTIONS_GENERAL = "Conceitos gerais.";
    public static String CONCEPTS_OPTIONS_ABSTRACTFACTORY = "Padrão Abstract Factory.";
    public static String CONCEPTS_OPTIONS_BUILDER = "Padrão Builder.";

    public static String CONCEPTS_OPTIONS_OVERVIEW = "Visão Geral.";
    public static String CONCEPTS_OPTIONS_CREATIONALPATTERNS = "Padrões criacionais.";
    public static String CONCEPTS_OPTIONS_STRUCTURAL = "Padrões estruturais.";
    public static String CONCEPTS_OPTIONS_BEHAVIORAL = "Padrões comportamentais.";

    public static String CASESTUDY_ABSTRACTFACTORY = "Abstract Factory.";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P1 = " * Fornece uma interface para criar familias de objectos " +
            "relacionadas ou dependentes sem especificar as suas classes concretas;";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P2 = " * Uma hierarquia que encapsula: muitas possíveis 'plataformas'" +
            " e a construção de uma série de 'produtos';";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P3 = " * Um novo operador considerado nocivo.";
    public static String CASESTUDY_ABSTRACTFACTORY_TEXT_P4 = "  Se uma aplicação tem de ser portátil, precisa de encapsular" +
            " dependencias de plataformas. Estas 'plataformas' poderão incluir: sbertura do sistema, operação do sistema," +
            " bases de dados, etc. Frequentemente, esta encapsulação não é engenhada à priori, e uma série de casos de declarações" +
            " #ifdef com opções para todas as plataformas currentement suportadas começam a procriar-se como coelhos ao longo" +
            "do código.";

    // Messages used during the case of study implementation - ABSTRACT FACTORY
    public static String CASESTUDY_CREATE_FACTORIES = " 1. Criando duas fábricas de biscoitos usando o método estático da classe" +
            " FactoryMaker...";
    public static String CASESTUDY_CREATE_PRODUCTS_FACA = " 2. Criando dois diferentes produtos Choc e Maria de produtos usando" +
            " a fábrica A, onde ambos são do tipo A";
    public static String CASESTUDY_CREATE_PRODUCTS_FACB = " 3. Criando 3 diferentes (Cuetara, Oreo e Cream) de productos usando" +
            " a B onde o produto Cuetara é do tipo A e os outros do tipo B";

    public static String CASESTUDY_INTENT = "MOTIVAÇÃO";
    public static String CASESTUDY_PROBLEM = "PROBLEMA";

    public static String TEXT_OVERVIEW_TITLE = "VISÃO GERAL";
    public static String TEXT_OVERVIEW_P1 = "  Na engenharia de software,um padrão de design é uma solução repetitiva para um problema " +
            "que ocorre de forma comum em engenharia de software. Um padrão de design não pode ser diretamente transformado" +
            " em  código. Trata-se de uma descrição ou 'template' para como resolver um problema que pode ser usado em diferentes situações";
    public static String TEXT_OVERVIEW_P2 = "  Os padrões de design são utéis porque:";
    public static String TEXT_OVERVIEW_P2_A = " * Pode acelecar o processo de desenvolvimento fornecendo paradigmas de desenvolvimento" +
            " testados e provados. O design de software eficiente requer questões consideradas que podem não se tornar visíveis até que" +
            " sejam implementadas;";
    public static String TEXT_OVERVIEW_P2_B = " * Reutilizando padrões de design ajuda a prevenir questões subtis que podem causar" +
            "problemas de maior dimensão e melhora a fiabilidade para os programadores e arquitetos familiarizados com os padrões;";
    public static String TEXT_OVERVIEW_P2_C = " * Os padrões permitem aos desenvolvedores comunicarem usando nomes bem conhecidos e " +
            "percetívies para interações de software. Padrões de design podem ser melhorados ao longo do tempo, fazendo-os mais" +
            "robustos que padrões estáticos.";

    public static String TEXT_OVERVIEW_P3 = "" +
            "  No entanto estas técnicas são dificeis de aplicar a um amplo intervalo de problemas. Os padrões de design" +
            " fornecem soluções gerais, documentadas num formato que não requer ligação específica a um problema particular.";

    public static String HALL_UP_DOWN = "************************************************************************************";

    public static String QUIT_MESSAGE = "Até já!";


}
