public class bentuk1 {
    public static void main(String[] args) {
        int n = 5;
        for (int a = 1; a <= n; a++) {
            
            for (int s = a; s < n; s++) {
                System.out.print(" ");
            }
            
            for (int b = 1; b <= (2 * a - 1); b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
