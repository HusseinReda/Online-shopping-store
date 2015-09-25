package the_project;

public class ClothesMan extends Clothes
{
    public ClothesMan(){}
    public ClothesMan(String type,String brand,String size,double price,String color,int quantity)
    {
        setBrand(brand);
        setType(type);
        setSize(size);
        setPrice(price);
        setColor(color);
        setQuantity(quantity);
    }
    public String toString()
    {
        return "(For Male)\nType: " + getType()+" Brand: "+getBrand()+" Size: "+ getSize();
    } 
}
