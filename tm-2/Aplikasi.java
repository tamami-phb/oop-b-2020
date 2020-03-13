public class Aplikasi {

    public static void main(String args[]) {
        // System.out.println("Tamami, Kelas A");
        Mahasiswa mhs = new Mahasiswa();
        mhs.nama = "tamami";
        // mhs.nim = "19001";
        // mhs.kelas = "A";
        System.out.println(mhs.info());
        
        Mahasiswa mhs2 = new Mahasiswa("19001","ami", "C");
        Mahasiswa.nama = "tester";
        System.out.println(mhs2.info() + " " + mhs2.nama);
        System.out.println(mhs.info() + " " + mhs.nama);

        System.out.println(Math.abs(-27));
    }

}