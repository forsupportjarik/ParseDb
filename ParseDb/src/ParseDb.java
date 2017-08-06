import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import java.util.Arrays;

public class ParseDb {

    public static String[] domTechniq(Document doc) {

        NodeList nodeList;
        nodeList = doc.getElementsByTagName("managedObject");

        int lenght = nodeList.getLength();

        String childTag = "";
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
                            String content = eElement.getTextContent();

                            result[i] = "|" + Arrays.toString(Utilities.getChildName(eElement, childTag)) + "|" + classObject + ": " + idObject + " " + distName + " " + content.replace("\n", "\t");
Utilities.getUniqueElements(Utilities.getChildName(eElement, childTag), Utilities.getChildName(eElement, childTag).length); // sout for test of unique strings
                        }
                    }
                }
            }

        } catch (Exception e) {

            e.printStackTrace();
        }
        return result;
    }
}
