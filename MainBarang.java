import java.util.Scanner;

public class MainBarang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array barangs
        Barang[] barangs = {
            new Barang("K01", "Sabun", 1000, 5),
            new Barang("K02", "Pasta Gigi", 2000, 10),
            new Barang("K03", "Biore", 3000, 23),
            new Barang("K04", "Shampoo", 4000, 55),
            new Barang("K05", "Sikat Gigi", 5000, 65)
        };

        TransaksiBarang transaksiBarang = new TransaksiBarang(barangs);

        int pilihan;
        do {
            System.out.println("========================");
            System.out.println("TOKO MAJU MUNDUR CANTIK");
            System.out.println("========================");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilkan pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilih[1-4]: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    transaksiBarang.tampilkanBarang();
                    break;
                case 2:
                    String kodeBarang = scanner.nextLine();
                    transaksiBarang.lakukanPembelian(kodeBarang);
                    break;
                case 3:
                    transaksiBarang.tampilkanPembelian();
                    break;
                case 4:
                    System.out.println("BUILD SUCCESFULL ( Total time : 41 seconds )");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 4);
    }
}
