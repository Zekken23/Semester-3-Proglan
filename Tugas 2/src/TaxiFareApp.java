import java.util.Scanner;

public class TaxiFareApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Masukkan jarak tempuh (km): ");
        double distance = scanner.nextDouble();

        try {
            double fare = new TaxiFareCalculator().calculateFare(distance);
            System.out.printf("Tarif total untuk %.2f km adalah: Rp %.2f%n", distance, fare);

            // Memilih metode pembayaran
            String paymentMethod = choosePaymentMethod();
            processPayment(getPaymentMethod(paymentMethod), fare);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    /**
     * <p>Methot ini di gunakan untuk mencari jenis pembayaran</p>
     * @param paymentMethod
     * @return
     */
    private static String getPaymentMethod(String paymentMethod) {
        return paymentMethod;
    }

    // Method untuk memilih metode pembayaran
    private static String choosePaymentMethod() {
        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Cash");
        System.out.println("2. QRIS");
        System.out.print("Masukkan pilihan (1 atau 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            return "Cash";
        } else if (choice == 2) {
            return "QRIS";
        } else {
            System.out.println("Pilihan tidak valid, default ke Cash.");
            return "Cash";
        }
    }

    /**
     * @Author Yusron
     * <p>ohh iya Penjelasan Untuk Param dan sebagainya : param di gunakan untuk parameternya, <P> sedangkan Author : di gunakan untuk si pembuatnya dan <p>"{P}" sendiri di gunakan untuk membuat paragraf baru</></p>
     * @param paymentMethod
     * @param fare
     */
    // Method untuk memproses pembayaran berdasarkan metode yang dipilih
    private static void processPayment(String paymentMethod, double fare) {
        if ("Cash".equalsIgnoreCase(paymentMethod)) {
            System.out.printf("Silakan bayar sejumlah Rp %.2f secara tunai.%n", fare);
        } else if ("QRIS".equalsIgnoreCase(paymentMethod)) {
            System.out.printf("Silakan scan kode QR dan bayar sejumlah Rp %.2f.%n", fare);
        }
    }
}
