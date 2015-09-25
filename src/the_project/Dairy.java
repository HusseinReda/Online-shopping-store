package the_project;

import java.util.Date;

public class Dairy extends Food
{
        public Dairy(){}
        public Dairy (String name,int codeno,double price,double quantity)
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
