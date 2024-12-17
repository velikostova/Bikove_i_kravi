/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author velinakk
 */
public class Easy extends Level{
    int[] guess = new int[4];
    public Easy()
    {
        super();
        generateNumber(false);
        countBulls(guess);
        countCows(guess);
    }
    
}
