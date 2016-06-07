/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.marksheetarray;

import java.util.Scanner;

/**
 *
 * @author onesoft
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] subject = {"English", "C Math", "Nepali", "Science","OPt Maths"};
        
        MarkSheet marks = new MarkSheet(subject , input);
        marks.getMarks();
        
        if(marks.isFail()){
            System.out.println("You are fail");
        }
        else {
            System.out.println(marks.getPercentage());
        }
        System.out.println(marks.getDivision());
    }
    
}
