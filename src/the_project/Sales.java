package the_project;


public class Sales extends Employee
{
    public Sales(){}
    public Sales(String name,int employmentYears)
    {
        setName(name);
        setemploymentYears(employmentYears);
    }

    public void calculateSalary()
    {
        setSalary(getemploymentYears()*1000);
    }    
}
