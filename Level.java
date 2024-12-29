/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bullsandcows;

import java.util.Random;

/**
 *
 * @author Velina
 */
public class Level {
    private int[] number;
    
    public void setNumber(boolean includesZero)
    {
        number = new int[4];
        number = generateNumber(includesZero);
    }
    
    public int[] getNumber()
    {
        return number;
    }
    
    public int getNumberIndex(int i)
    {
        return number[i];
    }
    
    public Level(boolean includesZero)
    {
        setNumber(includesZero);
    }
    
    public int[] generateNumber(boolean includesZero)
    {
        Random generator = new Random();
        for(int i = 0; i < 4; i++)
        {
            int digit = 0;
            boolean unique = false;
            while(!unique)
            {
                unique = true;
                if(includesZero)
                {
                    digit = generator.nextInt(10);
                }
                else
                {
                    digit = generator.nextInt(9) + 1;
                }
                for(int j = 0; j < i; j++)
                {
                    if(number[j] == digit)
                    {
                        unique = false;
                        break;
                    }
                }
            }
            number[i] = digit;
        }
        return number;
    }
    
    public int countBulls(int[] guess)
    {
        int counterBulls = 0;
        for(int i = 0; i < 4; i++)
        {
            if(getNumberIndex(i) == guess[i])
            {
                counterBulls++; 
            }
        }
        return counterBulls;
    }
    
    public int countCows(int[] guess)
    {
        int counterCows = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int k = 0; k < 4; k++)
            {
                if(k != i && getNumberIndex(i) == guess[k])
                {
                    counterCows++;
                }
            }
        }
        return counterCows;
    }
}
