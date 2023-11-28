package com.tutorial;

class Mahasiswa{
    //Data Mahasiswa
    String nama;
    String nim;
    String prodi;

    // konstruktor
    Mahasiswa (String nama, String nim, String prodi) {
        this. nama = nama;
        this. nim = nim;
        this. prodi = prodi;
    }

    // method tanpa parameter dan tanpa reaten
    void show(){
        System.out.println("Nama: "+ this.nama);
        System.out.println("NIM: "+ this.nim);
        System.out.println("Prodi: "+ this.prodi);
    }

    // methon tanpa reaten dengan para meter
    void setNama(String nama, String nim, String prodi) {
        this. nama = nama;
        this. nim = nim;
        this. prodi = prodi;

    }
    // method tanpa parameter dan  dengan reaten
    String getNama(){
        return  this. nama;
    }
    String getNim(){
        return this. nim;
    }
    // method dengan para meter dan dengan raturn
    String sayHi(String pesan) {
        return pesan  + "aku " + this.nama + "Mahasiswa PTI";
    }

}
    





public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("gina","22241065", "PTI");

        //memanggil method 
        mhs1.show();
        mhs1.setNama("sonia","2241067","PTI");
        mhs1.show();

        System.out.println(mhs1.getNama());
        System.out.println(mhs1.getNim());
        String pesan = mhs1.sayHi("hello");
        System.out.println(pesan);
    }
}




