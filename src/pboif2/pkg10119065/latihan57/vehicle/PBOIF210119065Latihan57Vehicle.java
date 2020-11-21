package pboif2.pkg10119065.latihan57.vehicle;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Vehicle dengan objek
 */
public class PBOIF210119065Latihan57Vehicle {
    
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Trek Bike", "7.4FX");
        bicycle.setGearCount(23);
        System.out.println("Jumlah Gear : "+bicycle.getGearCount());
        System.out.println("");
    
        Skateboard skateboard = new Skateboard("Ally Skate", "Rocket");
        skateboard.setMyModel("5.45");
        System.out.println("Panjangnya Board : "+skateboard.getMyModel());
    }
    
}
