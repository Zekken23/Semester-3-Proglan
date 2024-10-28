public class TaxiFareCalculator {
    private static final double BASE_FARE = 5000;   // Tarif dasar
    private static final double FARE_PER_KM = 3000; // Tarif per kilometer

    /**
     * di methot ini di jelaskan untuk menghitung tarif distance atau jaraknya
     * Output: Tarif total sebagai double.
     * @param distance
     * @return
     * penambahan untuk error Handling: Memunculkan IllegalArgumentException jika jarak yang diberikan kurang dari atau sama dengan nol.
     */
    public double calculateFare(double distance) {
        if (distance <= 0) {
            throw new IllegalArgumentException("Jarak harus lebih besar dari 0.");
        }
        return BASE_FARE + (FARE_PER_KM * distance);
    }
}