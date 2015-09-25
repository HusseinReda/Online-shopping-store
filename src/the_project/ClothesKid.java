package the_project;


public class ClothesKid extends Clothes
{
    public ClothesKid(){}
    public ClothesKid(String type,String brand,String size,double price,String color,int quantity)
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
        return "(For Kids)\nType: " + getType()+" Brand: "+getBrand()+" Size: "+ getSize();
    }
}
