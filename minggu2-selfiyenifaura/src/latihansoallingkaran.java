import java.util.Scanner;
public class latihansoallingkaran {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double jari, luas, keliling;
        double phi = 3.14;
        System.out.print("masukan jari-jari lingkaran : ");
        jari = input.nextDouble();

        System.out.println("Hasil Perhitungan");
        luas = phi * jari * jari;
        keliling = 2 * phi * jari;
        System.out.println("luas lingkaran : " + luas);
        System.out.println("keliling lingkaran : " + keliling);
    }
}
