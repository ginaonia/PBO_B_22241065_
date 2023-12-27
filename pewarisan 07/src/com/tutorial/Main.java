package com.tutorial;

class Hero{
    String nama;

    void display(){
        System.out.println("Nama Hero :"+ nama);
    }
}

class Herotank extends Hero{ 
    float health;

    void display(){
        System.out.println("Health :"+ health);
    }
}
  



public class Main {
    public static void main(String[] args) {
        Hero hero_1 = new Hero();
        hero_1.nama = " Danish ";
        hero_1.display();

        Herotank hero_2 = new Herotank();
        hero_2. nama = "Dona";
        hero_2.display();
        
    }
}
