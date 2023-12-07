/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Exception;

/**
 *
 * @author mza
 */
public class Login {
    private String username, password;
    public String nama;
    public Login(){
        nama = "Muhammad Gilang R F";
        username = "Gilang";
        password = "Gilang123";
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
         this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
         this.password = password;
    }
    boolean CekLogin(String username, String password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    }
    
}
