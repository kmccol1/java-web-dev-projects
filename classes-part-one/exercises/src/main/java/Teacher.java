public class Teacher
{
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getSubject()
    {
        return this.subject;
    }
    public int getYearsTeaching()
    {
        return this.yearsTeaching;
    }

    public void setFirstName(String newFirstName)
    {
        this.firstName = newFirstName;
    }
    public void setLastName(String newLastName)
    {
        this.lastName = newLastName;
    }
    public void setSubject(String newSubject)
    {
        this.subject = newSubject;
    }
    public int setYearsTeaching(int numYears)
    {
        this.yearsTeaching = numYears;
    }
}
