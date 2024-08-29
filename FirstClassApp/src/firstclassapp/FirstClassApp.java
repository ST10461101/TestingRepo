/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstclassapp;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class FirstClassApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        double age; 
        double year = 2024;
        double currentYear;
        
        //write a formula to get current year 
        age = 2001;
        currentYear = year - age;
        
        //display the results
        System.out.println("You are " + currentYear + " years old" );
    }
    
}
