import java.util.Scanner;

class NilaiMurni {
    private double uts;
    private double uas;

    // Setter
    public void setUts(double uts) {
        this.uts = uts;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    // Nilai murni UTS (40%)
    public double getNilaiMurniUTS() {
        return uts * 0.40;
    }

    // Nilai murni UAS (60%)
    public double getNilaiMurniUAS() {
        return uas * 0.60;
    }
}

class EvaluasiMahasiswa extends NilaiMurni {

    // Menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return getNilaiMurniUTS() + getNilaiMurniUAS();
    }

    // Menentukan grade
    public char cariGrade() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 85) {
            return 'A';
        } else if (nilaiAkhir >= 70) {
            return 'B';
        } else if (nilaiAkhir >= 55) {
            return 'C';
        } else if (nilaiAkhir >= 40) {
            return 'D';
        } else {
            return 'E';
        }
    }
}

public class soal3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        EvaluasiMahasiswa mhs = new EvaluasiMahasiswa();

        System.out.println("===== PROGRAM HITUNG NILAI & GRADE =====");

        System.out.print("Masukkan Nilai UTS : ");
        mhs.setUts(input.nextDouble());

        System.out.print("Masukkan Nilai UAS : ");
        mhs.setUas(input.nextDouble());

        System.out.println("\n===== HASIL EVALUASI =====");
        System.out.printf("Nilai Murni UTS (40%%) : %.2f\n", mhs.getNilaiMurniUTS());
        System.out.printf("Nilai Murni UAS (60%%) : %.2f\n", mhs.getNilaiMurniUAS());
        System.out.printf("Nilai Akhir           : %.2f\n", mhs.hitungNilaiAkhir());
        System.out.println("Grade                 : " + mhs.cariGrade());

        input.close();
    }
}