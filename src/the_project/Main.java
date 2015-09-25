package the_project;

import java.util.*;
import java.io.*;

public class Main {

    public static void read_Food_Data(Vector < Vector<Food> > food,Vector <Food> temp_food,Scanner scan_food)
    {
        Vector <Food> temp;
        int c;
        for(c=0;c<3;c++)
            temp_food.add(new Drink(scan_food.next(),scan_food.nextInt(),scan_food.nextDouble(),scan_food.nextDouble()));        
        temp=new Vector(temp_food);
        food.add(temp);        
        temp_food.clear();
        for(c=0;c<3;c++)
            temp_food.add(new Dairy(scan_food.next(),scan_food.nextInt(),scan_food.nextDouble(),scan_food.nextDouble()));
        temp=new Vector(temp_food);
        food.add(temp);
        temp_food.clear();
        for(c=0;c<3;c++)
            temp_food.add(new Meat(scan_food.next(),scan_food.nextInt(),scan_food.nextDouble(),scan_food.nextDouble()));
        temp=new Vector(temp_food);
        food.add(temp);
        temp_food.clear();
        for(c=0;c<3;c++)
            temp_food.add(new Vegetable(scan_food.next(),scan_food.nextInt(),scan_food.nextDouble(),scan_food.nextDouble()));
        temp=new Vector(temp_food);
        food.add(temp);
        temp_food.clear();
        for(c=0;c<3;c++)
            temp_food.add(new Fruit(scan_food.next(),scan_food.nextInt(),scan_food.nextDouble(),scan_food.nextDouble()));
        temp=new Vector(temp_food);
        food.add(temp);
        temp_food.clear();
    }
   
    public static void read_device_data(Vector<Vector<Device>> device, Vector<Device> temp_device, Scanner scan_device)
    {        
        Vector <Device> temp;
        int c;
        for(c=0;c<3;c++)
            temp_device.add(new Electronical(scan_device.next(),scan_device.next(),scan_device.next(),scan_device.nextDouble(),scan_device.nextInt()));
        temp=new Vector(temp_device);
        device.add(temp);
        temp_device.clear();
        for(c=0;c<3;c++)
            temp_device.add(new HomeApp(scan_device.next(),scan_device.next(),scan_device.next(),scan_device.nextDouble(),scan_device.nextInt()));
        temp=new Vector(temp_device);
        device.add(temp);
        temp_device.clear();
    }

    public static void read_clothes_data(Vector<Vector<Clothes>> clothes, Vector<Clothes> temp_clothes, Scanner scan_clothes)
    {
        Vector <Clothes> temp;
        int c;
        for(c=0;c<3;c++)
            temp_clothes.add(new ClothesMan(scan_clothes.next(),scan_clothes.next(),scan_clothes.next(),scan_clothes.nextDouble(),scan_clothes.next(),scan_clothes.nextInt()));
        temp=new Vector(temp_clothes);
        clothes.add( temp);
        temp_clothes.clear();
        for(c=0;c<3;c++)
            temp_clothes.add(new ClothesWoman(scan_clothes.next(),scan_clothes.next(),scan_clothes.next(),scan_clothes.nextDouble(),scan_clothes.next(),scan_clothes.nextInt()));
        temp=new Vector(temp_clothes);
        clothes.add(temp);
        temp_clothes.clear();
        for(c=0;c<3;c++)
            temp_clothes.add(new ClothesKid(scan_clothes.next(),scan_clothes.next(),scan_clothes.next(),scan_clothes.nextDouble(),scan_clothes.next(),scan_clothes.nextInt()));
        temp=new Vector(temp_clothes);
        clothes.add( temp);
        temp_clothes.clear();
        
    }
    
    private static void read_employee_data(Vector<Vector<Employee>> employee, Vector<Employee> temp_employee, Scanner scan_employee) 
    {
        Vector <Employee> temp;
        int c;
        for(c=0;c<2;c++)
            temp_employee.add(new Sales(scan_employee.next(),scan_employee.nextInt()));
        temp=new Vector(temp_employee);
        employee.add(temp);
        temp_employee.clear();
        for(c=0;c<2;c++)
            temp_employee.add(new Cashier(scan_employee.next(),scan_employee.nextInt(),scan_employee.nextDouble(),scan_employee.nextDouble()));
        temp=new Vector(temp_employee);
        employee.add(temp);
        temp_employee.clear();
        for(c=0;c<2;c++)
            temp_employee.add(new DeliveryBoy(scan_employee.next(),scan_employee.nextInt(),scan_employee.nextDouble()));
        temp=new Vector(temp_employee);
        employee.add(temp);
        temp_employee.clear();
        
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Date date=new Date(2014-3-4);
        Owner BOB = new Owner("ana lekbeeeer",15);
        
  
        ////Scanning Food data
        File file_food=new File("Food data.txt");
        Scanner scan_food= new Scanner(file_food);
        Vector < Vector<Food> > food = new Vector <>();
        Vector <Food> temp_food = new Vector <>();
        read_Food_Data(food,temp_food,scan_food);
        /////////
        
        
        ////Scanning Devices data
        File file_device=new File("Device data.txt");
        Scanner scan_device= new Scanner(file_device);
        Vector < Vector<Device> > device = new Vector <>();
        Vector<Device> temp_device= new Vector <>();
        read_device_data(device,temp_device,scan_device);
        /////////
        
        
        ////Scanning Clothes data
        File file_clothes=new File("Clothes data.txt");
        Scanner scan_clothes= new Scanner(file_clothes);
        Vector < Vector<Clothes> > clothes = new Vector <>();
        Vector <Clothes> temp_clothes = new Vector <>();
        read_clothes_data(clothes,temp_clothes,scan_clothes);
        /////////
        
        
        Vector < Manager > Ms = new Vector <>();
        HRManager HRM=new HRManager ("ana bta3 el HR",5);
        SalesManager SM = new SalesManager("ana bta3 elsales",6);
        CEO CEOM = new CEO ("ana elmanager elasasy",10);
        Ms.add(CEOM);
        Ms.add(HRM);
        Ms.add(SM);
        
        ////Scanning Employees data
        Vector < Vector < Employee> > employee=new Vector<>();
        File file_employee=new File("Employee data.txt");
        Scanner scan_employee= new Scanner(file_employee);
        Vector<Employee> temp_employee= new Vector <>();
        read_employee_data(employee,temp_employee,scan_employee);
        /////////
        

        FrameMainPage frame= new FrameMainPage(food, device, clothes,employee,Ms);
        
    }
}

