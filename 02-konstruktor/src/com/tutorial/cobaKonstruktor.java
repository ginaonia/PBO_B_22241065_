package com.tutorial;

class Mahasiswa {
    // Data Member/ciri/atribut
    String nama;
    String nim;
    String prodi;

    // Membuat Konstruktor dengan para meter
    Mahasiswa(String inputnama, String inputnim,String inputprodi){
        nama = inputnama;
        nim = inputnim;
        prodi = inputprodi;


        System.out.println("nama : "+ nama);
        System.out.println("nim : "+ nim);
        System.out.println("prodi : "+ prodi);
        
    }
        //System.out.println("ini adalah 
        //konstruktor");
    
{

        
        // Membuat Konstruktor
        //Mahasiswa (String inputnama, String inputnim, String 
        //inputprodi)
              
             
             
           
    }
}


public class cobaKonstruktor {
    public static void main(String[] args) {
        new Mahasiswa("Gina Sonia","22241065","PTI");
    }
}


