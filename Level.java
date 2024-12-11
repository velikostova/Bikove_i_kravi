/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.Random;

/**
 *
 * @author velinakk
 */
public class Level {
    private int number[] = new int[4];
    private int guess[] = new int[4];
    private int attemptsLeft;
    
    public Level()
    {
        this(25);
    }
    public Level(int attempts)
    {
        
    }
    
    public int countBulls()
    {
        int counterBulls = 0;
        for(int i = 0; i < 4; i++)
        {
            if(number[i] == guess[i])
            {
                counterBulls++; 
            }
        }
        return counterBulls;
    }
    
    public int countCows()
    {
        int counterCows = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int k = 0; k < 4; k++)
            {
                if(k != i && number[i] == guess[k])
                {
                    counterCows++;
                }
            }
        }
        return counterCows;
    }
    
    public void generateNumber()
    {
        Random generator = new Random();
        int arr[] = new int[4];
        arr[0] = generator.nextInt(10);
        arr[1] = generator.nextInt(10);
        while(arr[0] == arr[1])
        {
            arr[1] = generator.nextInt(10);
        }
        arr[2] = generator.nextInt(10);
        while(arr[0] == arr[2] || arr[1] == arr[2])
        {
            arr[2] = generator.nextInt(10);
        }
        arr[3] = generator.nextInt(10);
        while(arr[0] == arr[3] || arr[1] == arr[3] || arr[2] == arr[3])
        {
            arr[3] = generator.nextInt(10);
        }
    }
}
