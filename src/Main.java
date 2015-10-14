import java.io.File;
import java.text.DecimalFormat;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Main {
    public static void main(String[] args) {

        try {

            File file = new File("/home/fedosovmax/Desktop/shape.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Shapes.class);
            DecimalFormat df = new DecimalFormat("#.##");
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Shapes xmlShapes = (Shapes) jaxbUnmarshaller.unmarshal(file);
           for (int i =0; i<xmlShapes.shapes.size();i++){
               System.out.println("<i>:"+i+"<color>"+xmlShapes.shapes.get(i).getColor()+"-<area>"+df.format(xmlShapes.shapes.get(i).getArea())+"/n");
           }

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }
}