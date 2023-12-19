package com.tutorial;

class Player{
    // data member
    String name; // defaul bisa diakses oleh kelas lain
    public int exp; // publik bisa diakses oleh kelas lain
    private int health; // tidak bisa diakses oleh kelas lain

    Player (String name, int exp, int health){
      this.name = name;
      this.exp = exp;
      this.health = health;
    }

    void Display() {
        System.out.println("Nama Player : " + this. name);
        System.out.println("Player exp : "+ this. exp);
        System.out.println("Player health :" + this. health );
    }
}
public class Main {
    public static void main(String[] args) {
        // instasiasi
        Player hero_1 = new Player ( "susi", 20, 100);

        
        hero_1. Display();
    }
}

