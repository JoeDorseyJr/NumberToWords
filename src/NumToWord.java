import java.util.HashMap;

public class NumToWord implements Numbers {

    private final HashMap <String,Integer> numToWord = new HashMap<>();

    NumToWord(){
        loadReferenceValues();
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
}
