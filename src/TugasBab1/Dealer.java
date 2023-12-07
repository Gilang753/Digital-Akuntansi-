/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab1;

/**
 *
 * @author mza
 */
public class Dealer {
    //Atribut
    String namaDealer, alamat, daftarKendaraan;
    
    //Method
    void dataNamaDealer(String NamaDealer)
    {
        this.namaDealer = NamaDealer;
    }
    void dataAlamat(String Alamat)
    {
        this.alamat = Alamat;
    }
    void dataDaftarKendaraan(String DaftarKendaraan)
    {
        this.daftarKendaraan = DaftarKendaraan;
    }
    
    String cetakNamaDealer()
    {
        return namaDealer;
    }
    String cetakAlamat()
    {
        return alamat;
    }
    String cetakDaftarKendaraan()
    {
        return daftarKendaraan;
    }
    
    //Method Konstruktor
    public Dealer()
    {
        this.namaDealer = "BMW Indonesia";
        this.alamat = "Jl.Raya Losawi, Singosari, Malang";
    }
    
}
