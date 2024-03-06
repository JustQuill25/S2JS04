import java.util.Scanner;

public class TransaksiBarang {
    private Barang[] barangs;

    public TransaksiBarang(Barang[] barangs) {
        this.barangs = barangs;
    }

    public void tampilkanBarang() {
        System.out.println("===================");
        System.out.println("Daftar Barang");
        System.out.println("===================");
        System.out.println("Kode\tNama\t\tHarga\tStok");
        for (Barang barang : barangs) {
            System.out.println(barang);
        }
    }
    Scanner scanner = new Scanner(System.in);
    public void lakukanPembelian(String kodeBarang2) {
        Scanner scanner = new Scanner(System.in);
        String kodeBarang;
        do {
            System.out.print("Masukkan kode barang: ");
            kodeBarang = scanner.nextLine();

            boolean found = false;
            for (Barang barang : barangs) {
                if (barang.getKode().equals(kodeBarang)) {
                    if (barang.getStok() > 0) {
                        barang.setStok(barang.getStok() - 1);
                        System.out.println("Barang " + barang.getNama() + " berhasil dibeli!");
                        found = true;
                    } else {
                        System.out.println("Barang " + barang.getNama() + " stoknya habis!");
                    }
                    break;
                }
            }
            if (!found) {
                System.out.println("Barang dengan kode " + kodeBarang + " tidak ditemukan!");
            }

            System.out.print("Apakah akan belanja kembali (Y/N)? ");
        } while (scanner.nextLine().equalsIgnoreCase("Y"));
    }

    public void tampilkanPembelian() {
        System.out.println("====================");
        System.out.println(   "LIST BELANJAAN");
        System.out.println("===================");
        System.out.println("Kode\tNama\t\tHarga\tStok");
        for (Barang barang : barangs) {
            if (barang.getStok() < barang.getStokAwal()) {
                System.out.println(barang);
            }
        }
    }
}
