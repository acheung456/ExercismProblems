import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Scrabble {
    private static final Map<String, Integer> _letterValues;
    static {
        _letterValues = new HashMap<String, Integer>();
        _letterValues.put("AEIOULNRST", 1);
        _letterValues.put("DG",2);
        _letterValues.put("BCMP", 3);
        _letterValues.put("FHVWY", 4);
        _letterValues.put("K", 5);
        _letterValues.put("JX", 8);
        _letterValues.put("QZ", 10);
    }

    private int _score = 0;

    Scrabble(String word) {
        for(char letter : word.toUpperCase().toCharArray()){
            _score += _letterValues.entrySet()
                                    .stream()
                                    .filter(entry -> entry.getKey().matches(".*" + letter + ".*"))
                                    .mapToInt(Map.Entry::getValue).sum();
        }
    }

    int getScore() {
        return _score;
    }

}
