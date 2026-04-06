import java.util.Scanner;
public class latihansoalcelcius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double celcius, fahrenehit, reamor;

        System.out.print("masukan suhu dalam celcius : ");
        celcius = input.nextDouble();

        fahrenehit = (celcius * 9/5) + 32;
        reamor = celcius * 4/5;
        System.out.println("Hasil Konversi");
        System.out.println("suhu dalam fahrenehit : " + fahrenehit);
        System.out.println("suhu dalam reamor : " + reamor);
    }
}
