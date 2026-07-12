class Aritmatika {

    private int a, b;

    // Constructor
    public Aritmatika(int x, int y) {
        this.a = x;
        this.b = y;
    }

    // Method perkalian
    public int kali() {
        return a * b;
    }

    // Method menampilkan nilai
    public void hasil() {
        System.out.println("Nilai A = " + this.a);
        System.out.println("Nilai B = " + this.b);
    }
}

class Perhitungan extends Aritmatika {

    protected int z;

    // Constructor
    public Perhitungan(int z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    // Method menghitung
    public int Hitung() {
        return z + super.kali();
    }

    // Override method hasil
    @Override
    public void hasil() {
        System.out.println("Nilai Z = " + this.z);
        super.hasil();
    }
}

public class lat805 {

    public static void main(String[] args) {

        Perhitungan matematika = new Perhitungan(5, 4, 3);

        matematika.hasil();
        System.out.println("Hasil Perhitungannya = " + matematika.Hitung());
    }
}