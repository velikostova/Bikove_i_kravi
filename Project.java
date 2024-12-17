/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;

import java.util.Random;

/**
 *
 * @author velinakk
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Easy easyLevel = new Easy();
        int[] number = easyLevel.getNumber();
        for (int i = 0; i < 4; i++) 
        {
            System.out.print(number[i]);
        }
        System.out.println();
        int[] guess = {1, 2, 3, 4};
        int bulls = easyLevel.countBulls(guess);
        System.out.println("bulls - " + bulls);
        int cows = easyLevel.countCows(guess);
        System.out.println("cows - " + cows);
    }
    
}
