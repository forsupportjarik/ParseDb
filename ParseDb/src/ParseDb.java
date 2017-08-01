
import java.io.File;
import java.util.Arrays;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class ParseDb {

    public static String[] domTechniq(NodeList nodeList) {

        int lenght = nodeList.getLength();
        String[] result = new String[lenght];

        try {


            if (nodeList != null) {
                lenght = nodeList.getLength();
                for (int i = 0; i < lenght; i++) {
                    if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nodeList.item(i);


                        if (eElement.getNodeName().contains("managedObject")) {
                            String classObject = eElement.getAttribute("class");
                            String idObject = eElement.getAttribute("id");
                            String distName = eElement.getAttribute("distName");
                            NodeList nl = eElement.getElementsByTagName("adminState");

                            String nameCellOfAdce = nl.toString();
                            result[i] = classObject + ": " + idObject + " " + distName + " " + nameCellOfAdce;
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
