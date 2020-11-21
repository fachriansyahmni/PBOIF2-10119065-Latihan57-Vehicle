package pboif2.pkg10119065.latihan57.vehicle;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Vehicle dengan objek
 */
public class Vehicle {
    private String myBrand, myModel;

    public Vehicle(String myBrand, String myModel) {
        this.myBrand = myBrand;
        this.myModel = myModel;
        System.out.println("Brand : "+myBrand);
        System.out.println("Model : "+myModel);
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }

    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
}
