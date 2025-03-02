public class maindosen {
    public static void main(String[] args) {
        Dosen D1 = new Dosen();
        Dosen D2 = new Dosen("100", "Budi", "Statistika");

        D1.setNip("201");
        D1.setNama("Amelia");
        D1.setProdi("Biologi");

        System.out.println("Nama dosen 1: " + D1.getNama_dosen());
        System.out.println("NIP dosen 1: " + D1.getNip());
        System.out.println("Prodi dosen 1: " + D1.getProdi_dosen());
        System.out.println("Nama dosen 2: " + D2.getNama_dosen());
        System.out.println("NIP dosen 2: " + D2.getNip());
        System.out.println("Prodi dosen 2: " + D2.getProdi_dosen());

    }
}
