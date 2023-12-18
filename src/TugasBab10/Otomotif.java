/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab10;

import TugasBab9.*;
import TugasBab7.*;
import TugasBab6.*;



/**
 *
 * @author mza
 */
public class Otomotif extends Dealer{
    String merek;
    String harga;
    String model;
    int tahun;
    // Method
    @Override
    public String cetakNamaDealer(){
        return namaDealer;
    }
    @Override
    public String cetakAlamat(){
        return alamat;
    }
    
    public String cetakMerek() {
        return merek;
    }
    public String cetakHarga() {
        return harga;
    }
    //Static Polimorfisme
    public String cetak(String model) {
        return model;
    }
    public int cetak(int tahun) {
        return tahun;
    }
}
