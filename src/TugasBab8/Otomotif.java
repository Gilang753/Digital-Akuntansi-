/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab8;

import TugasBab7.*;
import TugasBab6.*;



/**
 *
 * @author mza
 */
public class Otomotif extends Dealer implements Interface_DapatDijual {
    String merek;
    String model;
    int tahun, jumlah = 0;
    double harga;
    double total;

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
    public String cetakModel() {
        return model;
    }
    public int cetakTahun() {
        return tahun;
    }
    public double cetakHarga() {
        return harga;
    }
    public int cetakJumlah() {
        return jumlah;
    }
    @Override
    public double hitungHargaJual(){
        
        if (jumlah == 1){
            total = harga * jumlah;
        }else{
            total = (harga * jumlah)*0.2; //beli lebih dari 1 diskon 20%
        }
        return total;
    }
}
