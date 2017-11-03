import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {


        File file = new File("C:\\DATA\\Mentor projects\\ParseDb.txt");
        FileWriter fileWriter = new FileWriter(file);

        Utilities utilities = new Utilities();


        fileWriter.append(Arrays.toString(utilities.getFilesName("C:\\DATA\\ControllerDatabases\\")));
        fileWriter.append(Arrays.toString(ParseDb.domTechniq(Utilities.accessDomDoc(Utilities.getFilesName("C:\\DATA\\ControllerDatabases")))).replace(",", "\n"));
        fileWriter.flush();
        fileWriter.close();

        //System.out.println(Arrays.toString(ParseDb.domTechniq(Utilities.accessDomDoc())).replace(",", "\n"));


    }

}
