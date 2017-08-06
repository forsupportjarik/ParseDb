import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Utilities {

    public static Document accessDomDoc() {

        try {

            File xmlFileToParse = new File("C:\\DATA\\ControllerDatabases\\201707170701.BSC340.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFileToParse);
            doc.getDocumentElement().normalize();

            return doc;

        } catch (Exception e) {

            e.printStackTrace();
        }
        return null;

    }

    public static String[] getChildName(Element eElement, String childTag) {


        NodeList nodeList1 = eElement.getElementsByTagName("p");
        int contentLength = nodeList1.getLength();
        String[] resultChildnodes = new String[contentLength];
        for (int j = 0; j < contentLength; j++) {

            Element eElement1 = (Element) nodeList1.item(j);
            childTag = eElement1.getAttribute("name");
            resultChildnodes[j] = childTag;
        }

        return resultChildnodes;
    }

    public static String[] getUniqueElements(String[] elements) {

        return  null;
    }
}
