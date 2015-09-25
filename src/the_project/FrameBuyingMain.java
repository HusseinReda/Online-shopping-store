package the_project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class FrameBuyingMain extends JFrame{
    Vector < Vector<Food> > food ;
    Vector < Vector<Device> > device ;
    Vector < Vector<Clothes> > clothes ;
    Vector < Vector < Employee> > employee=null;
    Vector < Manager > Ms=null;
    public FrameBuyingMain( final Vector < Vector<Food> > food , final Vector < Vector<Device> > device , final Vector < Vector<Clothes> > clothes ,final Vector < Vector < Employee> > employee,final Vector < Manager > Ms )
    {
        this.food=food;
        this.device=device;
        this.clothes=clothes;
        setTitle("Main Buying Page");
        setLocation(100,40);
        setSize(510,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        Font font=new Font("SansSerif",Font.BOLD+ Font.ITALIC, 38);
        GridLayout grid=new GridLayout(1, 3);
        GridLayout grid2=new GridLayout(2, 1);
        
        //North Panel
        JPanel north = new JPanel(new BorderLayout());
        JButton backToMainPage = new JButton("Back To Main Page");
        backToMainPage.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                FrameMainPage fr= new FrameMainPage(food, device, clothes,employee,Ms);
                setVisible(false);
                fr.setVisible(true);
            }
        });
        JLabel whattobuy = new JLabel("What do you want to buy ?");
        whattobuy.setFont(font);
        north.add(backToMainPage,BorderLayout.EAST);
        north.add(whattobuy,BorderLayout.SOUTH);
        add(north,BorderLayout.NORTH);
        
        
        //Center Panel
        JPanel center = new JPanel(grid);
        JButton foodd = new JButton("FOOD");
        JButton devicee = new JButton("DEVICES");
        JButton clothess = new JButton("CLOTHES");
        Font font2=new Font("SansSerif",Font.BOLD+ Font.ITALIC, 24);
        foodd.setFont(font2);
        devicee.setFont(font2);
        clothess.setFont(font2);
        center.add(foodd);
        center.add(devicee);
        center.add(clothess);
        add(center,BorderLayout.CENTER);
        foodd.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                frameBuyFood2 fr=new frameBuyFood2();
                fr.food=food;
                fr.device=device;
                fr.clothes=clothes;
                fr.employee=employee;
                fr.Ms=Ms;
                fr.setVisible(true);
                setVisible(false);   
            }
        });
        devicee.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                frameBuyDevice fr=new frameBuyDevice();
                fr.food=food;
                fr.device=device;
                fr.clothes=clothes;
                fr.employee=employee;
                fr.Ms=Ms;
                fr.setVisible(true);
                setVisible(false);   
            }
        });
        clothess.addActionListener(new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                frameBuyClothes fr=new frameBuyClothes();
                fr.food=food;
                fr.device=device;
                fr.clothes=clothes;
                fr.employee=employee;
                fr.Ms=Ms;
                setVisible(false);
                fr.setVisible(true);
            }
        });
        setVisible(true);
    }
}
