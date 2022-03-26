package review09;

public class Doctor {
    //instance variables
     String firstName, lastName, speciality;
     static String hospital="George Washington";

     static void work() {
         System.out.println("All doctors work at "+hospital);
     }

    Doctor(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Doctor(String firstName, String lastName, String speciality) {
        this(firstName, lastName);
        this.speciality = speciality;
    }
    void printInfo(){
         System.out.println("Doctor"+firstName+" "+lastName+" is a "+speciality);
     }
     void work1(){
         System.out.println("All doctors work at"+hospital);
     }
}
