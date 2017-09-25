/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Rara ^___^
 */
public class arraysingle {
    public static void main (String []args){ 
        int nilai [] = new int [3]; 
        nilai [0] = 70; 
        nilai [1] = 80; 
        nilai [2] = 65; 
        double rata = 0.0; 
        for (int i=0; i<nilai.length; i++)
            rata+=nilai [i]; 
            rata/=nilai.length; 
    System.out.println("Nilai rata-rata : "+ rata); 
    } 

}
