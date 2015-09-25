package the_project;


public class Cashier extends Employee
{
    private int hours;
    private double wage;
    private double commission;
    public Cashier(){}
    public Cashier(String name,int hours,double wage,double commission)
    {
        setName(name);
        this.hours=hours;
        this.wage=wage;
        this.commission=commission;
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
    public double getCommission()
    {
        return commission;
    }
    public void calculateSalary() {
        setSalary(hours*wage+hours*0.7*commission);
    }
}
