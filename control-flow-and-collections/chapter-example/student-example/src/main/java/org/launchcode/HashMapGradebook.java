package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradebook {
    public static void main(String[] args) {
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("Grade: ");
                Double newGrade = input.nextDouble();
                students.put(newStudent, newGrade);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
            sum += student.getValue();
        }

        double avg = sum / students.size();
        System.out.println("Average grade: " + avg);

        for (String student : students.keySet()) {
            System.out.println(student);
        }

        for (double grade : students.values()) {
            System.out.println(grade);
        }

        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("Venus", 0);
        moons.put("Earth", 1);
        moons.put("Mars", 2);
        moons.put("Jupiter", 79);
        moons.put("Saturn", 82);
        moons.put("Uranus", 27);
        moons.put("Neptune", 14);

        for (String planet : moons.keySet()) {
            System.out.println(planet);
        }

        for (double val : moons.values()) {
            System.out.println(val);
        }
    }
}
