/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB6.Abstract;

/**
 *
 * @author mza
 */
public class Gaji_reward extends Gaji_abs_reward{
    //Atribut
    double tunj_bonus, gajipokok, tunj_anak, anak;
    int waktu, menit;

    public Gaji_reward() {
        this.gajipokok = 4500000;
    }
    
    //Method
    @Override
    public double tunjanganAnak(){
        if (anak == 0){
            tunj_anak = gajipokok;
        }
        if (anak == 1){
            tunj_anak = gajipokok * 10/100;
        }
        else{
            tunj_anak = gajipokok * 20/100;
        }
        return tunj_anak;
    }
    
    @Override
    public double lembur(){
        waktu = menit / 60;
        tunj_bonus = waktu * 25000;
        return tunj_bonus;
    }
    
}
