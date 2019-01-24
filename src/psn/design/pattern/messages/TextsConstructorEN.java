package psn.design.pattern.messages;

public class TextsConstructorEN extends TextsConstructor {

    @Override
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

    @Override
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

    @Override
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
