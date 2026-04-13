import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double nilai1, nilai2, nilai3, rata;
        String hadiah;

        System.out.println("PROGRAM HITUNG NILAI RATA-RATA");

        // Input Nama
        System.out.print("Nama Siswa : ");
        nama = input.nextLine();

        // Input Nilai dengan validasi
        nilai1 = inputNilai(input, "Nilai Pertandingan I");
        nilai2 = inputNilai(input, "Nilai Pertandingan II");
        nilai3 = inputNilai(input, "Nilai Pertandingan III");

        // Hitung rata-rata
        rata = (nilai1 + nilai2 + nilai3) / 3;

        // Menentukan hadiah
        if (rata >= 85) {
            hadiah = "Seperangkat Komputer P4";
        } else if (rata >= 70) {
            hadiah = "Seperangkat Uang sebesar Rp. 500,000";
        } else {
            hadiah = "Hiburan";
        }

        // Output
        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Memperoleh nilai rata-rata " + rata +
                " dari hasil perlombaan yang diikutinya dan berhak mendapatkan hadiah " + hadiah);

        input.close();
    }

    // Method untuk validasi input nilai
    public static double inputNilai(Scanner input, String keterangan) {
        double nilai;
        while (true) {
            System.out.print(keterangan + " : ");

            if (input.hasNextDouble()) {
                nilai = input.nextDouble();

                if (nilai >= 0 && nilai <= 100) {
                    break; // valid
                } else {
                    System.out.println("Nilai harus antara 0 - 100!");
                }
            } else {
                System.out.println("Input harus berupa angka!");
                input.next(); // buang input yang salah
            }
        }
        return nilai;
    }
}