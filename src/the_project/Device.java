package the_project;

public abstract class Device implements Product
{
    private String type;
    private String model;
    private String brand;    
    private double price;
    private int quantity;
    
    
    public abstract String toString();
    public abstract String available(int x);   
    
    public String getType()
    {
        return type;
    }
    public String getModel()
    {
        return model;
    }
    public double getPrice()
    {
        return price;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setModel(String model)
    {
        this.model=model;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public String getBrand()
    {
        return brand;
    }
}
