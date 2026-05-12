import java.util.Scanner;
public class soal1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah, angka, terbesar;

        System.out.print("Masukkan jumlah angka: ");
        jumlah = input.nextInt();

        System.out.print("Masukkan angka ke-1: ");
        terbesar = input.nextInt();

        for (int i = 2; i <= jumlah; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }
        }

        System.out.println("Nilai terbesar adalah: " + terbesar);

        input.close();
    }
}
