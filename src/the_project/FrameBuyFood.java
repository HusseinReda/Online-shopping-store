package the_project;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class FrameBuyFood extends JFrame{
    public FrameBuyFood(final Vector<Vector<Food>> food)
    {

        setTitle("Buying Food");
        setLocation(100,40);
        setSize(510,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //north panel
        JPanel north = new JPanel(new BorderLayout());
        JButton backToMainPage = new JButton("Back To Main Page");
        JButton back = new JButton("Back");
        north.add(backToMainPage,BorderLayout.EAST);
        north.add(back,BorderLayout.EAST);
        add(north,BorderLayout.NORTH);
        
        //center panel
        ///System.out.println();
        JPanel center=new JPanel(new FlowLayout());
        final JComboBox boxType = new JComboBox(new String[]{"-------------","Drink", "Dairy", "Meat","Vegetable","Fruit"});
        final JComboBox boxTypeIn = new JComboBox();
        
        boxTypeIn.setEnabled(false);
        
        boxType.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                boxTypeIn.setEnabled(true);                
                if(boxType.getSelectedItem()=="Drink")
                {
                    for(int i=0;i<food.get(0).size();i++)
                         boxTypeIn.addItem(food.get(0).get(i).getname());
                }
                else if(boxType.getSelectedItem().equals("Dairy"))
                {
               //     System.out.println("YES !!");
                    for(int i=0;i<food.get(1).size();i++)
                         boxTypeIn.addItem(food.get(1).get(i).getname());
                }
                else if(boxType.getSelectedItem().equals("Meat"))
                {
                    for(int i=0;i<food.get(2).size();i++)
                         boxTypeIn.addItem(food.get(2).get(i).getname());
                }
                else if(boxType.getSelectedItem().equals("Vegetables"))
                {
                    for(int i=0;i<food.get(3).size();i++)
                         boxTypeIn.addItem(food.get(3).get(i).getname());
                }
                else if(boxType.getSelectedItem().equals("Fruit"))
                {
                    for(int i=0;i<food.get(4).size();i++)
                         boxTypeIn.addItem(food.get(4).get(i).getname());;
                }
            }
        });
        JTextField quantity = new JTextField(8);
        
        center.add(boxType,BorderLayout.WEST);
        center.add(boxTypeIn,BorderLayout.CENTER);
        center.add(quantity,BorderLayout.EAST);
        
        add(center);
        
        setVisible(true);
    }
    
}
