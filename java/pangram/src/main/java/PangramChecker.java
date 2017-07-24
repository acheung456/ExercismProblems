import static java.lang.Character.toUpperCase;

public class PangramChecker {

    public boolean isPangram(String input) {
        char letter = 'a';
        while(letter != 'z' + 1){
            if(input.indexOf(letter) < 0 && input.indexOf(toUpperCase(letter)) < 0){
                return false;
            }
            letter++;
        }
        return true;
    }

}
