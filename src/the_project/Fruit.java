package the_project;

import java.util.Date;


public class Fruit extends Food
{
        public Fruit (){}
        public Fruit (String name,int codeno,double price,double quantity)
        {
            setname(name);
            setprice(price);
            setcodeno(codeno);
            setquantity(quantity);
        }
        public String toString()
        {
            return "Name: "+getname();
        }
}
