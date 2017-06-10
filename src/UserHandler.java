import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by esephak on 6/10/2017.
 */

public class UserHandler extends DefaultHandler {
    boolean bFirstName = false;
    boolean bLastName = false;
    boolean bNickName = false;
    boolean bMarks = false;
    List<Student> students = new ArrayList<>();
    private Student currentStudent;
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes);
        if  (qName.equalsIgnoreCase("student")){
            int rollNo = Integer.parseInt(attributes.getValue("rollno"));
            currentStudent = new Student(rollNo);
        }else if (qName.equalsIgnoreCase("firstname")){
            bFirstName = true;
        }else if (qName.equalsIgnoreCase("lastname")){
            bLastName = true;
        }else if (qName.equalsIgnoreCase("nickname")){
            bNickName = true;
        }else if (qName.equalsIgnoreCase("marks")){
            bMarks = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName);
        if (qName.equalsIgnoreCase("student")){
            students.add(currentStudent);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
        if (bFirstName){
            currentStudent.setFirstName(new String(ch, start, length));
            bFirstName = false;
        }else if (bLastName){
            currentStudent.setLastName( new String(ch, start, length));
            bLastName = false;
        }else if (bNickName){
            currentStudent.setNickName( new String(ch, start, length));
            bNickName = false;
        }else if (bMarks){
            int mark = Integer.parseInt(new String(ch, start, length));
            currentStudent.setMark(mark);
            bMarks = false;
        }
    }
}
