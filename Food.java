/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

/**
 *
 * @author Harrey Be
 */
public class Food {
    String Food_Name;
    static double Calories;
    static double Grams;
    static int Spice_Level;
    Food(String F_N, double Cal, double Gram, int S_L){
        Food_Name = F_N;
        Calories = Cal;
        Grams = Gram;
        Spice_Level = S_L;
    }
    public static void Prepare_Food(int x){
        if(x==1){
            Calories = 10.0;
            Grams = 200;
            Spice_Level = 2;
            System.out.println("Burger Prepared ! ");
        }
        else if(x==2){
            Calories = 15.0;
            Grams = 210;
            Spice_Level = 3;
            System.out.println("Shawarma Prepared ! ");
        }
        else if(x==3){
            Calories = 50.0;
            Grams = 700;
            Spice_Level = 2;
            System.out.println("Pizza Prepared ! ");
        }
        
    }
}
