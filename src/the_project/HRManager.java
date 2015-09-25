package the_project;


public class HRManager extends Manager
{
    public HRManager(){}
    public HRManager(String name,int employmentYears)
    {
        setemploymentYears(employmentYears);
        setName(name);
    }
    @Override
    public void calculateSalary()
    {
        double x =getemploymentYears()*20000;
        x+=0.07*getnoOfEmployees();
        setSalary(x);
    }
}
