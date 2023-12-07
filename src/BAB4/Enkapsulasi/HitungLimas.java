/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB4.Enkapsulasi;

/**
 *
 * @author mza
 */
public class HitungLimas {
    private double LuasAlas;
    public double Tinggi;
    double Volume;
    
    
    //setter
    public void setLuasAlas(double LuasAlas){
        this.LuasAlas = LuasAlas;
    }
  
    //getter
    public double getLuasalas()
    {
        return this.LuasAlas;
    }
  
    double volumeLimas(){
       Volume = (1.0/3.0) * LuasAlas * Tinggi; 
       return Volume;
    }
}
