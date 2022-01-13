import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        boolean testFirst = false;
        new DataInput( testFirst ? "NumberTest.txt" : "NumsText.txt" );
    }
}
