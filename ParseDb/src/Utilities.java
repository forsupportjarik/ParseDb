import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Arrays;

public class Utilities {

    public static Document accessDomDoc(String fileName) {




        String pathName = "C:\\DATA\\ControllerDatabases\\";



        Document doc = null;


        try {

                File xmlFileToParse = new File(pathName + fileName);


                DocumentBuilderFactory dbFactory
                        = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                doc = dBuilder.parse(xmlFileToParse);
                doc.getDocumentElement().normalize();


        } catch (Exception e) {

            e.printStackTrace();
        }

        return doc;
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

    public static String[] getUniqueElements(String[] elements, int length) {


        boolean isUnique = false;
        String result[] = new String[length];

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; i < i; j++) {
                if (elements[i] == elements[j]) {
                    isUnique = true;
                    break;
                }
            }
            if (!isUnique) {
                length = length + 1;
                result[i] = elements[i];
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static String[] getFilesName(String directoryName) {


        File file = new File(directoryName);

        File[] fileList = file.listFiles();

        int count = file.listFiles().length;

        String[] result = new String[count];

        for (int i = 0; i < fileList.length; i++) {

            if (fileList[i].isFile()) {

                file = fileList[i];

                result[i] = file.getName();

            }

        }

        return result;
    }
}
