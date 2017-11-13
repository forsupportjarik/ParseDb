import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class DatabaseCreating {

    public static void createDatabaseByObject(String[] databaseNsnXmlObjects) throws CustomExceptions {

        try {


        File file = new File("");
        FileWriter fileWriter = new FileWriter(file);

        TreeSet<String> uniqueObjects = new TreeSet<>();

        for (String result : databaseNsnXmlObjects) {
            uniqueObjects.add(result);
        }







    } catch (IOException ex) {
            Logger.getLogger(DatabaseCreating.class.getName()).log(new LogRecord(Level.WARNING, "File in this directory does not exist"));
            throw new CustomExceptions(ex);
        }
        System.out.println();
    }

}

