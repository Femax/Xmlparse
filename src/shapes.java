/**
 * Created by fedosovmax on 11.10.15.
 */
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


    @XmlRootElement
    public class shapes {



        String color;
        double area;

        @XmlElement
        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }

