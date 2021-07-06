/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;


public class Main_ezy {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int limit;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bilangan Kelipatan 3 dan 5");
        System.out.println("Masukkan Limit : ");
        limit = input.nextInt();
        System.out.println("Limit : " + limit);
        for (int number = 3; number <= limit; number ++){
            if (((number % 3) == 0 ) | (number % 5) == 0)
                System.out.println(number);
        }
    }
}
