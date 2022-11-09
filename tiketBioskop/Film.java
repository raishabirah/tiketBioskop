/**
 * kelas film merupakan superclass yang isinya variabel dan method dari film
 * @author laila asrin and raihan sabirah
 * @version 09/11/2022
 */
public abstract class Film
{
    private String nama;
    private int harga;
    /**
     * method constructor
     */
    public Film(){

    }
    /**
     * method untuk mengubah nama film
     * @param nama film
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * method untuk mengembalikan nama film
     * @return nama film
     */
    public String getNama() {
        return nama;
    }
    /**
     * method untuk mengubah harga film
     * @param harga film
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    /**
     * method untuk mengembalikan harga film
     * @return harga film
     */
    public int getHarga() {
        return harga;
    }
    /**
     * method berfungsi untuk mengembalikan jadwal film dan bersifat abstract
     */
    public abstract String jadwal();
}
