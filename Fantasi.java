/**
 * kelas fantasi merupakan subclass dari kelas film yang berisi variabel serta method dari jenis film fantasi
 * @author laila asrin and raihan sabirah
 * @version 09/11/2022
 */

public class Fantasi extends Film
{
    /**
     * method constructor dari kelas fantasi
     */
    public Fantasi(){

    }
    /**
     * method berfungsi untuk mengubah nama film yang di override dari kelas film
     * @param nama film fantasi
     */
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    /**
     * method berfungsi untuk mengembalikan nama film di override dari kelas film
     * @return nama film fantasi
     */
    @Override
    public String getNama() {
        return super.getNama();
    }
    /**
     * method berfungsi untuk mengubah harga film di override dari kelas film
     * @param harga film fantasu
     */
    @Override
    public void setHarga(int harga) {
        super.setHarga(harga);
    }
    /**
     * method berfungsi untuk mengembalikan harga film di override dari kelas film
     * @return harga film fantasi
     */
    @Override
    public int getHarga() {
        return super.getHarga();
    }
    /**
     * method berfungsi untuk mengembalikan jadwal dari film fantasi di override dari kelas film
     * 
     */
    @Override
    public String jadwal() {
        return "08.00 - 10.00";
    }
}

