import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class DatabaseCreating {

    public static void createDatabaseByObject(String[] databaseNsnXmlObjects) throws CustomExceptions {

        String objectClass;
        String parameterName;
        int startPosition;
        int lastPosition;

        try {


            File file = new File("C:\\DATA\\Mentor projects\\SQLtable.txt");
            FileWriter fileWriter = new FileWriter(file);

            HashSet<DatabaseObject> uniqueObjects = new HashSet<>();

            for (String result : databaseNsnXmlObjects
                    ) {
                objectClass = result;
                parameterName = result;
                startPosition = objectClass.indexOf("]|");
                lastPosition = objectClass.lastIndexOf(":");
                objectClass.substring(startPosition, lastPosition);

                startPosition = objectClass.indexOf("[");
                lastPosition = objectClass.lastIndexOf("]");
                parameterName.substring(startPosition, lastPosition);

                uniqueObjects.add(new DatabaseObject(objectClass, parameterName));
            }


            String objectClassToPrint = uniqueObjects.stream().map(DatabaseObject::getClassObject).collect(Collectors.joining("///"));
            String parameterNameToPrint = uniqueObjects.stream().map(DatabaseObject::getParameterName).collect(Collectors.joining("|||"));

            fileWriter.append(objectClassToPrint + "******" + parameterNameToPrint);

            fileWriter.flush();
            fileWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(DatabaseCreating.class.getName()).log(new LogRecord(Level.WARNING, "File in this directory does not exist"));
            throw new CustomExceptions(ex);
        }
        System.out.println();
    }

}

