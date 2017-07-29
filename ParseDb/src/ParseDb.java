
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ParseDb {

    public static void main(String[] args) {

        try {

            File xmlFileToParse = new File("C:\\DATA\\ControllerDatabases\\201707170701.BSC340.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFileToParse);
            doc.getDocumentElement().normalize();

            System.out.println("The object is:" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("managedObject");

            System.out.println("-----------------------------------");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                System.out.println("\nCurrent Element :" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Object:" + eElement.getAttribute("class"));
                    System.out.println("Object:" + eElement.getElementsByTagName("item").item(0).getTextContent());
                }
            }


        } catch (Exception e) {

            e.printStackTrace();
        }

    }
}
