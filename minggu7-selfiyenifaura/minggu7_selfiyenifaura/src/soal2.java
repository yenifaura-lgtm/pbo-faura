import java.util.Scanner;
public class soal2 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kode, jenis = "";
        int harga = 0;
        int banyakPotong;
        int totalBayar, pajak, totalHarga;

        // Tampilan daftar harga
        System.out.println("GEROBAK FRIED CHICKEN");
        System.out.println("--------------------------------");
        System.out.println("Kode\tJenis\tHarga");
        System.out.println("--------------------------------");
        System.out.println("D\tDada\tRp. 2500");
        System.out.println("P\tPaha\tRp. 2000");
        System.out.println("S\tSayap\tRp. 1500");
        System.out.println("--------------------------------");

        // Input
        System.out.print("Masukkan Kode [D/P/S] : ");
        kode = input.next().toUpperCase();

        System.out.print("Banyak Potong : ");
        banyakPotong = input.nextInt();

        // Seleksi jenis dan harga
        switch (kode) {
            case "D":
                jenis = "Dada";
                harga = 2500;
                break;

            case "P":
                jenis = "Paha";
                harga = 2000;
                break;

            case "S":
                jenis = "Sayap";
                harga = 1500;
                break;

            default:
                System.out.println("Kode tidak tersedia!");
                return;
        }

        // Perhitungan
        totalBayar = harga * banyakPotong;
        pajak = (int) (totalBayar * 0.10);
        totalHarga = totalBayar + pajak;

        // Output
        System.out.println("\nGEROBAK FRIED CHICKEN");
        System.out.println("-------------------------------------------------");
        System.out.println("Jenis Potong\tHarga Satuan\tBanyak Beli\tJumlah");
        System.out.println("-------------------------------------------------");
        System.out.println(jenis + "\t\tRp. " + harga + "\t\t" 
                           + banyakPotong + "\t\tRp. " + totalBayar);

        System.out.println("-------------------------------------------------");
        System.out.println("Jumlah Bayar\t\t\t\tRp. " + totalBayar);
        System.out.println("Pajak 10%\t\t\t\tRp. " + pajak);
        System.out.println("Total Bayar\t\t\t\tRp. " + totalHarga);

        input.close();
    }
}
