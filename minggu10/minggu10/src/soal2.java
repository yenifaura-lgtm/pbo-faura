import java.util.Scanner;

class Kalkulator {

    private double angkaSatu;
    private double angkaDua;

    // Setter
    public void setAngkaSatu(double angkaSatu) {
        this.angkaSatu = angkaSatu;
    }

    public void setAngkaDua(double angkaDua) {
        this.angkaDua = angkaDua;
    }

    // Method operasi
    public double penambahan() {
        return angkaSatu + angkaDua;
    }

    public double pengurangan() {
        return angkaSatu - angkaDua;
    }

    public double perkalian() {
        return angkaSatu * angkaDua;
    }

    public double pembagian() {
        if (angkaDua != 0) {
            return angkaSatu / angkaDua;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak bisa!");
            return 0;
        }
    }
}

public class soal2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        System.out.println("===== PROGRAM KALKULATOR =====");

        System.out.print("Masukkan Angka Pertama : ");
        kal.setAngkaSatu(input.nextDouble());

        System.out.print("Masukkan Angka Kedua   : ");
        kal.setAngkaDua(input.nextDouble());

        System.out.println("\n===== HASIL OPERASI =====");
        System.out.println("Penjumlahan : " + kal.penambahan());
        System.out.println("Pengurangan : " + kal.pengurangan());
        System.out.println("Perkalian   : " + kal.perkalian());

        if (kal.pembagian() != 0) {
            System.out.println("Pembagian   : " + kal.pembagian());
        }

        input.close();
    }
}
