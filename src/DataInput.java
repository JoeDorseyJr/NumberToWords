import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DataInput {
    private String fileName;
    ArrayList<String> listOfNums = new ArrayList<>();
    NumToWord values = new NumToWord();

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }


    DataInput(String fileName) {
    }
    public void readingText(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(this.getFileName()));
            String line;
            while ((line =reader.readLine()) != null){
                listOfNums.add(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
