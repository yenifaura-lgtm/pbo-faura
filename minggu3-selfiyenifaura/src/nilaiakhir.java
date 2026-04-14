import java.util.Scanner;

public class nilaiakhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double keaktifan = 0, tugas = 0, ujian = 0;
        double mKeaktifan, mTugas, mUjian, nilaiAkhir;
        String grade;

        System.out.println("PROGRAM HITUNG NILAI AKHIR");

        // Input Nama
        System.out.print("Nama Siswa : ");
        nama = input.nextLine();

        // Input + Validasi Nilai Keaktifan
        while (true) {
            System.out.print("Nilai Keaktifan : ");
            if (input.hasNextDouble()) {
                keaktifan = input.nextDouble();
                if (keaktifan >= 0 && keaktifan <= 100) break;
                else System.out.println("Nilai harus 0 - 100!");
            } else {
                System.out.println("Harus angka!");
                input.next();
            }
        }

        // Input + Validasi Nilai Tugas
        while (true) {
            System.out.print("Nilai Tugas : ");
            if (input.hasNextDouble()) {
                tugas = input.nextDouble();
                if (tugas >= 0 && tugas <= 100) break;
                else System.out.println("Nilai harus 0 - 100!");
            } else {
                System.out.println("Harus angka!");
                input.next();
            }
        }

        // Input + Validasi Nilai Ujian
        while (true) {
            System.out.print("Nilai Ujian : ");
            if (input.hasNextDouble()) {
                ujian = input.nextDouble();
                if (ujian >= 0 && ujian <= 100) break;
                else System.out.println("Nilai harus 0 - 100!");
            } else {
                System.out.println("Harus angka!");
                input.next();
            }
        }

        // Proses nilai murni
        mKeaktifan = keaktifan * 0.2;
        mTugas = tugas * 0.3;
        mUjian = ujian * 0.5;

        // Nilai akhir
        nilaiAkhir = mKeaktifan + mTugas + mUjian;

        // Menentukan grade
        if (nilaiAkhir >= 80) {
            grade = "A";
        } else if (nilaiAkhir >= 70) {
            grade = "B";
        } else if (nilaiAkhir >= 59) {
            grade = "C";
        } else if (nilaiAkhir >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // Output
        System.out.println("\nSiswa yang bernama " + nama);
        System.out.println("Dengan Nilai Persentasi Yang dihasilkan:");

        System.out.println("Nilai Keaktifan * 20% : " + mKeaktifan);
        System.out.println("Nilai Tugas * 30%     : " + mTugas);
        System.out.println("Nilai Ujian * 50%     : " + mUjian);

        System.out.println("\nJadi Siswa yang bernama " + nama +
                " memperoleh nilai akhir sebesar " + nilaiAkhir);

        System.out.println("Grade nilai yang didapat adalah " + grade);

        input.close();
    }
}