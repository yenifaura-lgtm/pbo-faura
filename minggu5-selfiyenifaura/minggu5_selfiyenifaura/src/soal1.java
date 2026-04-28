public class soal1 {
    public static void main(String[] args) {
        int jumlahGenap = 0;
        String deretGenap = "";

        for (int i = 2; i <= 20; i += 2) {
            jumlahGenap += i;
            deretGenap += i + " + ";
        }

        deretGenap = deretGenap.substring(0, deretGenap.length() - 3);

        System.out.println("Deret Genap: " + deretGenap);
        System.out.println("Jumlah: " + jumlahGenap);
    }
}
