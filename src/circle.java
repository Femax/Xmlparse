/**
 * Created by fedosovmax on 11.10.15.
 */
import static java.lang.Math.*;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class circle extends shapes {

    float diameter;




    public float getDiametr() {
        return diameter;
    }
    @XmlElement
    public void setDiametr(float diametr) {
        this.diameter = diametr;
    }
    public void area(){
        this.area=PI*diameter;
    }

}
