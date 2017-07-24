import java.util.HashMap;
import java.util.Map;

class RaindropConverter {
    private String _word = "";
    private static final Map<Integer, String> _rainRules;
    static {
        _rainRules = new HashMap<>();
        _rainRules.put(3, "Pling");
        _rainRules.put(5, "Plang");
        _rainRules.put(7, "Plong");
    }

    String convert(int number) {
        _rainRules.forEach((factor, word) -> {
            if(number % factor == 0){
                _word += word;
            }
        });

        if(_word == ""){
            _word += number;
        }

        return _word;
    }

}
