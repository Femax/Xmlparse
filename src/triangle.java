/**
 * Created by fedosovmax on 11.10.15.
 */

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import static java.lang.Math.*;



@XmlRootElement
public class triangle extends shapes {


    float size1;
    float size2;


    float size3;

    public float getSize1() {
        return size1;
    }

    @XmlElement
    public void setSize1(float size1) {
        size1 = size1;
    }


    public float getSize2() {

        return size2;
    }

    @XmlElement
    public void setSize2(float size2) {
        size2 = size2;
    }

    public float getSize3() {
        return size3;
    }

    @XmlElement
    public void setSize3(int size3) {
        size3 = size3;


    }
    public void area (){
        float p=(this.size1+this.size2+this.size3);
        this.area=1/4*sqrt(p*(p-this.size1)*(p-this.size2)*(p-this.size3));
    }
}