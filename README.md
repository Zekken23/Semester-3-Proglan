# Modul-3-Tugas-4-Proglan
# Learning Java MODUL 3 Tugas 4
# Taxi Fare Calculator
* Deskripsi
* TaxiFareCalculator adalah kelas Java yang digunakan untuk menghitung tarif perjalanan taksi berdasarkan jarak yang ditempuh. Kelas ini menggunakan tarif dasar dan tarif per kilometer untuk menghitung total biaya.

* Fitur
* Menghitung tarif perjalanan berdasarkan jarak.
Memvalidasi input jarak untuk memastikan nilai yang diberikan lebih besar dari nol.
Tarif
Tarif Dasar: 5000
Tarif Per Kilometer: 3000
Metode
calculateFare(double distance)
Menghitung tarif total berdasarkan jarak yang diberikan.

# Parameter
* distance: Jarak yang ditempuh dalam kilometer (harus lebih besar dari 0).
* Pengembalian
* Mengembalikan tarif total sebagai double.
* Error Handling
* Melempar IllegalArgumentException jika jarak yang diberikan kurang dari atau sama dengan nol.
Contoh Penggunaan
* java

Copy
TaxiFareCalculator fareCalculator = new TaxiFareCalculator();
try {
    double totalFare = fareCalculator.calculateFare(5); // Jarak 5 km
    System.out.println("Total Tarif: " + totalFare);
} catch (IllegalArgumentException e) {
    System.err.println(e.getMessage());
}

Instalasi
Pastikan Anda memiliki Java Development Kit (JDK) terinstal.
Salin kode kelas TaxiFareCalculator ke dalam proyek Java Anda.
Gunakan kelas ini untuk menghitung tarif perjalanan taksi.

