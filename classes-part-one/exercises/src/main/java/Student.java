public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

        public String getName()
        {
                return this.name;
        }
        public int getStudentID()
        {
                return this.studentId;
        }
        public int getNumberOfCredits()
        {
                return this.numberOfCredits;
        }
        public double getGPA()
        {
                return this.gpa;
        }

        public void setName(String newName)
        {
                this.name = newName;
        }
        public void setStudentID(int newID)
        {
                this.studentId = newID;
        }
        private void setNumberOfCredits(int numCredits)
        {
                this.numberOfCredits = numCredits;
        }
        public void setGPA(double gpa)
        {
                this.gpa = gpa;
        }


}
