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
    public static String CONCEPTS_OPTIONS_ABSTRACT_FACTORY = "Padrão Abstract Factory.";
    public static String CONCEPTS_OPTIONS_ADAPTER = "Padrão Adapter.";
    public static String CONCEPTS_OPTIONS_BRIDGE = "Padrão Bridge.";
    public static String CONCEPTS_OPTIONS_BUILDER = "Padrão Builder.";
    public static String CONCEPTS_OPTIONS_CHAIN_OF_RESPONSIBILITY = "Padrão Chain of responsibility";

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

    public static String CASESTUDY_ADAPTER = "Adapter.";
    public static String CASESTUDY_ADAPTER_TEXT_P1 = " * Converter a interface de uma classe noutra que o cliente espera." +
            " O adapter permite que as classes trabalhem juntas de forma que de outra forma não conseguiam devido a incompatibilidade" +
            "de interfaces;";
    public static String CASESTUDY_ADAPTER_TEXT_P2 = " * Envolve uma classe existente numa nova interface;";
    public static String CASESTUDY_ADAPTER_TEXT_P3 = " * A impedância faz corresponder um componente antigo num novo sistema.";
    public static String CASESTUDY_ADAPTER_TEXT_P4 = "  Um coponente 'fora da prateleria' oferece uma funcionalidade convincente que" +
            "tu deverás gostar de reutilizar, mas as suas 'visões do mundo' não são compatívies com a filosofia e arquitecturas" +
            " do sistema correntemente em desenvolvimento.";

    public static String CASESTUDY_BRIDGE = "Bridge.";
    public static String CASESTUDY_NEED_SCHEME = "-- (PRECISA ESQUEMA) --";
    public static String CASESTUDY_NEED_OTHER_SCHEME = "-- (OUTRO ESQUEMA) --";
    public static String CASESTUDY_BRIDGE_TEXT_P1 = " * Desacopla uma abstração da sua implementação para que ambas possam" +
            " variar independentemente;";
    public static String CASESTUDY_BRIDGE_TEXT_P2 = " * Publica a interface herança hierquizada, e esconde a implementação" +
            " na sua própria herança hierquizada;";
    public static String CASESTUDY_BRIDGE_TEXT_P3 = " * Para além do encapsulamento, o isolamento.";
    public static String CASESTUDY_BRIDGE_TEXT_P4 = " O 'endurecimento das artérias dos software' tem ocorrido usando as subclasses" +
            " de uma classe base abstracta para fornecer alternativas de implementação. Isto bloqueia a ligação em tempo de compilação" +
            " entre a interface and implementação. A abstração e implementação não podem extender ou compor independentemente.";
    public static String CASESTUDY_BRIDGE_TEXT_P5_1 = " Considera o domínio da 'linha de agendamento':";
    public static String CASESTUDY_BRIDGE_TEXT_P5_2 = "Existem" +
            " dois tipos de agendamento das linhas, e dois tipos de sistemas operativos ou 'plataformas'. Dada essa abordagem para especialização" +
            ", temos de definir a classe para cada permutação destas duas dimensões. Se adicionarmos uma nova plataforma (como... JVM), qual" +
            " será a nossa hierarquia?";
    public static String CASESTUDY_BRIDGE_TEXT_P5_3 = "E se tivermos três tipos de agendamento de linhas, e quatro tipos" +
            " de plataformas? E se tivessemos cinco de agendamento de linhas, e dez tipos de plataformas? O número de classes que" +
            " teríamos de definir seria o produto entre o número de esquemas de agendamentos e o número de plataformas.";
    public static String CASESTUDY_BRIDGE_TEXT_P5_4 = "O Padrão Bridge" +
            " propõe refacturar esta explosão exponencial de hierarquias em duas hierarquias ortogonais - uma para as abstrações" +
            " independentes de plataformas, e a outra para implementações dependentes de plataformas.";

    public static String CASESTUDY_BUILDER = "Builder.";
    public static String CASESTUDY_BUILDER_TEXT_P1 = " * Separar a constyrucção de um objecto complexo da sua representação" +
            " de forma que que o mesmo processo de construção poderá criar diferentes representações;";
    public static String CASESTUDY_BUILDER_TEXT_P2 = " * Analisar uma representação complexa, criar um de diversos alvos;";
    public static String CASESTUDY_BUILDER_TEXT_P3 = " Uma aplicação precisa de criar os elementos de uma agregação complexa. A" +
            " especificação para a agregação existe numa memória secundária e uma de muitas representações precisa de ser" +
            " construida na memória primária.";

    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY = "Chain of Responsibility.";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P1 = " * Evitar acoplar o emissor de um pedido ao seu receptor dando" +
            " ~mais do que uma hipótese de lidar com o pedido. Encadear os objectos recebidos e passar o pedido ao longo da cadeia até" +
            " que um objecto lide com isto;";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P2 = " * Lançar-e-deixar pedidos com um único fluxo que contém o maior número" +
            " possivel de responsavéis por lidar com o pedido;";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P3 = " * Uma lista ligada orientada a objectos com passagem recursiva.";
    public static String CASESTUDY_CHAIN_OF_RESPONSIBILITY_TEXT_P4 = " Existe um potencialmente número de variável de 'gestores' ou " +
            "'elementos de processamento' ou 'objectos nós', e uma corrente de pedidosque deverão ser geridos. Precisa de processar" +
            " eficientemente os pedidos sem atropelamento das relações entre gestores e precedência, ou mapeamentos de pedido-gestor.";

    // Messages used during the case of study implementation - ABSTRACT FACTORY
    public static String CASESTUDY_CREATE_FACTORIES = " 1. Criando duas fábricas de biscoitos usando o método estático da classe" +
            " FactoryMaker...";
    public static String CASESTUDY_CREATE_PRODUCTS_FACA = " 2. Criando dois diferentes produtos Choc e Maria de produtos usando" +
            " a fábrica A, onde ambos são do tipo A";
    public static String CASESTUDY_CREATE_PRODUCTS_FACB = " 3. Criando 3 diferentes (Cuetara, Oreo e Cream) de productos usando" +
            " a B onde o produto Cuetara é do tipo A e os outros do tipo B";
    public static String CASESTUDY_ABSTRACTFACTORY_DOING_OPERATIONS = " 4. Efectuando algumas operações com os produtos:";

    // Messages used during the case of study implementation - ADAPTER
    public static String CASESTUDY_CREATE_AUDIOPLAYER = "1. Criando os audio players ONE e TWO, que apenas suportam ficheiros .mp3!";
    public static String CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_ONE = "2.1 Reproduzindo a música 'only you.mp3' no audio player ONE...";
    public static String CASESTUDY_PLAY_MP3_FILE_AUDIOPLAYER_TWO = "2.2 Reproduzindo a música 'need to know.mp3' no audio player TWO...";
    public static String CASESTUDY_PLAY_MP4_FILE_AUDIOPLAYER_ONE = "3.1 Reproduzindo a música 'only you.mp4' no audio player ONE, que " +
            "precisa de ser adapatedo usando um método para o efeito. Até agora foi usada a interface MediaPlayer em vez da " +
            "corrente AdvancedMediaPlayer que fornece a possibilidade de ler ficheiros .mp4 e .vlc.";
    public static String CASESTUDY_PLAY_VLC_FILE_AUDIOPLAYER_TWO = "3.2 Reproduzindo a música 'judas.vlc' no audio player TWO, usando o " +
            "mesmo processo usado imediatamente antes.";
    public static String CASESTUDY_PLAY_AVI_FILE_AUDIOPLAYER_TWO = "4. Tentando reproduzir o ficheiro 'love, simon.avi' no audio player TWO," +
            " o que é impossivel porque este audio player não tem um adaptador específico que forneça a possibilidade de ler" +
            " este tipo de ficheiros.";

    // Messages used during the case of study implementation - BRIDGE
    public static String CASESTUDY_EXPLANATION_CIRCLE_STRUCTURE = "0. Neste exemplo existe uma interface API que" +
            " é uma propriedade da classe Circle (através da classe abstracta Shape). As classes concretas, que são mais" +
            " específicas, i.e., têm cores específicas, implementam a interface DrawAPI e são instanciadas criando um objecto" +
            " Circle que extend da classe abstracta Shapee podem usar o método drawCircle sobrepondo a assinatura da DrawAPI.";
    public static String CASESTUDY_CREATE_RED_CIRCLE = "1. Criando um circulo vermelho (Classe RedCircle)...";
    public static String CASESTUDY_CREATE_PURPLE_CIRCLE = "2. Criando um circulo roxo (Classe PurpleCircle)...";
    public static String CASESTUDY_CREATE_BLUE_CIRCLE = "3. Criando um circulo azul (Classe BlueCircle)...";
    public static String CASESTUDY_DRAW_CIRCLES = "4. Desenhando todos os circulos.";

    // Messages used during the case of study implementation - BUILDER
    public static String CASESTUDY_CREATE_MEALBUILDER = "1. Os constructores das refeições estão sendo criados: esta classe" +
            " possui um conjunto de métodos que são chamados de acordo com os pedidos do clientes...";
    public static String CASESTUDY_VEGMEAL_1 = "2.1 O primeiro cliente pediu uma Refeição Vegam que é composta por um" +
            " vegburger e uma coke...";
    public static String CASESTUDY_VEGMEAL_2 = "2.2 Mas ele também pediu uma coke adicional (com este padrão, podemos adicionar" +
            " qualquer item que queiramos, dando ao cliente a possibilidade de pedir o que pretender, e no final ter o preço" +
            " total automaticamente calculado).";
    public static String CASESTUDY_NONVEGMEAL_1 = "3. O segundo cliente apenas pediu uma Refeição Não Vegan...";

    // Messages used during the case of study implementation - CHAIN OF RESPONSIBILITY
    public static String CASESTUDY_CONSTRUCT_CHAIN_OF_LOGGERS = "1. Primeiramente, o logger da cedeia é construído. Esta classe, que tem" +
            " um método estático é responsável por criar os loggers e colocá-los na cadeia através do método .setNextLogger. Neste exemplo" +
            ", estamos a criar um total d e 3 loggers, um é INFO, outro é DEBUG e por fim temos um ERROR;";
    public static String CASESTUDY_PRINTING_INFORMATIONS_LEVEL_1 = "2.1 Depois a mensagem irá ser imprimida de acordo com o nível de cada" +
            " logger incluído na cadeia: primeiro de INFO...";
    public static String CASESTUDY_PRINTING_INFORMATIONS_LEVEL_2 = "2.2 Em seguida a mensagem de DEBUG...";
    public static String CASESTUDY_PRINTING_INFORMATIONS_LEVEL_3 = "2.3 E por último a mensagem de ERROR!";

    public static String CASESTUDY_INTENT = "MOTIVAÇÃO";
    public static String CASESTUDY_PROBLEM = "PROBLEMA";
    public static String CASESTUDY_EXEMPLIFICATION = "EXEMPLO CONCRETO";
    public static String CASESTUDY_MOTIVATION = "MOTIVAÇÃO";

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

    public static String TEXT_CREATIONALPATTERN_CONCEPT_TITLE = "PADRÕES CRIACIONAIS";
    public static String TEXT_CREATIONALPATTERN_CONCEPT_P1 = "  Este design é tudo sobre instanciação. Este padrão pode ser assim dividido" +
            "em padrões de criação de classes e padrões de criação de objectos. Enquanto os padrões de criação de classes usam" +
            "efetivamente a herança no processo de instanciação, os padrões de criação de objectos usam efectivamente a delegação" +
            "para terem o trabalho realizado. Como exemplos destes tipos de padrões temos a abstract factory, builder, factory " +
            "method, object pool, prototype e singleton";

    public static String TEXT_STRUCTURALPATTERN_CONCEPT_TITLE = "PADRÕES ESTRUTURAIS";
    public static String TEXT_STRUCTURALPATTERN_CONCEPT_P1 = "  Este design é tudo sobre composição de Classes e Objectos. Os " +
            "padrões estruturais de criação de classes usam herança para compor interfaces. Os padrões estruturais de criação de objectos " +
            "definem formas de compor objectos para obter novas funcionalidades. Exemplos de tais padrões são o adapter, bridge" +
            ", composite, decorator, façade, flyweight, private class data e proxy.";

    public static String TEXT_BEHAVIORALPATTERN_CONCEPT_TITLE = "PADRÕES COMPORTAMENTAIS";
    public static String TEXT_BEHAVIORALPATTERN_CONCEPT_P1 = "  Este desdign é tudo sobre comunicação entre objectos de classes." +
            ". Os padrões comportamentais são aqueles que estão mais especificamente focados na comunicação entre objectos. " +
            "Exemplos de tais padrões são a chain of responsibility, command, interpreter, iterator, mediator, memento, null object," +
            " observer, state, strategy, template method e visitor";

    public static String HALL_UP_DOWN = "************************************************************************************";

    public static String QUIT_MESSAGE = "Até já!";


}
