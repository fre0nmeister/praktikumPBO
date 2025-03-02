public class Kendaraan {
    /* Atribut */
    private String noPlat, jenis;

    /* Method */
    public Kendaraan(){
        noPlat = "";
        jenis = "";
    }

    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    public String getNoplat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    public void setNoplat(String x){
        noPlat = x;
    }

    public void setJenis(String x){
        jenis = x;
    }
}
