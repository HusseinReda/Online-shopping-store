package the_project;

public class CEO extends Manager
{    
    public CEO(String name,int employmentYears)
    {
        setemploymentYears(employmentYears);
        setName(name);
    }
    public void calculateSalary() 
    {       
        double x = getemploymentYears()*17000;
        x += (0.05*getnoOfEmployees());
        setSalary(x);
    }
}
