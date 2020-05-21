package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "korisnickiBean", eager = true)
@SessionScoped
public class UserBean {

    private String username;//admin
    private String password;//admin
    //keširan podatak za web shop
    private boolean loggedIn;
    

    public UserBean() {
    }
    
    //Gađa moj bean recimo loginForma.xhtml
    //ako mi proslijedi dobre parametre ide na webShop.xhtml
    public String login(){
        //Ovdje ide poziv ka bazi ili korisnici.txt
        loggedIn = "admin".equals(username) && "admin".equals(password);
        if(loggedIn){
            return "webShop";
        }else{
            return "loginForma";
        }
    }
    
    public void logout(){
        loggedIn = false;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.loggedIn = loggedIn;
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
