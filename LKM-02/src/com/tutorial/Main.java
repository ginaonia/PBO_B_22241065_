package com.tutorial;

class Lingkaran {
    float r;
    float diameter;

    public Lingkaran (float r, float diameter){
        this.r=r;
        this.diameter=diameter;
    }

void display(){
    float luas = (float)(Math.PI*r*r);
    float keliling = (float)(3.14*4*4);
    System.out.println("keliling lingkaran"+luas);
    System.out.println("luas lingkaran"+ keliling);
    

}
}

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(69,78);
        System.out.println("jari-jari"+ lingkaran);
        System.out.println("diameter"+ lingkaran.diameter);
        lingkaran.display();
    }
}



