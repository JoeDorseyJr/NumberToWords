import java.util.*;

public class NumToWord implements Numbers {

    private final HashMap <String,Long> wordToNumberMap = new HashMap<>();
    private String word = "";
    private Long wordValue = 0L;

//CONSTRUCTORS
    NumToWord(){
        loadReferenceValues();
    }

    NumToWord(String words){
        loadReferenceValues();
        this.setWord(words);
        String[] word = this.getWord().split("\\s");
        this.setWordValue(wordsToNumber(word));
    }

//GETTER and SETTERS
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word.toUpperCase();
    }

    public Long getWordValue() {
        return wordValue;
    }

    public void setWordValue(Long wordValue) {
        this.wordValue = wordValue;
    }

//METHODS
    private void  loadReferenceValues(){
       wordToNumberMap.put("ON",ON);
       wordToNumberMap.put("TW",TW);
       wordToNumberMap.put("TH",TH);
       wordToNumberMap.put("FO",FO);
       wordToNumberMap.put("FI",FI);
       wordToNumberMap.put("SI",SI);
       wordToNumberMap.put("SE",SE);
       wordToNumberMap.put("EI",EI);
       wordToNumberMap.put("NI",NI);
       wordToNumberMap.put("EN",EN);
       wordToNumberMap.put("EL",EL);
       wordToNumberMap.put("VE",VE);
       wordToNumberMap.put("TY",TY);
       wordToNumberMap.put("HUNDRED",HUNDRED);
       wordToNumberMap.put("THOUSAND",THOUSAND);
       wordToNumberMap.put("MILLION",MILLION);
       wordToNumberMap.put("BILLION",BILLION);
    }

    private Long checkValue(String word){
        Long firstValue = 0L;
        Long secondValue = 0L;
        String firstTwo = word.substring(0, 2);
        String lastTwo = word.substring(word.length() - 2);
        boolean ignoreValue = !(word.equals("HUNDRED")
                || word.equals("THOUSAND")
                || word.equals("MILLION")
                || word.equals("BILLION"));

        if (ignoreValue) {
            if (wordToNumberMap.containsKey(firstTwo)) {
                firstValue = wordToNumberMap.get(firstTwo);
            }

            if (wordToNumberMap.containsKey(lastTwo)) {
                secondValue = wordToNumberMap.get(lastTwo);
            }

            if (!lastTwo.equals("TY")) {
                if ((lastTwo.equals("EN") || lastTwo.equals("VE")) && word.length()<6) {
                    if (word.equals("TEN")){
                        return EN;
                    }
                    return firstValue;
                }
                return firstValue + secondValue;
            }
            return firstValue * secondValue;
        }
        return wordToNumberMap.get(word);
    }

    private Long wordsToNumber(String[] words){
        Stack<Long> values = new Stack<>();
        Stack<Long> results = new Stack<>();
        Long previousValue = 0L;
        Long currentValue = 0L;
        Long number = 0L;
        ArrayList<Long> numbers = new ArrayList<>();

        for (String x : words) {
            values.add(0,checkValue(x));
        }

        while(!values.isEmpty()) {
            currentValue = values.peek();
            if(previousValue>currentValue && previousValue > HUNDRED){
                numbers.add(number);
                number = values.peek();
            } else {
                if (values.peek() < 100) {
                    number += values.peek();
                } else {
                    number *= values.peek();
                }
            }
            results.add(values.pop());
            previousValue = currentValue;
        }
        numbers.add(number);

        return numbers.stream()
                .reduce(Long::sum)
                .orElse(0L);
    }
}
