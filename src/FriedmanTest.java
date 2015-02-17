public class FriedmanTest implements Analysis {
 
        //language is needed for the language specific IC
    private Language language;
 
    public FriedmanTest(Language language) {
        this.language = language;
    }
 
        //returns the computed key length
    @Override
    public String analyse(String code) {
        IndexOfCoincidence ic = new IndexOfCoincidence();
        ic.analyse(code);
        double kappaRandom = ic.computeKappaRandom();
        double kappaText = ic.computeKappaText();
        long n = code.length();
        double kappaExpected = language.getIC() / ic.amountOfCharacters();
       
        double keyLength = computeKeyLength(kappaRandom, kappaText,
                kappaExpected, n);
        return "computed key length: " + keyLength;
    }
 
        //uses the formula for the approximate key length
    private double computeKeyLength(double kappaRandom, double kappaText,
            double kappaExpected, long n) {
        return ((kappaExpected - kappaRandom) * n)
                / ((n - 1) * kappaText - kappaRandom * n + kappaExpected);
    }
 
}