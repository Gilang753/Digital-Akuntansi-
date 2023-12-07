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
public class Mobil extends Kendaraan{
    int jmlRoda;

    public Mobil() {
        this.jmlRoda = 4;
    }
    
    @Override
    public String nyalakanMesin(){
        return "Menyalakan Mesin dengan Disel";
    }
}
