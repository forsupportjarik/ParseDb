import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class DatabaseCreating {

    public static void createDatabaseByObject(String[] databaseNsnXmlObjects) throws IOException {

        File file = new File("");
        FileWriter fileWriter = new FileWriter(file);

        TreeSet<String> uniqueObjects = new TreeSet<>();

        for (String result : databaseNsnXmlObjects) {
            uniqueObjects.add(result);
        }

    }

}

