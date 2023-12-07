/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab5;


/**
 *
 * @author mza
 */
public class Otomotif {
    //Atribut
    String model, merek, harga;
    int tahun;
    
    //Method
    public String cetakMerek()
    {
        return merek;
    }
   
    public String cetakHarga()
    {
        return harga;
    }
    
    //Overload
     public String cetak(String Model)
    {
        return model;
    }
    public int cetak(int Tahun)
    {
        return tahun;
    }
}
