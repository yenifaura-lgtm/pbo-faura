public class soal2 {
    public static void main(String[] args) {
        int jumlahGanjil = 0;
        String deretGanjil = "";

        for (int i = 1; i < 20; i += 2) {
            jumlahGanjil += i;
            deretGanjil += i + " + ";
        }

        deretGanjil = deretGanjil.substring(0, deretGanjil.length() - 3);

        System.out.println("Deret Ganjil: " + deretGanjil);
        System.out.println("Jumlah: " + jumlahGanjil);
    }
}
