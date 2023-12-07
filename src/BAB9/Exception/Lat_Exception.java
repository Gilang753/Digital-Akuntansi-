/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB9.Exception;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author mza
 */
public class Lat_Exception {
    public static void main(String[] args) {
        try{
            int a, b, hasil;
            
            Scanner keyboard = new Scanner(System.in);
            System.out.println("======Program Pembagian======");
            System.out.println("Masukkan Angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan Angka ke 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println(Integer.toString(hasil));
            
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai Pembagi tidak boleh 0 !!","Warning", 2);
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Input yang anda masukkan huruf bukan angka !!","Warning", 2);
        }finally{
            System.out.println("Trimakasih sudah menjalankan program");
        }
    }
}
