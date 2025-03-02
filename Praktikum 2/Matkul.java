public class Matkul {
    /* Atribut */
    private String idMatkul, nama;
    private int sks;

    /* Method */
    public Matkul(){
        idMatkul = "";
        nama = "";
        sks = 0;
    }

    public Matkul(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    public String getIdmatkul(){
        return idMatkul;
    }

    public String getNama_matkul(){
        return nama;
    }

    public int getSks(){
        return sks;
    }

    public void setIdmatkul(String x){
        idMatkul = x;
    }

    public void setNama_matkul(String x){
        nama = x;
    }

    public void setSks(int x){
        sks = x;
    }
}
