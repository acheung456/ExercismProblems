class Acronym {
    String _phrase;

    Acronym(String phrase) {
        _phrase = phrase;
    }

    String get() {
        String[] phraseArr = _phrase.split("[ -]");
        String acronym = "";
        for(String phrase : phraseArr){
            acronym += phrase.substring(0,1).toUpperCase();
        }

        return acronym;
    }

}
