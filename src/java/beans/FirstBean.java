package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "prviBean", eager = true)
@ViewScoped
public class FirstBean {

    //Dependency injection - DI Spring  Java EE 
    //JSF
    @ManagedProperty(value = "#{drugiBean}")
    private SecondBean secondBean;

    public FirstBean() {
    }

    public String getMessageFromSecondBean(){
        return secondBean.getSecondBeanMessage();
    }
    
    public void setSecondBean(SecondBean secondBean) {
        this.secondBean = secondBean;
    }

    public SecondBean getSecondBean() {
        return secondBean;
    }

}
