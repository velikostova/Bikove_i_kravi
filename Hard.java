/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bullsandcows;

/**
 *
 * @author Velina
 */
public class Hard extends Level{
    int[] guess = new int[4];
    public Hard()
    {
        super(true);
        countBulls(guess);
        countCows(guess);
    }
}
