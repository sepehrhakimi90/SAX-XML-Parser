import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;

/**
 * Created by esephak on 6/10/2017.
 */
public class Parser {
    public static void main(String[] args){

        try {
            File inputFile = new File("input.txt");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            UserHandler userhandler = new UserHandler();
            saxParser.parse(inputFile, userhandler);

            for (Student student : userhandler.students){
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
