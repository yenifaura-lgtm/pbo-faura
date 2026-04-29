public class soal4 {
    public static void main(String[] args) {
        System.out.print("Bilangan Prima: ");

        for (int i = 2; i <= 20; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrima(int num) {
        if (num < 2) return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
