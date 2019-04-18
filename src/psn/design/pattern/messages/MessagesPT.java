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
    public static String CONCEPTS_OPTIONS_CHAIN_OF_RESPONSIBILITY = "Padrão Chain of responsibility.";
    public static String CONCEPTS_OPTIONS_COMMAND = "Padrão Command.";
    public static String CONCEPTS_OPTIONS_COMPOSITE = "Padrão Composite.";
    public static String CONCEPTS_OPTIONS_DECORATOR = "Padrão Decorator.";
    public static String CONCEPTS_OPTIONS_FACADE = "Padrão Facade.";

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

    public static String CASESTUDY_COMMAND = "Command.";
    public static String CASESTUDY_COMMAND_TEXT_P1 = " * Encapsula um pedido como um objecto, deixando assim paramatrizar os clientes" +
            " com diferentes pedidos, filas ou pedidos de log, e suporta operações desfazíveis;";
    public static String CASESTUDY_COMMAND_TEXT_P2 = " * Promove a 'invocação do método num objecto' para objecto de full status;";
    public static String CASESTUDY_COMMAND_TEXT_P3 = " * Um retorno orientado a objectos.";
    public static String CASESTUDY_COMMAND_TEXT_P4 = " Precisa de emitir pedidos a objectos sem saber nada sobre a operação" +
            " sendo pedida ou sobre o receptor do pedido.";

    public static String CASESTUDY_COMPOSITE= "Composite.";
    public static String CASESTUDY_COMPOSITE_TEXT_P1 = " * Compor objectos em estruturas de árvores para representar todas as hierarquias." +
            " Composite permite aos clientes tratar objectos individuais e composição de objectos uniformemente;";
    public static String CASESTUDY_COMPOSITE_TEXT_P2 = " * Composição recrusiva;";
    public static String CASESTUDY_COMPOSITE_TEXT_P3 = " * 'Os Diretórios contêm entradas, podendo cada um destes ser um diretório';";
    public static String CASESTUDY_COMPOSITE_TEXT_P4 = " * Hierarquia de um-para-muitos 'tem um' am vez de 'é um'";
    public static String CASESTUDY_COMPOSITE_TEXT_P5 = " A aplicação precisa de manipular uma coleção de hierarquia de objectos 'primitivos'" +
            " e 'compostos'. O processamento de objectos primitivos é lidado de uma forma, e o processamento de objectos compostos de outra" +
            ". Tendo de procurar o 'tipo' de cada objecto antes de tentar processar não é pretendido.";

    public static String CASESTUDY_DECORATOR= "Decorator.";
    public static String CASESTUDY_DECORATOR_TEXT_P1 = " * Anexar responsabilidades adicionais dinamicamente a um objecto. Os Decorators" +
            " fornecem uma alternativa flexivel às sub-classes para extensão de funcionalidade;";
    public static String CASESTUDY_DECORATOR_TEXT_P2 = " * Embelezamento de cliente específico de um objecto central por envolvê-lo" +
            " recursivamente;";
    public static String CASESTUDY_DECORATOR_TEXT_P3 = " * Cobrir uam prenda, colocando-a numa caixa, e envolvendo a caixa.";
    public static String CASESTUDY_DECORATOR_TEXT_P4 = " Tu queres adicionar uma comportamento ou estado a objectos individuais em run-time." +
            " Herança não é viável porque é estático e aplicada a uma classe por inteiro.";

    public static String CASESTUDY_FACADE= "Facade.";
    public static String CASESTUDY_FACADE_TEXT_P1 = " * Fornece uma interface a um conjunto de interfaces num sub-sistema. A Facade define" +
            " uma interface de nível mais elevado que torna o sub-sistema mais simples de ser usado;";
    public static String CASESTUDY_FACADE_TEXT_P2 = " * Envolve um sub-sistema complicado com uma interface simples.";
    public static String CASESTUDY_FACADE_TEXT_P3 = " Um segmento da comunidade cliente precisa de uma interface simplificada para a" +
            " funcionalidade geral de um sub-sistema complexo.";

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

    // Messages used during the case of study implementation - COMMAND
    public static String CASESTUDY_STOCK_CREATION = "1. Em primeiro lugar, estamos a criar três tiposde stocks: bananas," +
            " morangos e laranjas, com diferentes quantidades, sendo isto representado pela class Stock que contém um método" +
            " para comorar stock e outro para vender. Este método é invocado apenas dentro do método execute da interface Order" +
            " que difere de acordo com a class que a implementa. Assim, o método é totalmente encapsualdo.";
    public static String CASESTUDY_BUYSELL_BANANAS_ORDER_EXECUTION = "2.1 Depois executamos as ordens para comprar e vender bananas...";
    public static String CASESTUDY_BUYSELL_STRAWBERRIES_ORDER_EXECUTION = "2.2 A ordem para comprar e vender morangos...";
    public static String CASESTUDY_BUYSELL_ORANGES_ORDER_EXECUTION = "2.3 E a ordem para comprar e vender laranjas...";
    public static String CASESTUDY_BROKER_CREATION = "3. Agora o Broker, que é responsável por registar as ordens e executá-las" +
            " está sendo criada...";
    public static String CASESTUDY_TAKING_FRUITS_ORDERS = "4. Depois, o Broker regista os pedidos na lista para todas as frutas.";
    public static String CASESTUDY_EXECUTING_FRUITS_ORDERS = "5. Finalmente a lista é apagada depois da execução.";

    // Messages used during the case of study implementation - COMPOSITE
    public static String CASESTUDY_EMPLOYEES_CREATION = "1. Em primeiro lugar, devemos criar todos os empregados, desde o CEO ao de mais " +
            "baixo nível na hierarquia da empresa. Assim, nós estanciamos a class Employee para criar o CEO, dois executivos de venda," +
            " dois funcionários de publicidade, um diretor de vendas e um diretor de marketing";
    public static String CASESTUDY_ADD_LOW_LEVELS_1 = "2.1 Agora, é hora de estabalecer a hierarquia através da inicialização da composição" +
            " da 'lista de empregados' do CEO com o Diretor de publicidade e de vendas.";
    public static String CASESTUDY_ADD_LOW_LEVELS_2 = "2.2 Em segundo lugar a lista do Diretor de vendas é composta pelos dois executivos.";
    public static String CASESTUDY_ADD_LOW_LEVELS_3 = "2.3 Por fim a do Diretor de publicidade é composta pelos dois funcionários de publicidade.";
    public static String CASESTUDY_PRINT_ALL_EMPLOYEES = "3. No final, todos os empregados são imprimidos:";
    public static String CASESTUDY_TO_NOT_FORGET = " (Não esquecer que a classe Employee tem o método remove, que deverá ser usado" +
            " quando queremos remover alguém da hierarquia, mas deve ser usado com cuidado porque este empregado poderá ter uma lista" +
            " de outros empregados que também serão removidos...)";

    // Messages used during the case of study implementation - DECORATOR
    public static String CASESTUDY_SMALL_ROOMS_DECORATION = "1. Em primeiro lugar, usando a abordagem explicada anteriormente para decorar" +
            " or quartos envolvendo-os recursivamente, nós criamos três pequenos quartos usando a classe SmallRoom que implementa a" +
            " Interface Room. Todas as decorações são executadas usando as classes específicas de escolhas individuais:";
    public static String CASESTUDY_SMALL_ROOM_1 = "1.1 Primeiro nós criamos um quarto pequeno simples sem decoração;";
    public static String CASESTUDY_SMALL_ROOM_2 = "1.2 Em seguida criamos e decoramos um quarto com paredes brancas e uma vela vermelha;";
    public static String CASESTUDY_SMALL_ROOM_3 = "1.3 O último quarto pequeno possui paredes brancas e chão woody.";
    public static String CASESTUDY_AVERAGE_ROOMS_DECORATION = "2. Outro tipo de quartos são os médios. Usando o mesmo processo, criamos" +
            " outros dois quartos, mas deste tipo:";
    public static String CASESTUDY_AVERAGE_ROOM_1 = "2.1 O primeiro tem paredes brancas, uma vela vermelha e uma cama amarela;";
    public static String CASESTUDY_AVERAGE_ROOM_2 = "2.2 O segundo é decorado por uma vela vermelha e um espelho negro;";
    public static String CASESTUDY_BIG_ROOM_DECORATION = "3. Por fim podemos ter um grande e encantado quarto com paredes azuis, uma cama" +
            " amarela, um chão shiny e uma vela vermelha";

    // Messages used during the case of study implementation - FACADE
    public static String CASESTUDY_INTERFACES_EXPL = "1. Para começar o processo, criamos uma interface de elevado nível chamada Shape," +
            " que irá ser implementada pelas interfaces Circle, Triangle and Rectangle. Depois estas três interfaces terão o seu próprio" +
            " comportamento. Quando queremos desenhar alguma destas formas, por exemplo, através da classe ShapeMaker,apenas temos " +
            "de chamar o método pretendido cujos 'atributos internos' correspondem à forma específica que queremos, mas sempre chamando" +
            " a classe geral.";
    public static String CASESTUDY_SHAPE_MAKER_CREATION = "2. Em segundo lugar criamos o ShapeMaker com três métodos, um por forma," +
            " e será usado para implementar o método draw() (desenhar) pertencente à interface Shape;";
    public static String CASESTUDY_DRAW_CIRCLE = "3.1 Agora, chamando drawCircle() (desenhar circulo) de ShapeMaker, desenhamos" +
            " (uma Shape (Forma));";
    public static String CASESTUDY_DRAW_RECTANGLE = "3.2 Similarmente, fazemos a mesma coisa com o retângulo chamando drawRectangle() +" +
            "(desenhar retângulo);";
    public static String CASESTUDY_DRAW_TRIANGLE = "3.3 E por fim, chamando drawTriangle() (desenhar triângulo), desenhamos um triângulo.";

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
