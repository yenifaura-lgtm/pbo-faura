public class soal3 {
    public static void main(String[] args) {
        int n = 8;
        int a = 1, b = 1;

        System.out.print("Fibonacci: " + a + ", " + b);

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }

        System.out.println();
    }
}
