/**
 * Created by fedosovmax on 11.10.15.
 */



import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType( propOrder = { "color","diameter"})
@XmlRootElement(name = "circle")
public class Circle extends Shape  {


    String color;
    float diameter;

    public String getColor() {
        return color;
    }
    @XmlElement(name = "color")
    public void setColor(String color) {
        this.color = color;
    }

    public float getDiameter() {
        return diameter;
    }

    @XmlElement(name = "diameter")
    public void setDiameter(float diameter) {
        this.diameter = diameter;
    }

    public float getArea(){
        return (float)3.14*this.diameter;
    }
}
