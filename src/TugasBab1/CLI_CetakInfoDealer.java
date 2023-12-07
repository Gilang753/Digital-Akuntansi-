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
public class CLI_CetakInfoDealer {
    public static void main (String[]args)
    {
        Dealer Mobil = new Dealer(); //Object Mobil dari class Dealer
        
        System.out.println("Dealer Penjualan Mobil");
        System.out.println("----------------------");
        //output dari atribut namaDealer diambil dari nilai default/method konstruktor pada class dealer. 
        System.out.println("Nama Dealer : "+Mobil.namaDealer); 
        System.out.println("Alamat Dealer : "+Mobil.alamat);
        
        System.out.println("Lihat Mobil Yang Tersedia");
        //output dari daftarKendaraan bernilai null karena pada class dealer tidak menggunakan method konstruktor.
        System.out.println("Daftar Mobil : \n"+Mobil.daftarKendaraan);
        
    }
}
