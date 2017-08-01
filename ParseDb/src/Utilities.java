import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Utilities {

    public static NodeList accessDomDoc() {

        try {

            File xmlFileToParse = new File("C:\\DATA\\ControllerDatabases\\201707170701.BSC340.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFileToParse);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("managedObject");

            return nList;
        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;

    }
}
