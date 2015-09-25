package the_project;

public abstract class Manager extends Employee
{
    private int noOfEmployees;
    
    private char gender;
    public void setGender(char gender)
    {
        this.gender=gender;
    }
    public char getGender(){
        return gender;
    }
    public void setnoOfEmployees(int noOfEmployees)
    {
        this.noOfEmployees=noOfEmployees;
    }
    public int getnoOfEmployees()
    {
        return noOfEmployees;
    }
    
    public abstract void calculateSalary();
    public String toString()
    {
        return "Name: "+getName()+" Employment Years: "+getemploymentYears();
    }
    public boolean equals(Object y)
    {
        Manager x = (Manager)y;
        return this.getName().equals(x.getName()) && this.noOfEmployees==x.noOfEmployees;
    }
}
