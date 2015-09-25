package the_project;

public class HomeApp extends Device
{
    public HomeApp(){}
    public HomeApp(String type,String model,String brand,double price,int quantity)
    {
        setType(type);
        setModel(model);
        setBrand(brand);
        setPrice(price);
        setQuantity(quantity);
    }
    private int yearOfProd;
    public void setYearOfProd(int yearOfProd)
    {
        this.yearOfProd=yearOfProd;
    }
    public int getYearOfProd()
    {
        return yearOfProd;
    }
    public String toString()
    {
        return "Type: "+getType()+" Model: "+ getModel();
    }

    public String available(int x)
    {
        if(getQuantity()<x)
            return "There are no more pieces available :(";
        else
        {
            setQuantity(getQuantity()-x);
            return "Purchasing done!";
        }
    }
}
