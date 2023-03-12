
package bangunruang;
import java.util.Scanner;

public class Bola {
    //atribut
    public double radius;
    public double volume;
    
    //kontruktor
    public Bola(double radius){
        this.radius = radius;
    }
    
    public void ComputeAndSetVolume(){
        //compute volume
        double calculate_vol = 4 * ( Math.PI * this.radius * this.radius * this.radius) / 3;
        //set volume
        this.volume = calculate_vol;
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
