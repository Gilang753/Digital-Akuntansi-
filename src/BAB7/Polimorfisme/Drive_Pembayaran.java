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
public class Drive_Pembayaran {
    public static void main(String[]args){
        Pembayaran payment = new S0001();
        payment.tampilkanMember();
        
        if (payment instanceof S0001){
            S0001 s0001 = (S0001) payment;
            
            System.out.println("Jenis Member: "+ s0001.member(s0001));
            System.out.println("Total Pembelian: "+ s0001.hitPembayaran(200000));
            System.out.println("Sisa Saldo: "+ s0001.potSaldo());
        }
        
        payment = new G0001();
        payment.tampilkanMember();
        if (payment instanceof G0001){
            G0001 g0001 = (G0001) payment;
            
            System.out.println("Jenis Member: "+ g0001.member(g0001));
            System.out.println("Total Pembelian: "+ g0001.hitPembayaran(200000));
            System.out.println("Sisa Saldo: "+ g0001.potSaldo());
        }
    }
}
