import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class DataInput {
    private String fileName;
    ArrayList<String> listOfNums = new ArrayList<>();
    ArrayList<Long> listOfValues = new ArrayList<>();
    NumToWord values = new NumToWord();
    HashMap<Long, String> valueMap = new HashMap<>();
    ArrayList<Long> displayedList = new ArrayList<>();

    DataInput(String fileName) throws IOException {
        this.setFileName(fileName);
        this.readingText();
        this.loadIntoMap();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }



    public void readingText() throws IOException {
        File file = new File(this.getFileName());
        BufferedReader read = new BufferedReader(new FileReader(file));
        String line;
        while((line = read.readLine()) != null){
            listOfNums.add(line);
        }
    }
    private void loadIntoMap(){
        listOfNums.stream().forEach(x -> {
            valueMap.put(values.valueCheck(x),x);
            listOfValues.add(values.valueCheck(x));
        });
        this.output();
    }

    private ArrayList<String> output(){
        return listOfValues.stream().sorted(Comparator.naturalOrder()).map(x -> valueMap.get(x)).collect(ArrayList::new,ArrayList::add, ArrayList::addAll);

    }

    private void twoColumns(){

//        displayedList.add(listOfValues.get(*))
        //NumberOfRows = (int) Math.ceil(TotalElements/NumberOfColumns);
        //NumbOfColumns = (int) Math.ceil(TotalElements/NumberOfRows)
        //for( int row = 0; row < NumTOAdd; i++){
        // int col = 0
        //      while(col<NumbOfColumns&& row< TotalElements){
        //
        //      }
        // }
    }

}
