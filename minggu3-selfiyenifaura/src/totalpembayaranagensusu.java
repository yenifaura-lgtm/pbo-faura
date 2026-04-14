import java.util.Scanner;

public class totalpembayaranagensusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenis, ukuran, jumlah;
        int harga = 0;
        String namaJenis = "", namaUkuran = "";

        // Menu
        System.out.println("TOKO KELONTONG SERBAADA");
        System.out.println("========================");

        System.out.println("1. Susu Dancow");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");

        System.out.println("2. Susu Bendera");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");

        System.out.println("3. Susu SGM");
        System.out.println("   1. Ukuran Kecil");
        System.out.println("   2. Ukuran Sedang");
        System.out.println("   3. Ukuran Besar");

        // Input jenis susu
        System.out.print("\nMasukkan Kode Susu (1-3): ");
        jenis = input.nextInt();

        // Input ukuran
        System.out.print("Masukkan Ukuran (1-3): ");
        ukuran = input.nextInt();

        // Input jumlah beli
        System.out.print("Masukkan Jumlah Beli: ");
        jumlah = input.nextInt();

        // Menentukan harga
        if (jenis == 1) {
            namaJenis = "Dancow";
            if (ukuran == 1) {
                harga = 25000;
                namaUkuran = "Kecil";
            } else if (ukuran == 2) {
                harga = 20000;
                namaUkuran = "Sedang";
            } else if (ukuran == 3) {
                harga = 15000;
                namaUkuran = "Besar";
            }
        } else if (jenis == 2) {
            namaJenis = "Bendera";
            if (ukuran == 1) {
                harga = 20000;
                namaUkuran = "Kecil";
            } else if (ukuran == 2) {
                harga = 17500;
                namaUkuran = "Sedang";
            } else if (ukuran == 3) {
                harga = 13500;
                namaUkuran = "Besar";
            }
        } else if (jenis == 3) {
            namaJenis = "SGM";
            if (ukuran == 1) {
                harga = 22000;
                namaUkuran = "Kecil";
            } else if (ukuran == 2) {
                harga = 18500;
                namaUkuran = "Sedang";
            } else if (ukuran == 3) {
                harga = 15000;
                namaUkuran = "Besar";
            }
        }

        // Hitung total
        int totalBayar = harga * jumlah;

        // Output
        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Jenis Susu   : " + namaJenis);
        System.out.println("Ukuran       : " + namaUkuran);
        System.out.println("Harga Satuan : Rp " + harga);
        System.out.println("Jumlah Beli  : " + jumlah);
        System.out.println("Total Bayar  : Rp " + totalBayar);

        input.close();
    }
}