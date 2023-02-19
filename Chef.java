/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author Harrey Be
 */
public class Chef {
    String Chef_Name;
    String Expertise;
    double Sallary;
    Chef (String Chef_N, String Exp, double Sal){
        Chef_Name = Chef_N;
        Expertise = Exp;
        Sallary = Sal;
    }
    static void Cook(){
        System.out.println("Food Is Being Cooked :)");
    }
}
