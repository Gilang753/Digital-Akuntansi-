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
public class SepedaMotor extends Otomotif{
    //Atribut
    String merek, jenisKendaraan, harga;
    
    //Method
    public String cetakJenisKendaraan()
    {
        return jenisKendaraan;
    }
    @Override
    public String cetakMerek()
    {
        return merek;
    }
    @Override
    public String cetak(String model)
    {
        return model;
    }
    @Override
    public int cetak(int tahun)
    {
        return tahun;
    }
    @Override
    public String cetakHarga()
    {
        return harga;
    }
}
