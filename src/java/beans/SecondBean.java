package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "drugiBean", eager = true)
@ViewScoped
public class SecondBean {

    public SecondBean() {
    }
    //getS -> secondBeanMessage
    public String getSecondBeanMessage(){
        return "Vozdra kaže drugi ManagedBean";
    }
}
