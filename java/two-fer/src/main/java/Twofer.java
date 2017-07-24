public class Twofer {
    public String twofer(String name) {
        String forName = ( name != null ) ? name : "you";
        String sentence = "One for " + forName + ", one for me.";
        return sentence;
    }
}