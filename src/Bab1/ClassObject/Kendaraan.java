/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab1.ClassObject;

/**
 *
 * @author mza
 */
public class Kendaraan {
    //Atribut
    String nama, warna, merk;
    
    //Method
    int jmlroda(int jml)
    {
        return jml;
    }
    void kendaraanMaju(){
        System.out.println("Berjalan Maju");
    }
    void kendaraanMundur(){
        System.out.println("Berjalan Mundur");
    }
    void kendaraanBerhenti(){
        System.out.println("Kendaraan Berhenti");
    }
    
}
