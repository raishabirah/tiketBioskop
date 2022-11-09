/**
 * kelas komedi berfungsi untuk menyimpan variabel dan method untuk film komedi
 * @author laila asrin and raihan sabirah
 * @version 09/11/2022
 */
public class Komedi extends Film
{
    /**
     * method constructor dari film komedi
     */
    public Komedi(){

    }
    /**
     * method untuk menguba nama film komedi
     * @param nama film komedi
     */
    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }
    /**
     * method untuk mengembalikan nama film komedi
     * @return nama film komedi
     */
    @Override
    public String getNama() {
        return super.getNama();
    }
    /**
     * method untuk mengganti harga film komedi
     * @param harga film komedi
     */
    @Override
    public void setHarga(int harga) {
        super.setHarga(harga);
    }
    /**
     * method untuk mengembalikan harga film komedi
     * @return harga film komedi
     */
    @Override
    public int getHarga() {
        return super.getHarga();
    }
    /**
     * method untuk mengembalikan jadwal film komedi
     */
    @Override
    public String jadwal() {
        return "11.00 - 13.00";
    }
}
