/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author velinakk
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.PrintStream;

public class InputFile {
    public static void main(String[] args) throws IOException {
        
    }
    
    public void neZnam()
    {
        try
        {
            File file = new File("C:\\Users\\velinakk\\Documents\\Информатика\\Project\\src\\project\\ResultFile.txt");
            boolean isCreated = file.createNewFile();
            if(isCreated)
            {
                System.out.println("File has been created successfully.");
            }
            else
            {
                System.out.println("File already present at the specified location.");
            }
        }
        catch(IOException e)
        {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
        PrintStream fileWriter = new PrintStream("C:\\Users\\velinakk\\Documents\\Информатика\\Project\\src\\project\\ResultFile.txt");
        fileWriter.println(print());
    }
    
    public void print()
    {
        Level obj = new Level();
        int cows = obj.countCows();
        int bulls = obj.countBulls();
        for(int i = 0; i < 4; i++)
        {
            System.out.println(obj.getGuess()[i]);
        }
        System.out.println(" - " + bulls + " bulls, " + cows + " cows");
    }
    
}