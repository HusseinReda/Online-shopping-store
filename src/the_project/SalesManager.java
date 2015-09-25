package the_project;


public class SalesManager extends Manager
{
    public SalesManager(){}
    public SalesManager(String name,int employmentYears)
    {
        setemploymentYears(employmentYears);
        setName(name);
    }
    private double commission;
    public void setCommission(double commission)
    {
        this.commission=commission;
    }
    public double getCommission()
    {
        return commission;
    }
    public void calculateSalary() 
    {
        double x = getemploymentYears()*17000;
        x += (0.03*getnoOfEmployees());
        x += commission*getemploymentYears()*0.09;
        setSalary(x);
    }
    public String toString()
    {
        return "Name: " + getName()+" Commission: "+commission;
    }
}
