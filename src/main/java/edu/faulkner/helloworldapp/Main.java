/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.faulkner.helloworldapp;

/**
 *
 * @author susanha
 */
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userPhrase = scnr.nextLine();
      System.out.println("Enter a sample text:");
      System.out.println();
      System.out.println("You entered: " + userPhrase);
      char myChar = 'x';
      while (myChar != 'q'){
         myChar = printMenu(scnr);
      }
   }

   public static char printMenu(Scanner scnr){
      boolean contiNue = true;
      char myChar = ' ';
         System.out.println("MENU");
         System.out.println("c - Number of non-whitespace characters");
         System.out.println("w - Number of words");
         System.out.println("f - Find text");
         System.out.println("r - Replace all !'s");
         System.out.println("s - Shorten spaces");
         System.out.println("q - Quit");
         System.out.println();
         while (contiNue == true){
             System.out.println("Choose an option");
         
             myChar = scnr.next().charAt(0);
         
             if ((myChar == 'c') || (myChar == 'w') || (myChar == 'f') || (myChar == 'r') || (myChar == 's') || (myChar == 'q')){
             System.out.print(myChar);
             contiNue = false;
             System.out.print(contiNue);
         }
      }
         return myChar;
   }
}

