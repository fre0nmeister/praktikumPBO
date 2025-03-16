/* Nama file: Persegi.java
 * Deskripsi: Berisi atribut dan metode dalam class Persegi
 * Pembuat: Rasendriya Daffa Al Ghifary (24060123130077)
 * Tanggal: Kamis, 13 Maret 2025
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        setJmlSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi * sisi;
    }   

    public double getKeliling(){
        return sisi * 4;
    }

    public double getDiagonal(){
        return sisi * Math.sqrt(2);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi: " + sisi);
    }
}

/*
    Pertanyaan: Apakah konstruktor berparameter pada kelas Persegi dapat direalisasikan seperti berikut? Mengapa?
    public Persegi(double sisi, String warna, String border){
        this.jmlSisi = 4;
        this.warna = warna;
        this.border = border;
        this.sisi = sisi;
    }

    Jawaban: Konstruktor berparameter pada kelas Persegi tidak dapat direalisasikan seperti itu
    karena atribut jmlSisi, warna, border, dan sisi belum dideklarasikan dalam kelas Persegi atau belum diwarisi dari superclass (BangunDatar).
    Alasan: 
    1. Tidak ada deklarasi atribut dalam kelas, Jika jmlSisi, warna, border, dan sisi tidak dideklarasikan dalam kelas Persegi,
       maka akan terjadi error karena atribut tersebut tidak dikenali.
    2. Atribut berasal dari superclass (BangunDatar), Karena atribut-atribut tersebut berada dalam BangunDatar dan memiliki akses modifier private,
        maka Persegi tidak dapat langsung mengaksesnya. Sebagai solusinya, sebaiknya menggunakan keyword super untuk
        menginisialisasi atribut yang diwarisi dari BangunDatar.
 */