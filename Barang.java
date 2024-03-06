public class Barang {
    private String kode;
    private String nama;
    private int harga;
    private int stok;
    private int stokAwal; // Variabel baru untuk menyimpan stok awal

    public Barang() {
        this.kode = "";
        this.nama = "";
        this.harga = 0;
        this.stok = 0;
        this.stokAwal = 0;
    }

    public Barang(String kode, String nama, int harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.stokAwal = stok;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getStokAwal() {
        return stokAwal;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-15s Rp%-8d %d", kode, nama, harga, stok);
    }
}
