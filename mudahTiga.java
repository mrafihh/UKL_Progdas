public class mudahTiga {
    public static void main(String[] args) {
        String[] kalimat = { "Saya anak moklet", "Saya anak wikusama", "Saya angkatan 33", "saya senang" };

        for (int i = 50; i > 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i + "." + kalimat[2]);
            } else if (i % 2 == 0) {
                System.out.println(i + "." + kalimat[0]);
            } else {
                System.out.println(i + "." + kalimat[1]);
            }
        }
        System.out.println("1.Saya Senang");
    }
}
