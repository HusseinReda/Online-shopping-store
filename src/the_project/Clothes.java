package the_project;

public abstract class Clothes implements Product
{
    private String type; //Tshirt , pants ,shoes ...
    private String brand;
    private String size;
    private double price;
    private String color;
    private int quantity;
    public Clothes(){}
    public Clothes(String type,String brand,String size,double price,String color,int quantity)
    {
        this.type=type;
        this.brand=brand;
        this.size=size;
        this.price=price;
        this.color=color;
        this.quantity=quantity;
    }
    public String toString(){
        return "Type: "+type+ "  "+"Brand: "+brand+"  "+ "Size: "+size+"  "+"Price: "+price+"  "+"Color: "+color;
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public void setColor(String color)
    {
        this.color=color;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    
    public void setSize(String size)
    {
        this.size=size;
    }
    
    public void setPrice(double price)
    {
        this.price=price;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public String getType()
    {
        return type;
    }
    public String getBrand()
    {
        return brand;
    }
    public String getSize()
    {
        return size;
    }
    public double getPrice()
    {
        return price;
    }
    public String getColor()
    {
        return color;
    }
    public String canBeSold(int k)
    {
        if(quantity<k)
            return "There are no"+k+" pieces available :(\n";
        else
        {
            quantity-=k;
            return "Purchasing done!\n";
        }
    }    
    public boolean equals(Object x) 
    {
        Clothes clothes = (Clothes) x;
        return (getType().equals(clothes.getType()) && getBrand().equals(clothes.getBrand()) && getSize().equals(clothes.getSize()));
    }       
}
