/**
 * Created by fedosovmax on 11.10.15.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class square extends shapes {

    float size;

    public float getSize() {
        return size;
    }
    @XmlElement
    public void setSize(float size) {
        this.size = size;
    }
    public void area(){

        this.area=this.size*this.size;
    }

}
