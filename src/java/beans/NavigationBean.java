package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationController", eager = true)
@RequestScoped
public class NavigationBean {

    @ManagedProperty(value = "#{param.pageId}")
    private String pageId;

    public NavigationBean() {
    }

    public String moveToWebShopPage() {
        //LOGIKA -> userBean 
        return "webShop";
    }

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    
    

    public String showPage() {
        if ("1".equals(pageId)) {
            return "prviSajt";
        } else if ("2".equals(pageId)) {
            return "drugiSajt";
        } else if ("3".equals(pageId)) {
            return "treciSajt";
        } else {
            return "index";
        }
    }
}
