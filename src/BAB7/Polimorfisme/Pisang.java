/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme;

/**
 *
 * @author mza
 */
public class Pisang extends Buah {

    public Pisang() {
        this.nama = "Pisang";
    }
    @Override
    void makanBuah()
    {
        System.out.println(nama+"Dimakan dengan dikupas kulitnya sebelum dimakan.");
    }
}
