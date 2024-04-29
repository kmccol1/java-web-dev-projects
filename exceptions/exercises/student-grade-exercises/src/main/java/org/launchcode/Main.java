package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
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
                result = x / y;
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
    }
}