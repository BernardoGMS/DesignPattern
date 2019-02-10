package psn.design.pattern.views;
import org.academiadecodigo.bootcamp.Prompt;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;
import psn.design.pattern.messages.MessagesEN;
import psn.design.pattern.messages.MessagesPT;
import psn.design.pattern.appSetter.AppSetter;
import psn.design.pattern.controllers.AbstractsController;

public class MainView implements AbstractsView {

    protected Prompt prompt;
    protected AbstractsController mainController;
    protected AbstractsController conceptsController;
    protected AbstractsController caseStudyController;
    protected AbstractsView conceptsView;
    protected AbstractsView caseStudyView;
    private Integer languageID;
    private AppSetter appSetter;

   public MainView(Prompt prompt, AppSetter appSetter) {

       this.prompt = prompt;
       this.appSetter = appSetter;
       this.languageID = appSetter.getLanguageID();
   }

    public void init(Integer languageID) {

       this.languageID = languageID;

        if ((languageID == 2)) {
            System.out.print(MessagesEN.QUIT_MESSAGE + "/ " + MessagesPT.QUIT_MESSAGE);
            System.out.println("\n");
            System.out.println(MessagesEN.SOURCE_MESSAGE);
            System.exit(0);
        } else {
            mainController.constructOptions(languageID);
        }
    }

    public Integer getLanguageID() {return this.languageID;}

    public AppSetter getAppSetter() {
        return appSetter;
    }

    public void setController(AbstractsController mainController) {
        this.mainController = mainController;
    }

    public void setView(AbstractsView view) { this.conceptsView = view;}

    public void showOptions(MenuInputScanner optionsList) {

       int answer = this.prompt.getUserInput(optionsList);

       if (answer == 3) {
           appSetter.initApp();
           this.languageID = appSetter.getLanguageID();
           appSetter.getMainView().init(languageID);
       }

       if (answer == 1) {

           this.conceptsController = appSetter.getConceptsController();
           conceptsView.setController(conceptsController);
           conceptsView.init(this.languageID);
       }else{

           this.caseStudyController = appSetter.getCaseStudyController();
           this.caseStudyView = appSetter.getCaseStudyView();
           caseStudyView.setController(caseStudyController);
           caseStudyView.init(this.languageID);

       }
    }

    @Override
    public String toString() {

        return (languageID==0) ? "English" : "Português";
    }

    @Override
    public AppSetter getAppGetter() {
        return this.appSetter;
    }
}
