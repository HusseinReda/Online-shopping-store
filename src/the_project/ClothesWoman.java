package the_project;


public class ClothesWoman extends Clothes
{
    public ClothesWoman(){}
    public ClothesWoman(String type,String brand,String size,double price,String color,int quantity)
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
        return "(For Female)\nType: " + getType()+" Brand: "+getBrand()+" Size: "+ getSize();
    }
}
