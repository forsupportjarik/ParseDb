import java.util.TreeSet;

public class DatabaseCreating {

    public static void createDatabaseByObject(String[] databaseNsnXmlObjects) {

        TreeSet<String> uniqueObjects = new TreeSet<>();

        for (String result : databaseNsnXmlObjects) {
            uniqueObjects.add(result);
        }

    }

}
