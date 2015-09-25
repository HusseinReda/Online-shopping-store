
package the_project;

import java.util.Date;

public class Drink extends Food
{
        public Drink(){}
        public Drink (String name,int codeno,double price,double quantity)
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
