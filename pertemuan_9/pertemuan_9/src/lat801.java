public class lat801 {
float nilakhir;

    // Constructor
    public lat801(int nilai_akhir) {
        nilakhir = nilai_akhir;
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
        System.out.println("Grade Nilainya = " + grade());
    }

    // Main Program
    public static void main(String[] args) {
        lat801 hasil = new lat801(67);
        hasil.cetak();
    }
}
