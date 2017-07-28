
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ParseDb {

    public static void main(String[] args) {
        
        try{

        File xmlFileToParse = new File("C:\\DATA\\ControllerDatabases\\");
        DocumentBuilderFactory dbFactory
                = DocumentBuilderFactory.newInstance();
        
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(xmlFileToParse);
        doc.getDocumentElement().normalize();
        
    
} catch (Exception e) {

      e.printStackTrace();  
    }
    
    }}
