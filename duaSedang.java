import java.util.Scanner;

public class duaSedang {
    public static double luasPermukaan(double jari) {
        double pi;

        if (jari % 7 == 0) {
            pi = 22.0 / 7;
        } else {
            pi = 3.14;
        }

        return 4 * pi * jari * jari;
    }

    public static void main(String[] args) {
        double luas;

        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Jari-Jari Bola ");
        double jari = in.nextDouble();

        in.close();

        luas = luasPermukaan(jari);

        System.out.println("Luas Permukaan Bola Adalah : " + luas);
    }
}
