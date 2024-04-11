package org.launchcode;

import java.util.Objects;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel()
    {
        // Determine the grade level of the student based on numberOfCredits
        String result;

        if (this.numberOfCredits <= 29)
        {
            result = "Freshman";
        }
        else if (this.numberOfCredits <= 59)
        {
            result = "Sophomore";
        }
        else if (this.numberOfCredits <= 89)
        {
            result = "Junior";
        }
        else
        {
            result = "Senior";
        }

        return result;
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade)
    {
        // Update the appropriate fields: numberOfCredits, gpa
        double qualityScore = this.gpa * this.numberOfCredits;
        qualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = qualityScore / this.numberOfCredits;
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    //@Override
    public boolean equals(Student aStudent)
    {
        return studentId == aStudent.studentId && numberOfCredits == aStudent.numberOfCredits &&
                Double.compare(gpa, aStudent.gpa) == 0 && Objects.equals(name, aStudent.name);
    }

    public String toString(Student aStudent)
    {
        String result = aStudent.name + " is a " + aStudent.getGradeLevel() + " with " +
                aStudent.getNumberOfCredits() + " credits and a GPA of " + this.getGpa();

        return result;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}