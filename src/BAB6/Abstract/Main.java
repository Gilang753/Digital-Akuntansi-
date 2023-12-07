/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.Abstract;

/**
 *
 * @author mza
 */
public class Main {
    public static void main (String[]args){
        SepedaMotor spd = new SepedaMotor();
        System.out.println("Sepeda Motor mempunyai Roda : " + spd.jmlRoda);
        System.out.println("Sepeda Motor " + spd.nyalakanMesin());
        
        Mobil mb = new Mobil();
        System.out.println("Mobil mempunyai Roda : " + mb.jmlRoda);
        System.out.println("Mobil " + mb.nyalakanMesin());
        
    }
}
