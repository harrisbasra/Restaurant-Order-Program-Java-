/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;

/**
 *
 * @author Harrey Be
 */
public class Cashier extends Chef {
    String Name;
    double Salary;
    Customer C;
    Cashier(String N, double S, String Chef_N, String Exp, double Sal, Customer C1){
        super(Chef_N,Exp,Sal);
        Name = N;
        Salary = S;
        C = C1;
    }
    static int Display_Menu() {
        int returenr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Here Is The Menu: ");
        System.out.println("1: Burger ($ 5)");
        System.out.println("2: Shawarma ($ 2.5)");
        System.out.println("3: Pizza ($ 10)");
        while(true){
            System.out.print("Enter The Number You Want to Buy: ");
            returenr = sc.nextInt();
            if(returenr == 1 || returenr == 2 || returenr == 3){
                break;
            }
            System.out.println("Enter Valid Choice ");
        }
        
        return returenr;
    }
    
}
