import java.util.ArrayList;

public class Mahasiswa {
    /* Atribut */
    private String nim, nama, prodi;
    private static ArrayList<Matkul> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /* Method */
    public Mahasiswa(){
        nim = "";
        nama = "";
        prodi = "";
        listMatkul = new ArrayList<>(50);
        dosenWali = new Dosen();
        kendaraan = new Kendaraan();
    }

    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        listMatkul = new ArrayList<>(50); 
    }

    public String getNim(){
        return nim;
    }

    public String getNama_mhs(){
        return nama;
    }

    public String getProdi_mhs(){
        return prodi;
    }

    public String getDosen(){
        return dosenWali.getNama_dosen();
    }

    public void getKendaraan(){
        System.out.println("Kendaraan Mahasiswa : "+ kendaraan.getJenis()) ;
        System.out.println("No Plat Kendaraan : "+ kendaraan.getNoplat()) ;
    }

    public void getMataKuliah(){
        System.out.println("Mata Kuliah yang diambil : ");
        for (int i = 0; i < listMatkul.size(); i++) {
            System.out.println(i + 1 + ". " + listMatkul.get(i).getNama_matkul() + " " );

        }
    }

    public void setNim(String x){
        nim = x;
    }

    public void setNama_mhs(String x){
        nama = x;
    }

    public void setProdi_mhs(String x){
        prodi = x;
    }

    public void setDosen(Dosen x){
        dosenWali = x;
    }

    public void setKendaraan(Kendaraan x){
        kendaraan = x;
    }

    public void addMatkul(Matkul newMatkul){
        if(listMatkul.size() == 50){
            System.out.println("Mata kuliah sudah penuh") ;
        }
        else {
            if  (newMatkul.getSks() + this.getJumlahSKS() > 50){
                System.out.println("Jumlah SKS tidak boleh melebihi 50") ;
            }
            else {
                listMatkul.add(newMatkul) ;
            }
        }
    }

    public void printMhs(){
        System.out.println("NIM : "+ nim) ;
        System.out.println("Nama : "+ nama) ;
        System.out.println("Prodi : "+ prodi) ;
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Jenis kendaraan: " + kendaraan.getJenis());
        System.out.println("Nama dosen wali: " + dosenWali.getNama_dosen());
        getMataKuliah();
    }

    public int getJumlahSKS() {
        int totalSKS = 0;
        for (Matkul matkul : listMatkul) {
            totalSKS += matkul.getSks();
        }
        
        return totalSKS;
    }

    public int getJumlahMatkul() {
        return listMatkul.size();
    }

}