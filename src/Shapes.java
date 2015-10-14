/**
 * Created by fedosovmax on 16.10.15.
 */

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement

@XmlAccessorType(XmlAccessType.FIELD)
public class Shapes {

    @XmlElements({
            @XmlElement(name = "triangle", type = Triangle.class),
            @XmlElement(name = "circle", type = Circle.class),
            @XmlElement(name = "rectangle", type = Rectangle.class),
            @XmlElement(name = "square", type = Square.class)
    })
    public ArrayList<Shape> shapes;


}