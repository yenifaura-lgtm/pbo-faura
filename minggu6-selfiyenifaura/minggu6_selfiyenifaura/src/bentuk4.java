public class bentuk4 {
   public static void main(String[] args) {
        int n = 5;

        for (int a = n; a >= 1; a--) {

            // spasi depan
            for (int s = a; s < n; s++) {
                System.out.print(" ");
            }

            // bintang
            for (int b = 1; b <= (2 * a - 1); b++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
