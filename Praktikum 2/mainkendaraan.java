public class mainkendaraan {
    public static void main(String[] args) {
        Kendaraan K1 = new Kendaraan();
        Kendaraan K2 = new Kendaraan("R5173BAC", "Motor");

        K1.setNoplat("H2005IP");
        K1.setJenis("Motor");

        System.out.println("Plat kendaraan 1: " + K1.getNoplat());
        System.out.println("Jenis kendaraan 1: "+ K1.getJenis());
        System.out.println("Plat kendaraan 2: " + K2.getNoplat());
        System.out.println("Jenis kendaraan 2: "+ K2.getJenis());
    }
}
