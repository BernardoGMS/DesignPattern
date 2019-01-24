package psn.design.pattern.messages;

public class TextsConstructor {

    protected String currentText;
    protected String currentTitle;
    protected String currentSubTitle;

    public void setCurrentText(String currentText) {

        this.currentText = currentText;
    }

    public void setCurrentTitle(String currentTitle) {

        this.currentTitle = currentTitle;
    }

    public void  setCurrentSubTitle(String currentSubTitle) {

        this.currentSubTitle = currentSubTitle;
    }

    public void constructTextTitle(){

        int index = 1;
        StringBuilder string = new StringBuilder(MessagesEN.HALL_UP_DOWN.length());
        for (char letter : MessagesEN.HALL_UP_DOWN.toCharArray()) {

            if (index == Math.round(MessagesEN.HALL_UP_DOWN.length()/2-this.currentTitle.length()/2)) {
                string.append(this.currentTitle);
            }else{
                string.append(" ");
            }

            index++;
        }

        printTitle(string);

    }

    public void constructTextSubTitle(){

        int index = 1;
        StringBuilder string = new StringBuilder(MessagesEN.HALL_UP_DOWN.length());
        for (char letter : MessagesEN.HALL_UP_DOWN.toCharArray()) {

            if (index == Math.round(MessagesEN.HALL_UP_DOWN.length()/2-this.currentSubTitle.length()/2)) {
                string.append(this.currentSubTitle);
            }else{
                string.append(" ");
            }

            index++;
        }

        System.out.println(string);

    }

    public void constructTextDown(int lineNum) {

        for (int i = 1; i <= lineNum; i++) {
            System.out.println(MessagesEN.HALL_UP_DOWN);
        }
    }

    public void constructText(){

        int index = 1;
        StringBuilder string = new StringBuilder(currentText.toCharArray().length);
        for (char letter : currentText.toCharArray()) {

            if (index%MessagesEN.HALL_UP_DOWN.length() == 0) {
                if (!(letter == ' ')){
                    string.append('-');
                    string.append(System.getProperty("line.separator"));
                    string.append(letter);
                }else{
                    string.append(System.getProperty("line.separator"));
                    string.append(letter);
                }

            }else{
                string.append(letter);
            }

            index++;
        }

        print(string);

    }

    private void printTitle(StringBuilder string) {

        System.out.println(MessagesEN.HALL_UP_DOWN);
        System.out.println(string);
        System.out.println(MessagesEN.HALL_UP_DOWN);
    }



    private void print(StringBuilder string) {

        System.out.println(" ");
        System.out.println(string);
        System.out.println(" ");
    }
}
