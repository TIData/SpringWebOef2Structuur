/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author bram
 */
public class User {
    
    private boolean receiveNewsletter = true;
    private String[] favFramework;

    public boolean isReceiveNewsletter() {
        return receiveNewsletter;
    }

    public void setReceiveNewsletter(boolean receiveNewsletter) {
        this.receiveNewsletter = receiveNewsletter;
    }

    public String[] getFavFramework() {
        return favFramework;
    }

    public void setFavFramework(String[] favFramework) {
        this.favFramework = favFramework;
    }
    
    
}
