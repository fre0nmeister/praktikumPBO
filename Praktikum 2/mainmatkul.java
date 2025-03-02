public class mainmatkul {
    public static void main(String[] args) {
        Matkul MK1 = new Matkul();
        Matkul MK2 = new Matkul("RPL", "Rekayasa Perangkat Lunak", 3);

        MK1.setIdmatkul("PL");
        MK1.setNama_matkul("Pemrograman Lanjut");
        MK1.setSks(3);

        System.out.println("Kode mata kuliah 1: " + MK1.getIdmatkul());
        System.out.println("Nama mata kuliah 1: " + MK1.getNama_matkul());
        System.out.println("SKS mata kuliah 1: " + MK1.getSks());
        System.out.println("Kode mata kuliah 2: " + MK2.getIdmatkul());
        System.out.println("Kode mata kuliah 2: " + MK2.getNama_matkul());
        System.out.println("Kode mata kuliah 2: " + MK2.getSks());
    }
}
