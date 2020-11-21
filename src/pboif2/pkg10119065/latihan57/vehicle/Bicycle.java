package pboif2.pkg10119065.latihan57.vehicle;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Vehicle dengan objek
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle(String myBrand, String myModel) {
        super(myBrand, myModel);
    }

    public int getGearCount() {
        return myGearCount;
    }

    public void setGearCount(int GearCount) {
        this.myGearCount = GearCount;
    }
    
    
}
