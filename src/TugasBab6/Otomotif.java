/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab6;



/**
 *
 * @author mza
 */
public class Otomotif extends Dealer{
    String merek;
    String model;
    int tahun;
    String harga;

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
    public String cetakHarga() {
        return harga;
    }
}
