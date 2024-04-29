package org.launchcode;

import java.awt.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        int gradeOne = 51, total = 100;
        double score = Divide(gradeOne, total);
        System.out.println("Score: " + score);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        int fileExtStatus = CheckFileExtension(studentFiles.get("Brad"));
        switch(fileExtStatus)
        {
            case -1:
                System.out.println("Please provide a valid file name!");
                break;
            case 0:
                System.out.println("Please provide a file with the extension '.java'!");
                break;
            default:
                System.out.println("This is a valid file name and extension!");
                break;

        }
    }

    public static double Divide(int x, int y)
    {
        // Write code here!
        double result = -1;

        if (y == 0)
        {
            throw new ArithmeticException("Exception thrown");
        }
        else
        {
            try
            {
                result = (double) x / y;
            }
            catch(ArithmeticException errorStr)
            {
                System.out.println("Exception caught!");
            }
        }

        return result;
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
        //return 0;
        int result = -1;

        if (fileName.contains(".java") == true)
        {
            result = 1;
        }
        else if(!fileName.isEmpty())
        {
            result = 0;
        }
        else{
            try
            {
                throw new Exception("Exception thrown: File name must not be empty.");
            }
            catch(Exception anException)
            {
                System.out.println("Exception thrown! File name must not be empty string.");
                anException.printStackTrace();
            }
        }

        return result;
    }
}