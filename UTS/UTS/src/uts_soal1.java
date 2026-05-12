import java.util.Scanner;
public class uts_soal1 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim;
        double nilaiAbsen, nilaiTUGAS, nilaiUTS, nilaiUAS;
        double nilaiAkhir;
        char grade;
        String keterangan;

        // Input Data Mahasiswa
        System.out.println("PROGRAM MENGHITUNG NILAI-NILAI MAHASISWA");
        System.out.println("==================================");

        System.out.print("Nama Mahasiswa : ");
        nama = input.nextLine();

        System.out.print("NIM Mahasiswa  : ");
        nim = input.nextLine();

        System.out.print("Nilai Absen    : ");
        nilaiAbsen = input.nextDouble();

        System.out.print("Nilai TUGAS    : ");
        nilaiTUGAS = input.nextDouble();

        System.out.print("Nilai UTS      : ");
        nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS      : ");
        nilaiUAS = input.nextDouble();

        // Penghitungan Nilai Akhir
        nilaiAkhir = (0.10 * nilaiAbsen) +
                     (0.20 * nilaiTUGAS) +
                     (0.30 * nilaiUTS) +
                     (0.40 * nilaiUAS);

        // =========================================
        // MENENTUKAN GRADE
        // =========================================
        if (nilaiAkhir >= 90) {
            grade = 'A';
        } else if (nilaiAkhir >= 80) {
            grade = 'B';
        } else if (nilaiAkhir >= 70) {
            grade = 'C';
        } else if (nilaiAkhir >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
        }

        // Menentukan keterangan
        if (nilaiAkhir >= 60) {
            keterangan = "LULUS";
        } else {
            keterangan = "TIDAK LULUS";
        }

        // Output
        System.out.println("\nHASIL PENILAIAN MAHASISWA");
        System.out.println("==============================================================");
        System.out.println("Nama\t\tNIM\t\tAbsen\tTUGAS\tUTS\tUAS\tNilai Akhir\tGrade");
        System.out.println("==============================================================");

        System.out.println(nama + "\t" + nim + "\t" +
                nilaiAbsen + "\t" +
                nilaiTUGAS + "\t" +
                nilaiUTS + "\t" +
                nilaiUAS + "\t" +
                nilaiAkhir + "\t\t" +
                grade);

        System.out.println("==============================================================");
        System.out.println("Keterangan : " + keterangan);

        input.close();
    }
}
