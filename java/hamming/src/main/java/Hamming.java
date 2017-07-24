public class Hamming {
    String _leftStrand;
    String _rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if( leftStrand.length() != rightStrand.length())
        {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        _leftStrand = leftStrand;
        _rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        if( _leftStrand.length() == 0 ) {
            return 0;
        }

        int i = 0;
        int hammingDistance = 0;
        while(i < _leftStrand.length()){
            if(_leftStrand.charAt(i) != _rightStrand.charAt(i)){
                hammingDistance++;
            }
            
            i++;
        }
        
        return hammingDistance;
    }

}
