package the_project;

public interface Staff 
{
    public void setGender(char gender);
    public char getGender();
    public void setSalary(double salary);
    public double getSalary();
    public String getName();
    public void setemploymentYears(int employmentYears);
    public int getemploymentYears();
    public abstract void calculateSalary();
}
