import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class DataInput {
    private String fileName;
    ArrayList<String> listOfNumbers = new ArrayList<>();
    ArrayList<String> orderedListOfNumbers = new ArrayList<>();
    ArrayList<Long> listOfValues = new ArrayList<>();
    NumToWord values = new NumToWord();
    HashMap<Long, String> valueMap = new HashMap<>();

    DataInput(String fileName) throws IOException {
        this.setFileName(fileName);
        this.readingText();
        this.loadIntoMap();
        this.printList(4);
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
            listOfNumbers.add(line);
        }
    }

    private void loadIntoMap(){
        listOfNumbers.forEach(x -> {
            valueMap.put(values.valueCheck(x),x);
            listOfValues.add(values.valueCheck(x));
        });
        orderedListOfNumbers.addAll(this.ordered());
    }

    private ArrayList<String> ordered(){
        return listOfValues.stream()
                .sorted(Comparator.naturalOrder())
                .map(x -> valueMap.get(x))
                .collect(ArrayList::new,ArrayList::add, ArrayList::addAll);
    }

    private void printList(int desiredRows){
        int numberOfColumns = (int) Math.ceil((float)orderedListOfNumbers.size()/(float)desiredRows);
        String[][] outputArray = new String[desiredRows][numberOfColumns];
        int numberOfItems = orderedListOfNumbers.size();
        int item = 0;
        for (int col = 0; col<numberOfColumns;col++){
            for (int row = 0; row<desiredRows;row++){
                if(item < numberOfItems){
                    outputArray[row][col] = orderedListOfNumbers.get(item);
                }
                item++;
            }
        }
        item =0;
        for (int row = 0; row<desiredRows;row++){
            for (int col = 0; col<numberOfColumns;col++){
                if(item < numberOfItems){
                    System.out.print(outputArray[row][col]+" \t| \t");
                }
                item++;
                ;
            }
            System.out.println();
        }

    }


}
