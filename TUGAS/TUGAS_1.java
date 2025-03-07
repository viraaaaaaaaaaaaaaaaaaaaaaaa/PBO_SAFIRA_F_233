import java.util.Scanner;

public class TUGAS_1 { // Nama kelas harus sesuai dengan nama file TUGAS_1.java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memilih jenis login
        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");

        if (!scanner.hasNextInt()) { // Validasi input harus angka
            System.out.println("Pilihan harus berupa angka!");
            scanner.close();
            return;
        }

        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Konsumsi newline

        if (pilihan == 1) {
            // Login sebagai Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine().trim();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine().trim();

            // Validasi username harus dimulai dengan "Admin" dan cukup panjang
            if (username.startsWith("Admin") && username.length() > 5) {
                String nimAkhir = username.substring(5); // Mendapatkan angka setelah "Admin"

                if (password.equals("Password" + nimAkhir)) {
                    System.out.println("Login Admin berhasil!!");
                } else {
                    System.out.println("Login gagal! Username atau password salah.");
                }
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login sebagai Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine().trim();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine().trim();

            if (nama.isEmpty() || nim.isEmpty()) {
                System.out.println("Nama dan NIM tidak boleh kosong!");
            } else {
                System.out.println("Login Mahasiswa berhasil!!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}
