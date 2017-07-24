public class RnaTranscription {
    private String swapNucleotide(Character nucleotide){
        if(nucleotide == 'G') { nucleotide = 'C'; }
        else if(nucleotide == 'C') { nucleotide = 'G'; }
        else if(nucleotide == 'T') { nucleotide = 'A'; }
        else if(nucleotide == 'A') { nucleotide = 'U'; }

        return nucleotide.toString();
    }

    public String transcribe(String dnaStrand) {
        if(dnaStrand == null)
            return "";

        String rnaStrand = new String();
        for(int i=0; i < dnaStrand.length(); i++){
             rnaStrand += swapNucleotide(dnaStrand.charAt(i));
        }

        return rnaStrand;
    }
}