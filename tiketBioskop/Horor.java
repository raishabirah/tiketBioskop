/**
 * kelas horor merupakan subclass dari kelas film yang berisi variabel serta method dari jenis film horor
 * @author laila asrin and raihan sabirah
 * @version 09/11/2022
 */
public class Horor extends Film
{
    /**
     * method constructor dari kelas horor
     */
    public Horor(){

    }
    /**
     * method berfungsi untuk mengubah nama film yang di override dari kelas film
     * @param nama film horor
     */
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    /**
     * method berfungsi untuk mengembalikan nama film di override dari kelas film
     * @return nama film horor
     */
    @Override
    public String getNama() {
        return super.getNama();
    }
    /**
     * method berfungsi untuk mengubah harga film di override dari kelas film
     * @param harga film horor
     */
    @Override
    public void setHarga(int harga) {
        super.setHarga(harga);
    }
    /**
     * method berfungsi untuk mengembalikan harga film di override dari kelas film
     * @return harga film horor
     */
    @Override
    public int getHarga() {
        return super.getHarga();
    }
    /**
     * method berfungsi untuk mengembalikan jadwal dari film horor di override dari kelas film
     * 
     */
    @Override
    public String jadwal() {
        return "15.00 - 17.00";
    }
}
