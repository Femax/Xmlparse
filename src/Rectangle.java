/**
 * Created by fedosovmax on 16.10.15.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"color", "side"})
@XmlRootElement(name = "rectangle")
public class Rectangle extends Shape {


    float[] side;

    public String getColor() {
        return color;
    }

    @XmlElement(name = "color")
    public void setColor(String color) {
        this.color = color;
    }

    public float[] getSide() {
        return side;
    }

    @XmlElement(name = "side")
    public void setSide(float[] side) {
        this.side = side;
    }

    public float getArea() {
        return this.side[0] * this.side[1];
    }
}
