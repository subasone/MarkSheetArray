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
public class MarkSheet {
    int fullMarks = 100;
    int passMarks = 32;
    boolean isFail = false;
    double obtainedTotal = 0;
    double[] marks ;
    String[] subject;
    Scanner input;
    
    public MarkSheet(String[] subject, Scanner input){
        marks = new double[subject.length];
        this.subject = subject;
        this.input = input;
    }
    
    public void getMarks(){
        for(int i = 0; i < marks.length; i++){
            System.out.println("Enter marks for " + subject[i] + ":");
            marks[i] = input.nextInt();
            obtainedTotal += marks[i];
        }
    }
    public boolean isFail(){
        for(int i =0;i<marks.length;i++){
            if(marks[i] < passMarks){
                return true;
            }
        }
        return false;
    }
    public double getPercentage(){
        return (obtainedTotal/(fullMarks * marks.length)* 100);
    }
    public String getDivision(){
        double percent = getPercentage();
        if(percent >= 80)
            return "Distinction";
        else if (percent >= 60 && percent < 80)
            return "First";
        else if (percent >= 45 && percent < 60)
            return "Second";
        else if(percent >=32 && percent < 45)
            return "Third";
        else
            return "Fail";
                    
    }
}
