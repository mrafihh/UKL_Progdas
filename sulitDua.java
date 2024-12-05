import java.util.Scanner;

public class sulitDua {
    int number = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Masukkan Jumlah Angka : ");
        int jumlah = in.nextInt();

        int[] bilangan = new int[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Bilangan ke-" + (i + 1) + " : ");
            bilangan[i] = in.nextInt();
        }

        cekNegative(bilangan);

        in.close();

    }

    public static void cekNegative(int[] bilangan) {
        boolean negative = false;
        String bilanganNegative = "";

        for (int elemen : bilangan) {
            if (elemen < 0) {
                negative = true;
                bilanganNegative += (elemen) + (", ");
            }
        }
        if (negative) {
            System.out.println("Bilangan Yang Negative Adalah : " + bilanganNegative);
        } else {
            System.out.println("Array Tidak Mengandung Bilangan Negative");
        }

    }
}
