/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3.Inheritance;

/**
 *
 * @author mza
 */
public class Limas_Segitiga extends Segitiga {
    double tinggiLimas, vol;
    
    double volumeLimas()
    {
        vol = ((0.333 * Luas())* tinggiLimas);
        return vol;
    }
}
