/**
 * Created by Andrew on 7/22/2017.
 */
public class main {
    public static void main(String[] args) throws Exception {
        Hamming hammers;
        hammers = new Hamming("AGG", "AGA");

        hammers.getHammingDistance();
    }
}
