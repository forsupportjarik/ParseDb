import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\DATA\\Mentor projects\\ParseDb.txt");
        FileWriter fileWriter = new FileWriter(file);

        Utilities utilities = new Utilities();
        utilities.getFilesName("C:\\DATA\\Mentor projects");

        fileWriter.append(utilities.toString());
        fileWriter.append(Arrays.toString(ParseDb.domTechniq(Utilities.accessDomDoc())).replace(",", "\n"));
        fileWriter.flush();
        fileWriter.close();

        //System.out.println(Arrays.toString(ParseDb.domTechniq(Utilities.accessDomDoc())).replace(",", "\n"));


    }

}
