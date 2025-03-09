/**
 * Nama: Rasendriya Daffa Al Ghifary (24060123130077)
 * Hari/Tanggal: Minggu 9 Maret 2025
 * File     : ExceptionOnArray.java
 * Deskripsi: Program penggunaan eksepsi menggunakan class library Java
 */

 public class ExceptionOnArray {
    public static void main(String[] args) {
        // Instansiasi objek array integer
        Integer[] arrayInteger = new Integer[4];

        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10; // Akan menyebabkan ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("Clean up code...");
        }
    }
}
