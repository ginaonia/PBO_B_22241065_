package com.tutorial;

class Mahasiswa {
    String nama;
    String nim;
    String prodi;
}
public class Main {
    public static void main(String[] args) {
       Mahasiswa MHS1 = new Mahasiswa();
       MHS1.nama = "gina";
       MHS1.nim = "22241065";
       MHS1.prodi = "PTI";
        System.out.println("nama Mahasiswa:"+ MHS1.nama);
        System.out.println("nim Mahasiswa:"+ MHS1.nim);
        System.out.println("prodi Mahasiswa:"+ MHS1.prodi);

         Mahasiswa MHS2 = new Mahasiswa();
       MHS2.nama = "sonia";
       MHS2.nim = "22241123";
       MHS2.prodi = "PTI";
        System.out.println("nama Mahasiswa:"+ MHS2.nama);
        System.out.println("nim Mahasiswa:"+ MHS2.nim);
        System.out.println("prodi Mahasiswa:"+ MHS2.prodi);
    }
}
