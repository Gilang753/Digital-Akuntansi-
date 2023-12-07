/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB7.Polimorfisme;

/**
 *
 * @author mza
 */
public class G0001 extends Pembayaran{
    public String nama, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;

    public G0001() {
        nama = "Muhammad Bagus";
        kode = "G0001";
        saldo = 500000;
        alamat = "Jember, Ambulu";
    }
    
    @Override
    double cekKode(String input){
        if (input.compareTo(kode) == 0){
            diskon = 0.2;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran(double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member G0001 dengan diskon 20%");
    }
}
