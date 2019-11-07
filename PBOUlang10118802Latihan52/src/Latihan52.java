/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author IantReza
 */
public class Latihan52 {

    protected static String nama;
    protected static int umur;
    private static String nip;
    private static String mataKuliah;
    private static String nim;
    private static String kelas;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();
        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        mahasiswa.setNim("10118802");
        mahasiswa.setNama("Iant Reza Anshory");
        mahasiswa.setUmur(25);
        mahasiswa.setKelas("PBO Ulang");
        
        System.out.println("NIP DOSEN : " + dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        System.out.println("");
        System.out.println("NIM MAHASISWA : " + mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
    
}
