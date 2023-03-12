
package bangunruang;
import java.util.Scanner;

public class Tabung {
    //atribut
    public double radius;
    public double tinggi;
    public double volume;
    
    //kontruktor
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = Math.PI * this.radius * this.radius * this.tinggi;
        //set volume
        this.volume = calculate_vol;
    }   
    
    public double GetVolume(){
        return this.volume;
    }
}
