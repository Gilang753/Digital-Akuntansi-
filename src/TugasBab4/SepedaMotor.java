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
public class SepedaMotor extends Otomotif{
    //Atribut
    String jenisKendaraan;
    private String informasiKendaraan;
    
    //Method
    public String JenisKendaraan() {
        return jenisKendaraan;
    }
    
    // Method Setter
    public void aturInformasiKendaraan() {
        informasiKendaraan = "Merek   : " + cetakMerek() + "\n" +
                             "Model   : " + cetakModel() + "\n" +
                             "Tahun  : " + cetakTahun() + "\n" +
                             "Harga  : " + dapatkanHarga();
    }

    // Method Getter
    public String dapatkanInformasiKendaraan() {
        return informasiKendaraan;
    }
}
