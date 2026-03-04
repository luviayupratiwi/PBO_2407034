package tugas_pbo;

import java.util.Scanner;

public class tugas1_2407034 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama minuman (latte/macchiato): ");
        String minuman = input.nextLine().toLowerCase();

        if (minuman.equals("latte")) {

            System.out.println("Bahan Latte:");
            System.out.println("- Espresso");
            System.out.println("- Steamed Milk");
            System.out.println("- Sedikit Foam");

        } else if (minuman.equals("macchiato")) {

            System.out.println("Bahan Macchiato:");
            System.out.println("- Espresso");
            System.out.println("- Sedikit Milk Foam");

        } else {
            System.out.println("Minuman tidak tersedia.");
        }

        input.close();
    }
}