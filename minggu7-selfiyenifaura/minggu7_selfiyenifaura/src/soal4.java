import java.util.Scanner;
public class soal4 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, kodeGolongan;
        int jamKerja;
        double tarifPerJam = 0;
        double gajiPokok, uangLembur = 0, totalGaji;

        // Tampilan data golongan
        System.out.println("PT. XYZ");
        System.out.println("======================================");
        System.out.println("Kode Golongan   Jabatan     Tarif/Jam");
        System.out.println("======================================");
        System.out.println("A               Manager     Rp. 5000");
        System.out.println("B               Supervisor Rp. 3500");
        System.out.println("C               Staff       Rp. 2500");
        System.out.println("======================================");

        // Input data
        System.out.print("Nama Karyawan   : ");
        nama = input.nextLine();

        System.out.print("Kode Golongan [A/B/C] : ");
        kodeGolongan = input.nextLine().toUpperCase();

        System.out.print("Jam Kerja       : ");
        jamKerja = input.nextInt();

        // Menentukan tarif per jam
        switch (kodeGolongan) {
            case "A":
                tarifPerJam = 5000;
                break;

            case "B":
                tarifPerJam = 3500;
                break;

            case "C":
                tarifPerJam = 2500;
                break;

            default:
                System.out.println("Kode golongan tidak valid!");
                return;
        }

        // Menghitung gaji pokok
        gajiPokok = jamKerja * tarifPerJam;

        // Menghitung lembur
        if (jamKerja > 240) {
            uangLembur = (jamKerja - 240) * 2500;
        }

        // Total gaji
        totalGaji = gajiPokok + uangLembur;

        // Output
        System.out.println("\nPT. XYZ");
        System.out.println("==============================================================");
        System.out.println("Nama\tGolongan\tJam Kerja\tGaji Pokok\tLembur\tTotal Gaji");
        System.out.println("==============================================================");

        System.out.println(nama + "\t" + kodeGolongan + "\t\t" +
                jamKerja + "\t\tRp. " + gajiPokok +
                "\tRp. " + uangLembur +
                "\tRp. " + totalGaji);

        System.out.println("==============================================================");

        input.close();
    }
}
