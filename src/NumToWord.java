import java.util.HashMap;
import java.util.Locale;

public class NumToWord implements Numbers {

    private final HashMap <String,Integer> numToWord = new HashMap<>();
    private String word = "";
    private int wordValue = 0;
    NumToWord(){
        loadReferenceValues();
    }
    NumToWord(String word){
        loadReferenceValues();
        System.out.println(checkValue(word.toUpperCase()));
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getWordValue() {
        return wordValue;
    }

    public void setWordValue(int wordValue) {
        this.wordValue = wordValue;
    }



    private void  loadReferenceValues(){
       numToWord.put("ON",ON);
       numToWord.put("TW",TW);
       numToWord.put("TH",TH);
       numToWord.put("FO",FO);
       numToWord.put("FI",FI);
       numToWord.put("SI",SI);
       numToWord.put("SE",SE);
       numToWord.put("EI",EI);
       numToWord.put("NI",NI);
       numToWord.put("EN",EN);
       numToWord.put("EL",EL);
       numToWord.put("VE",VE);
       numToWord.put("TY",TY);
       numToWord.put("HUNDRED",HUNDRED);
       numToWord.put("THOUSAND",THOUSAND);
       numToWord.put("MILLION",MILLION);
       numToWord.put("BILLION",BILLION);
    }

    private Integer checkValue(String word){
        int firstValue = 0,secondValue = 0;
        String firstTwo = word.substring(0, 2);
        String lastTwo = word.substring(word.length() - 2);
        boolean ignoreValue = !(word.equals("HUNDRED")
                || word.equals("THOUSAND")
                || word.equals("MILLION")
                || word.equals("BILLION"));

        if (ignoreValue) {
            if (numToWord.containsKey(firstTwo)) {
                firstValue = numToWord.get(firstTwo);
            }

            if (numToWord.containsKey(lastTwo)) {
                secondValue = numToWord.get(lastTwo);
            }

            if (!lastTwo.equals("TY")) {
                return firstValue + secondValue;
            }
            return firstValue * secondValue;
        }
        return numToWord.get(word);
    }
}
