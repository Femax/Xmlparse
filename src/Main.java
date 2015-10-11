
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class Main {

    public static void main(String argv[]) {




                try {

                    File file = new File("/home/fedosovmax/Desktop/shape.xml");
                    JAXBContext jaxbContext = JAXBContext.newInstance(shapes.class);

                    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                    shapes shapes = (shapes) jaxbUnmarshaller.unmarshal(file);
                    System.out.println(shapes);

                } catch (JAXBException e) {
                    e.printStackTrace();
                }


    }
}
