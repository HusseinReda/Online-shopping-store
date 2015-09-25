package the_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class FrameMainPage extends JFrame{
    Vector < Vector<Food> > food ;
    Vector < Vector<Device> > device ;
    Vector < Vector<Clothes> > clothes ;
    Vector < Vector < Employee> > employee=null;
    Vector < Manager > Ms=null;
    public FrameMainPage( final Vector < Vector<Food> > food , final Vector < Vector<Device> > device , final Vector < Vector<Clothes> > clothes ,final Vector < Vector < Employee> > employee,final Vector < Manager > Ms)
    {
        this.food=food;
        this.device=device;
        this.clothes=clothes;
        this.employee=employee;
        this.Ms=Ms;
        setTitle("Main Page");
        setLocation(100,40);
        setSize(500,260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ///north panel
        JPanel north=new JPanel();
        ImageIcon icon=new ImageIcon("welcome-to-our-store.gif");
        north.add(new JLabel(icon));
        add(north,BorderLayout.NORTH);
        
        ///south panel
        GridLayout pan2layout = new GridLayout(1,2);
        JPanel south=new JPanel(pan2layout);
        JButton customer = new JButton("Customer");
        JButton management = new JButton("Management");
        Font font=new Font("SansSerif",Font.BOLD+ Font.ITALIC, 24);
        customer.setFont(font);
        management.setFont(font);
        south.add(customer);
        south.add(management);
        add(south,BorderLayout.SOUTH);
        customer.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                FrameBuyingMain fr=new FrameBuyingMain(food,device,clothes,employee,Ms);
                setVisible(false);
                fr.setVisible(true);
            }
        });
        
        management.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                ManagerLogin fr=new ManagerLogin();
                setVisible(false);
                fr.device=device;
                fr.food=food;
                fr.clothes=clothes;
                fr.employee=employee;
                fr.Ms=Ms;
                fr.setVisible(true);
            }
        });
        setVisible(true);
    }
}
