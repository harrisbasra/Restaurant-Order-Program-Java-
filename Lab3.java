/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab3;

/**
 *
 * @author Harrey Be
 */
public class Lab3 {
    static boolean Start_Order(Customer C1, Cashier Csr1){
        int option = Cashier.Display_Menu();
        Csr1.Cook();
        C1.Prepare_Food(option);
        C1.Pay_Cash(option);
        return true;
    }
    public static void main(String[] args) {
        Customer C1 = new Customer("Burger","Maxwell", 130.00, "Burger", 25.00, 150.00, 2);
        Cashier Cashier1 = new Cashier ("John", 200.00, "Mark", "FastFood", 250.00, C1);
        Start_Order(C1,Cashier1);
    }
}
