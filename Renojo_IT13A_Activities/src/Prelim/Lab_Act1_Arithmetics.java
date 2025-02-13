/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prelim;

/**
 *
 * @author User
 */
public class Lab_Act1_Arithmetics {
    public static void main(String[] args){
    
        int m= 10;
        int i= 4;
        int c= 6;
        
        int One= m*i+c;
        int Two=(m-i)%c;
        int The=(m+i+c)/3;
        int For=m*c-(i*i);
        
        
        System.out.println("10 * 4 + 6      =" + One);
        System.out.println("(10 - 4) % 6    =" + Two);
        System.out.println("(10 + 4 + 6)/ 3 =" + The);
        System.out.println("10 * 5 - (4-4)  =" + For);
    
    }
}
