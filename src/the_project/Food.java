package the_project;
import java.util.Date;
public abstract class Food implements Product
{
        private int codeno;
        private double price,quantity;//amount and price are in kilos
        private String name;
        /*public boolean healthy(Date end)
        {
            long diff = end.getTime() - production.getTime();
            long dayCount =  diff / (24 * 60 * 60 * 1000);
            return lifetime > dayCount ;
        }*/
        public void setname(String name)
        {
            this.name=name;
        }
        
        public void setprice(double price)
        {
            this.price=price;
        }
        public void setcodeno(int codeno)
        {
            this.codeno=codeno;
        }
        public void setquantity(double quantity)
        {
            this.quantity=quantity;
        }
        public double getquantity()
        {
               return quantity;
        }
        
        public String getname()
        {
            return name;
        }
        public double getprice()
        {
            return price;
        }
        public int getcodeno()
        {
            return codeno;
        }
        public double setamount()
        {
            return quantity;
        }
        public String canBeSold(Date x,int k)
        {
            if((int)getquantity()<k )
                return "There are no "+k+" pieces available :( \n";
            else
            {
                setquantity(getquantity()-k);
                return "Purchasing done!\n";
            }
        }
        public abstract String toString();
}
