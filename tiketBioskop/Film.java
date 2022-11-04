public abstract class Film
{
    private String nama;
    private int harga;

    public Film(){

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public abstract String jadwal();
}
