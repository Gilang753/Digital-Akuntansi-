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
public class Otomotif {
    String merek;
    String model;
    String tahun;
    private String harga;

    // Method-method getter dan setter untuk atribut harga
    public void aturHarga(String harga) {
        this.harga = harga;
        
    }

    public String dapatkanHarga() {
        return harga;
    }

    // Method-method lainnya 
    public String cetakMerek() {
        return merek;
    }

    public String cetakModel() {
        return model;
    }

    public String cetakTahun() {
        return tahun;
    }

}
