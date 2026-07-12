public class lat802 {
float nilakhir;

    // Constructor 1
    public lat802(int nilai_akhir) {
        nilakhir = nilai_akhir;
    }

    // Constructor 2 (Overloading)
    public lat802(int nil1, int nil2) {
        nilakhir = nil1 + nil2;
    }

    // Method untuk menentukan grade
    public String grade() {
        String nilgrade;

        if (nilakhir >= 80)
            nilgrade = "A";
        else if (nilakhir >= 68)
            nilgrade = "B";
        else if (nilakhir >= 56)
            nilgrade = "C";
        else if (nilakhir >= 49)
            nilgrade = "D";
        else
            nilgrade = "E";

        return nilgrade;
    }

    // Method untuk mencetak hasil
    public void cetak() {
        System.out.println("Nilai: " + nilakhir + " | Grade: " + grade());
    }

    // Main Program
    public static void main(String[] args) {

        lat802 hasil = new lat802(67);
        hasil.cetak();

        lat802 hasilnya = new lat802(45, 35);
        hasilnya.cetak();
    }
}
