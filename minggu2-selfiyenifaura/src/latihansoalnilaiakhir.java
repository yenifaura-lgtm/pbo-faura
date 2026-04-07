import java.util.Scanner;
public class latihansoalnilaiakhir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        double uts, uas, mandiri, nilaiAkhir;

        System.out.print("Masukan Nama Siswa : ");
        nama = input.nextLine();

        System.out.print("Masukan Nilai UTS : ");
        uts = input.nextDouble();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextDouble();
        System.out.print("Masukan Nilai Mandiri : ");
        mandiri = input.nextDouble();

        System.out.println("Hasil Perhitungan Nilai Akhir");
        uts = uts * 0.35;
        uas = uas * 0.45;
        mandiri = mandiri * 0.20;
        nilaiAkhir = uts + uas + mandiri;
        System.out.println("Nilai murni UAS : " + uas);
        System.out.println("Nilai murni UTS : " + uts);
        System.out.println("Nilai murni Mandiri : " + mandiri);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }
}
