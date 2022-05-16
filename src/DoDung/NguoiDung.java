/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoDung;

/**
 *
 * @author Admin
 */
public class NguoiDung {
    String user,sdt,pass,confilmpass;

    public NguoiDung() {
    }

    public NguoiDung(String user, String sdt, String pass, String confilmpass) {
        this.user = user;
        this.sdt = sdt;
        this.pass = pass;
        this.confilmpass = confilmpass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConfilmpass() {
        return confilmpass;
    }

    public void setConfilmpass(String confilmpass) {
        this.confilmpass = confilmpass;
    }
    
}
