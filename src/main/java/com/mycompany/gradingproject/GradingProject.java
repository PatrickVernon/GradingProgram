package com.mycompany.gradingproject;

import java.util.Scanner;

public class GradingProject {
        static Scanner gradeInputScanner = new Scanner(System.in);
        static int     userGradeInput =    0; 
    
    /*--------------------------------------------------
        main()
        description: This function gets an input from the
        user and tells them what score they achieved.
    -----------------------------------------------------*/
    public static void main(String[] args) {   
           
        userInput();
        calculateGrade();
    }
    
    /*--------------------------------------------------
       userInput()
    -----------------------------------------------------*/
    static void userInput(){
        System.out.println("Enter a grade: ");
        userGradeInput = gradeInputScanner.nextInt();
    }
    
    /*--------------------------------------------------
        calculateGrade()
    -----------------------------------------------------*/
    static void calculateGrade(){
        if(userGradeInput >=90){
            System.out.println("A");
        }
        else if(userGradeInput >=80 && userGradeInput <=89){
            System.out.println("B");
        }    
    }
}
