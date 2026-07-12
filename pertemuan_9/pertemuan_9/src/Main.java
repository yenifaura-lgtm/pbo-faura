class lat804 {
private int a, b;

    // Constructor
    public lat804() {
        a = 1;
        b = 2;
    }

    // Method tambah
    public int tambah() {
        return a + b;
    }

    // Method kali
    public int kali() {
        return b * 3;
    }
}

class Hitungan extends lat804 {

    private int x, y;

    // Constructor tanpa parameter
    public Hitungan() {
        x = 1;
        y = 2;
    }

    // Constructor dengan parameter
    public Hitungan(int i, int j) {
        x = i;
        y = j;
    }

    @Override
    public int tambah() {
        return x + y;
    }

    @Override
    public int kali() {
        return y * 3;
    }
}

public class Main {

    public static void main(String[] args) {

        Hitungan ngitung = new Hitungan(5, 6);

        System.out.println("Hasil Pertambahannya = " + ngitung.tambah());
        System.out.println("Hasil Perkaliannya = " + ngitung.kali());
    }
}
