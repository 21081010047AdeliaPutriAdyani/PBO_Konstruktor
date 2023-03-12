
package bangunruang;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        //kubus
        Kubus kotak = new Kubus(5);
        kotak.ComputeAndSetVolume();
        System.out.println("Kubus dengan sisi "+kotak.sisi+" adalah "+kotak.GetVolume());
        System.out.println("------------------------------------------------------------------------------");
        //balok
        Balok perpan = new Balok(6,7,9);
        perpan.ComputeAndSetVolume();
        System.out.println("Balok dengan panjang "+perpan.panjang+", lebar "+perpan.lebar+", dan tinggi "+perpan.tinggi+" adalah "+perpan.GetVolume());
        System.out.println("------------------------------------------------------------------------------");
        //tabung
        Tabung tab = new Tabung(7, 10);
        tab.ComputeAndSetVolume();
        System.out.println("Tabung dengan radius "+tab.radius+" dan tinggi "+tab.tinggi+ " adalah "+tab.GetVolume());
        System.out.println("------------------------------------------------------------------------------");
        //Limas
        LimasSegiEmpat limas = new LimasSegiEmpat(3, 9);
        limas.ComputeAndSetVolume();
        System.out.println("Limas dengan sisi "+limas.sisi+" dan tinggi "+limas.tnggi+" adalah "+limas.GetVolume());
        System.out.println("------------------------------------------------------------------------------");
        //bola
        Bola ball = new Bola(6);
        ball.ComputeAndSetVolume();
        System.out.println("Bola dengan radius "+ball.radius+" adalah "+ball.GetVolume());
        System.out.println("------------------------------------------------------------------------------");
        
    }
    
}
