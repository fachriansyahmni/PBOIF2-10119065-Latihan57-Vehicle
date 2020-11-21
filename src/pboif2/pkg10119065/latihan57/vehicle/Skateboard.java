package pboif2.pkg10119065.latihan57.vehicle;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program Vehicle dengan objek
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;

    public Skateboard(String myBrand, String myModel) {
        super(myBrand, myModel);
    }

    public double getBoardLength() {
        return myBoardLength;
    }

    public void setBoardLength(double BoardLength) {
        this.myBoardLength = BoardLength;
    }
    
    
}
