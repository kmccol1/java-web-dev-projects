package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(Course aCourse)
    {
        StringBuilder result = new StringBuilder("==========================================\n");
        result.append("==Class Topic=====================instructor====\n");
        result.append(aCourse.topic).append("\t\t").append(aCourse.instructor);
        result.append("==========================================\n");

        for (Student aStudent : enrolledStudents)
        {
            result.append(aStudent.getName()).append("\n");
        }

        return result.toString();
    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.

    public boolean equals(Course aCourse)
    {
        return Objects.equals(this.topic, aCourse.topic) && Objects.equals(this.instructor, aCourse.instructor);
    }
}
