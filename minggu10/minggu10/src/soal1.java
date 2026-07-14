import java.util.Scanner;

class Silinder {
    private double radius;
    private double tinggi;

    // Setter radius
    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius harus lebih besar dari 0!");
        }
    }

    // Setter tinggi
    public void setTinggi(double tinggi) {
        if (tinggi > 0) {
            this.tinggi = tinggi;
        } else {
            System.out.println("Tinggi harus lebih besar dari 0!");
        }
    }

    // Method menghitung volume
    public double hitungVolume() {
        return Math.PI * radius * radius * tinggi;
    }
}

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Silinder tabung = new Silinder();

        System.out.println("===== HITUNG VOLUME SILINDER =====");

        System.out.print("Masukkan Radius : ");
        double radius = input.nextDouble();
        tabung.setRadius(radius);

        System.out.print("Masukkan Tinggi : ");
        double tinggi = input.nextDouble();
        tabung.setTinggi(tinggi);

        System.out.printf("Volume Silinder = %.2f\n", tabung.hitungVolume());

        input.close();
    }
}