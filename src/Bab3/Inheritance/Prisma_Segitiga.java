/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bab3.Inheritance;

/**
 *
 * @author mza
 */
public class Prisma_Segitiga extends Segitiga {
    double tinggPrisma, vol;
    
    double volumePrisma()
    {
        vol = (Luas() *tinggPrisma);
        return vol;
    }
}
