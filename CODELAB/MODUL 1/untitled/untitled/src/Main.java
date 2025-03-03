public class Main { // Perhatikan huruf besar 'M' di Main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String jenisKelaminTeks = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" :
                (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Tidak diketahui";

        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama         : " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminTeks);
        System.out.println("Umur         : " + umur + " tahun");

        scanner.close();
    }
}
