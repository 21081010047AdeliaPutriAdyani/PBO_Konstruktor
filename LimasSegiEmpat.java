
package bangunruang;
import java.util.Scanner;

public class LimasSegiEmpat {
    //atribut
    public int sisi;
    public int tnggi;
    public int volume;
    
    //kontruktor
    public LimasSegiEmpat(int sisi, int tinggi){
        this.sisi = sisi;
        this.tnggi = tinggi;
    }
    
    public void SetSisi(int sisi){
        this.sisi = sisi;
    }
    
    public void SetTinggi(int tinggi){
        this.tnggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        //compute vol
        int calculate_vol = (this.sisi * this.sisi * this.tnggi) / 3;
        //set volume
        this.volume = calculate_vol;
    }
    
    public int GetVolume(){
        return this.volume;
    }
}
