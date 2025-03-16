/* Nama file: BangunDatar.java
 * Deskripsi: Berisi atribut dan metode dalam class Bangun Datar
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */

public class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    protected static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public static void printCounterBangunDatar(){
        System.out.println("Jumlah objek bangun datar: " + counterBangunDatar);
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi: " + jmlSisi);
        System.out.println("Warna: " + warna);
        System.out.println("Border: " + border);    
    }
}

/*
 * Pertanyaan 1: Coba lakukan overriding pada method printCounterBangunDatar(). Bagaimana hasilnya?
 * Jawaban: Karena printCounterBangunDatar() adalah method static, maka konsep overriding tidak berlaku pada method ini.
 * Dalam Java, method static tidak dapat dioverride karena method static bersifat class-level, bukan instance-level.
 * 
 * Pertanyaan 2: Modifikasilah atribut class BangunDatar dengan access modifier protected.
 * Setelah modifikasi tersebut, apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
 * public Persegi(double sisi, String warna, String border) {
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }
 * Jawaban: Bisa, karena kalau access modifier pada semua atribut superclass BangunDatar diubah menjadi protected,
 * konstruktor berparameter pada subclass persegi jadi bisa menggunakannya karena Persegi.java merupakan subclassnya.
 * 
 * Pertanyaan 3: Tambahkan keyword final pada kelas BangunDatar. Bagaimana pengaruhnya terhadap kelas Persegi dan Lingkaran?
 * Jawaban: Jika pada superclass BangunDatar ditambahkan keyword final (menjadikan class tersebut tidak dapat diwariskan),
 * subclassnya (persegi dan lingkaran) jadi tidak dapat menggunakan atribut serta method yang ada pada superclass BangunDatar tersebut.
 * 
 * Pertanyaan 4: Hapus kembali keyword final pada kelas BangunDatar, lalu tambahkan keyword final pada method
 * printInfo() di dalam kelas BangunDatar. Bagaimana pengaruhnya dengan method printInfo() pada kelas Persegi dan Lingkaran?
 * Jawaban: method printinfo() pada kelas persegi dan lingkaran akan harus mengikuti method printinfo yang ada pada superclass,
 * ini berarti printinfo yang ada pada setiap subclass tidak akan bisa menambahkan atribut uniknya seperti sisi (persegi) dan 
 * jari (lingkaran) dan subclass tersebut terpaksa menggunakan method printinfo dari superclass secara apa adanya.
 * 
 * 
 * 
 * 
 */
