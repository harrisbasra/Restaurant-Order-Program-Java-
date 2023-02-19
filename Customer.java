/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;


/**
 *
 * @author Harrey Be
 */
public class Customer extends Food {
    
    String Cus_Name;
    static double Balance;
    String Food_Needed;
    Customer(String Food_Need, String C_N, double B, String F_N, double Cal, double Gram, int S_L){
        super(F_N, Cal, Gram, S_L);
        Cus_Name = Cus_Name;
        Balance = B;
    }
    void Pay_Cash(double price){
        if(price<=Balance)
           Balance -= price;
        else
           System.out.println("Less Balance");
        
        System.out.println("Remaining Cash Is: "+String.valueOf(Balance));
        return;
    }
}
