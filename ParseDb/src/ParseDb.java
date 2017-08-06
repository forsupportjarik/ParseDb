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

                        NodeList nodeList1 = eElement.getElementsByTagName("p");
                        int contentLength = nodeList1.getLength();
                        String[] resultChildnodes = new String[contentLength];

                        if (eElement.getNodeName().contains("managedObject")) {


                            String classObject = eElement.getAttribute("class");
                            String idObject = eElement.getAttribute("id");
                            String distName = eElement.getAttribute("distName");
                            String content = eElement.getTextContent();




                            for (int j = 0; j < contentLength; j++) {

                                Element eElement1 = (Element) nodeList1.item(j);
                                childTag = eElement1.getAttribute("name");
                                resultChildnodes[j] = childTag;
                            }

                            result[i] = "|" + Arrays.toString(resultChildnodes)+ "|" + classObject + ": " + idObject + " " + distName + " " + content.replace("\n", "\t");



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
