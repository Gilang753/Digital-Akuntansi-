/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab4;

/**
 *
 * @author mza
 */
public class Dealer {
    // Atribut
    String namaDealer;
    String alamat;
    private String daftarKendaraan;
    //Method
    public String cetakNamaDealer()
    {
        return namaDealer;
    }
    public String cetakAlamat()
    {
        return alamat;
    }
    // Method untuk mengatur nilai daftarKendaraan (Setter)
    public void aturDaftarKendaraan(String daftarKendaraan) {
        this.daftarKendaraan = daftarKendaraan;
    }

    // Method untuk mengambil nilai daftarKendaraan (Getter)
    public String dapatkanDaftarKendaraan() {
        return daftarKendaraan;
    }
    
    public Dealer()
    {
        this.namaDealer = "BMW Indonesia";
        this.alamat = "Jl.Raya Losawi, Singosari, Malang";
    }
}

