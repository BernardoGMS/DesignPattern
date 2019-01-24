package psn.design.pattern.messages;

public class TextsConstructorPT extends TextsConstructor{

    @Override
    public void constructTextTitle(){

        int index = 1;
        StringBuilder string = new StringBuilder(MessagesPT.HALL_UP_DOWN.length());
        for (char letter : MessagesPT.HALL_UP_DOWN.toCharArray()) {

            if (index == Math.round(MessagesPT.HALL_UP_DOWN.length()/2-this.currentTitle.length()/2)) {
                string.append(this.currentTitle);
            }else{
                string.append(" ");
            }

            index++;
        }

        printTitle(string);
    }

    @Override
    public void constructText(){

        int index = 1;
        StringBuilder string = new StringBuilder(currentText.toCharArray().length);
        for (char letter : currentText.toCharArray()) {

            if (index%MessagesPT.HALL_UP_DOWN.length() == 0) {
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

    @Override
    public void constructTextSubTitle(){

        int index = 1;
        StringBuilder string = new StringBuilder(MessagesPT.HALL_UP_DOWN.length());
        for (char letter : MessagesPT.HALL_UP_DOWN.toCharArray()) {

            if (index == Math.round(MessagesPT.HALL_UP_DOWN.length()/2-this.currentSubTitle.length()/2)) {
                string.append(this.currentSubTitle);
            }else{
                string.append(" ");
            }

            index++;
        }

        System.out.println(string);

    }

    private void printTitle(StringBuilder string) {

        System.out.println(MessagesPT.HALL_UP_DOWN);
        System.out.println(string);
        System.out.println(MessagesPT.HALL_UP_DOWN);
    }

    private void print(StringBuilder string) {

        System.out.println(" ");
        System.out.println(string);
        System.out.println(" ");
    }
}
