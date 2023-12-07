/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Exception;

import java.util.Scanner;

/**
 *
 * @author mza
 */
public class throwException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlKaki;
        System.out.println("Berapa jumlah kaki Kerbau ? ");
        try{
            System.out.println("Jumlah kaki : ");
            jmlKaki = input.nextInt();
            if(jmlKaki != 4){
                throw new NullPointerException("Terjadi Kesalahan Nih!");
                
            }else{
                System.out.println("Benar Jumlah kaki Kerbau 4");
            }
            
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        
    }
}
