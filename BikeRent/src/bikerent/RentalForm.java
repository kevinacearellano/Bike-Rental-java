
package bikerent;

import java.util.Scanner;


public class RentalForm {
     public int age ;
        public String name, add, gen; //naka pub para matawag sa receipt datatype nasa labas ng method
        
        
        public void form(){//method
        Scanner inp = new Scanner(System.in);
        
        System.out.println("\n==== RENTAL APPLICATION FORM ==== ");//Form
        System.out.print("Name: ");
        name = inp.nextLine();
        System.out.print("Address: ");
        add = inp.nextLine();
        System.out.print("Gender: ");
        gen = inp.nextLine();
        System.out.print("Age: ");
        age = inp.nextInt();
}
}
