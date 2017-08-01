
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ParseDb {

    public static String [] domTechniq() {
        
        int lenght = 0;
        String [] result = new String[lenght];
        
        try {

            File xmlFileToParse = new File("C:\\DATA\\ControllerDatabases\\201707170701.BSC340.xml");
            DocumentBuilderFactory dbFactory
                    = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(xmlFileToParse);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("managedObject");
            NodeList nList2 = doc.getChildNodes();
            System.out.println(nList2+"-----------------------------------------------------------------------------------" + nList);

            if (nList != null) {
                lenght = nList.getLength();
                for (int i = 0; i < lenght; i++) {
                    if(nList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nList.item(i);
                        
                        
                        if (eElement.getNodeName().contains("managedObject")) {
                            String classObject = eElement.getAttribute("class");
                            String idObject = eElement.getAttribute("id");
                            
                            result[i] = classObject + ": " + idObject;
                          //System.out.println(result[i].toString());  
                        }
                    }
                }
            }


        } catch (Exception e) {

            e.printStackTrace();
        }
        //System.out.println(lenght);
return result;
    }
}
