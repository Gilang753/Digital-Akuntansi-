/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB5.Override_Overload;

/**
 *
 * @author mza
 */
public class LuasPanjangPersegi extends BangunDatar {
    int panjang, lebar;
    
    @Override
    public double Luas()
    {
        return Luas(panjang, lebar);
    }
}
