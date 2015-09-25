package the_project;

public abstract class Employee implements Staff
{
    private double salary;
    private String name;
    private int employmentYears;
    private char gender;
    public void setGender(char gender)
    {
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    public void setSalary(double salary)
    {
        this.salary=salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public void setemploymentYears(int employmentYears)
    {
        this.employmentYears=employmentYears;
    }
    public int getemploymentYears()
    {
        return employmentYears;
    }
    public abstract void calculateSalary();
    public String toString()
    {
        return "Name: "+getName();
    }
}
