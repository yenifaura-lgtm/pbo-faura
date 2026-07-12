class Binatang {

    String namaBinatang;

    // Constructor tanpa parameter
    public Binatang() {
    }

    // Constructor dengan parameter
    public Binatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    // Method menampilkan nama binatang
    public void cetakjenis() {
        System.out.println("Nama Binatang  : " + namaBinatang);
    }
}

class Suara extends Binatang {

    String suaraBinatang;

    // Constructor tanpa parameter
    public Suara() {
        super();
    }

    // Constructor dengan parameter
    public Suara(String namaBinatang, String suaraBinatang) {
        super(namaBinatang);
        this.suaraBinatang = suaraBinatang;
    }

    @Override
    public void cetakjenis() {
        super.cetakjenis();
        System.out.println("Suara Binatang : " + suaraBinatang);
    }
}

class JenisBinatang extends Suara {

    String kategoriBinatang;

    // Constructor
    public JenisBinatang(String namaBinatang, String suaraBinatang, String kategoriBinatang) {
        super(namaBinatang, suaraBinatang);
        this.kategoriBinatang = kategoriBinatang;
    }

    @Override
    public void cetakjenis() {
        super.cetakjenis();
        System.out.println("Jenis Binatang : " + kategoriBinatang);
    }
}

public class lat807 {

    public static void main(String[] args) {

        JenisBinatang harimau = new JenisBinatang(
                "Harimau",
                "Mengaum",
                "Predator");

        harimau.cetakjenis();
    }
}