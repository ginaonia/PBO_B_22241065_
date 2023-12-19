package com.tutorial;
 
class User{
   private String username ;
   private String password;

   User( String username, String password){
    this.username = username;
    this.password = password;

   }
   // mettod getter(mengambil)
   public String getusername(){
    return this. username;
   }
   public String getpassword(){
    return this. password;
   }
   // mettod setter untuk ganti password
   public void setpassword(String password){
    this. password = password;
   }
}


public class Main {
    public static void main(String[] args) {
       // instasiasi atau pembuatan objek
    User person_1 = new User("undikma", "jayajayajaya");

 //getusername
 System.out.println(person_1. getusername());
 System.out.println(person_1. getpassword());

 person_1.setpassword("sukses");

 System.out.println("password baru"+ person_1.getpassword());
}
}
