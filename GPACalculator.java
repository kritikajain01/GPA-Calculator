/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author kriti
 */
public class GPACalculator {
Scanner keyboard;
Formatter screen;
int NumberOfClass;
int TotalCreditTaken;
String NameOfCourse;
int NumberOfCredit;
String Grade;
int weight=0;
int Math;

public GPACalculator(){
keyboard = new Scanner(System.in);
screen = new Formatter(System.out);

}

public void Calculate(){

    screen.format("Enter the number of classes you took: \n ");
    NumberOfClass = keyboard.nextInt();
    
    screen.format("Enter the total number of Credit Hours: \n ");
    TotalCreditTaken = keyboard.nextInt();
    


    for(int i=0; i< NumberOfClass; i++){
       screen.format("Enter the name of your course: \n");
       NameOfCourse = keyboard.next();
       screen.format("Enter the number of credit the course hold: \n");
       NumberOfCredit= keyboard.nextInt();
       screen.format("Enter Your Grade: \n");
       Grade = keyboard.next();
        if(Grade.equals("A")){
            weight=4;}
            else if(Grade.equals("B")){
            weight=3;        
                    }
        else if(Grade.equals("C")){
            weight=2;        
                    }
        else if(Grade.equals("D")){
            weight=1;        
                    }
        else if(Grade.equals("F")){
            weight=0;        
                    }
        
        }
    
        Math= (NumberOfCredit *  weight)/TotalCreditTaken;
        System.out.println(Math);
       
    
    
    }



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
GPACalculator Cal = new GPACalculator();
Cal.Calculate();
        // TODO code application logic here
    
    
}
}
