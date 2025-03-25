/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MIDTERM;

/**
 *
 * @author user
 */
public class Array2 {
     public static void main (String [] args ){
    int[] [] numbers= {
                           {1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 10, 11, 12}
                
    }; 
        
        for (int i = 0; i < numbers.length; i++ ) {
            System.out.print("The Elements in Row" + (i + 1) + ": ");
            for (int k = 0; k < numbers[i].length; k++) {
                System.out.print(numbers[i][k] + " ");
            }
            System.out.println();
        }
     }
}
