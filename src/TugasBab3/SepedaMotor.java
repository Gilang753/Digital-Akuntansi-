/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasBab3;

import TugasBab4.*;
import TugasBab3.*;

/**
 *
 * @author mza
 */
public class SepedaMotor extends Otomotif{
    //Atribut
    String informasiKendaraan, jenisKendaraan;
    //Method
    String JenisKendaraan()
    {
        return jenisKendaraan;
    }
    String InformasiKendaraan()
    {
       return informasiKendaraan = "Merek   : "+cetakMerek()+"\n" +"Model   : "+ cetakModel()+"\n" +"Tahun  : "+ cetakTahun()+"\n" +"Harga  : "+ cetakHarga();
    }
}
