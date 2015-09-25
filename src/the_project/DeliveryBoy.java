package the_project;


public class DeliveryBoy extends Employee
{
    private int hours;
    private double wage;
    public DeliveryBoy(){}
    public DeliveryBoy(String name,int hours,double wage)
    {
        setName(name);
        sethours(hours);
        setwage(wage);
    }
    public void sethours(int hours)
    {
        this.hours=hours;
    }
    public int gethours()
    {
        return hours;
    }
    
    public void setwage(double wage)
    {
        this.wage=wage;
    }
    public double getwage()
    {
        return wage;
    }
    
    public void calculateSalary() {
        setSalary(hours*wage);
    }
}
