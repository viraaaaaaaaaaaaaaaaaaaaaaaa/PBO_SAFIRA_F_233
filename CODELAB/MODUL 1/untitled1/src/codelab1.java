import java.util.Scanner;
import java.time.LocalDate; // Untuk mendapatkan tahun sekarang

public class codelab1 {
    public static void main(String[] args) {
        // Langkah 1: Buat Scanner untuk ambil input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Langkah 2: Minta input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Langkah 3: Minta input jenis kelamin (P/L)
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // Langkah 4: Minta input tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Langkah 5: Hitung umur pengguna
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Langkah 6: Tentukan jenis kelamin dalam bentuk teks
        String jenisKelaminTeks;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminTeks = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminTeks = "Perempuan";
        } else {
            jenisKelaminTeks = "Tidak diketahui";
        }

        // Langkah 7: Tampilkan hasilnya
        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminTeks);
        System.out.println("Umur         : " + umur + " tahun");

        // Langkah 8: Tutup Scanner setelah selesai digunakan
        scanner.close();
    }
}
