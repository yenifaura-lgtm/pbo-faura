import java.util.Scanner;
public class uts_soal2 {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ulang = "";

        // Tampilan judul program
        System.out.println("=== Program Penghitung Berat Badan Ideal ===");

        // Perulangan supaya program bisa dijalankan berkali-kali
        do {

            // =========================================
            // INPUT JENIS KELAMIN
            // L = Laki-laki
            // P = Perempuan
            // =========================================
            System.out.print("\nPilih jenis kelamin (L/P) : ");

            char jk = input.next().toUpperCase().charAt(0);

            // =========================================
            // INPUT TINGGI BADAN
            // =========================================
            System.out.print("Masukkan Tinggi Badan Anda (dalam cm) : ");
            int Tinggi = input.nextInt();

            // =========================================
            // PROSES MENGHITUNG BERAT IDEAL
            // Rumus:
            // Laki-laki  = Tinggi - 100
            // Perempuan  = Tinggi - 110
            // =========================================
            int beratIdeal = 0;

            if (jk == 'L') {
                beratIdeal = Tinggi - 100;
            } else if (jk == 'P') {
                beratIdeal = Tinggi - 110;
            } else {

                System.out.println("Input jenis kelamin tidak valid.");

                continue;
            }

            // Menampilkan hasil berat ideal
            System.out.println("Berat badan ideal yang seharusnya : "
                    + beratIdeal + " Kg");

            // =========================================
            // INPUT BERAT BADAN SAAT INI
            // =========================================
            System.out.print("Masukkan berat badan Anda (dalam Kg) : ");
            int beratSekarang = input.nextInt();

            // =========================================
            // MENGHITUNG SELISIH BERAT BADAN
            // =========================================
            int selisih = Math.abs(beratSekarang - beratIdeal);

            // =========================================
            // MENENTUKAN KATEGORI BERAT BADAN
            // =========================================
            if (beratSekarang <= beratIdeal) {

                System.out.println("Anda termasuk kedalam kategori Kurus.");

            } else {

                System.out.println("Anda termasuk kedalam kategori Gemuk dan harus mengurangi berat");

                System.out.println("badan sebanyak " + selisih
                        + " Kg (" + beratSekarang
                        + " Kg – " + beratIdeal + " Kg)");
            }

            System.out.print("\nApakah ingin menghitung lagi? (y/n): ");
            ulang = input.next();

        } while (ulang.equalsIgnoreCase("y"));

        System.out.println("Terima kasih telah menggunakan program ini!");

        input.close();
    }
}
