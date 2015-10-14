/**
 * Created by fedosovmax on 11.10.15.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.lang.Math.*;


@XmlType(propOrder = {"color", "side"})
@XmlRootElement(name = "triangle")
public class Triangle extends Shape {


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
        float p = this.side[0] + this.side[1] + this.side[2];
        float area = (float) Math.sqrt((double) p * (p - this.side[0]) * (p - this.side[1]) * (p - this.side[2]));
        return area;
    }

}