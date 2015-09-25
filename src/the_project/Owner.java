package the_project;


public class Owner implements Staff
{
    private double salary;
    private String name;
    private char gender;
    private int employmentYears;
    public Owner(){}
    public Owner(String name,int employmentYears)
    {
        this.name=name;
        this.employmentYears=employmentYears;
    }
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
    public void calculateSalary()
    {
        setSalary(employmentYears*150000);
    }
}
