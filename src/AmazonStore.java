
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eraizel
 */
public class AmazonStore extends JFrame implements ActionListener {
    JButton b1, b2, b3;
    JPanel container, p1, p2, p3;
    CardLayout c1;
    JTextField t1;
    
    
    public static void main (String [] args){
        new AmazonStore();
        
        // create a new instance of a product
    Products p1 = new Products(1,"Microsoft Office",99.99,2014,"Microsoft");
    Book b1 = new Book(1,"Microsoft Office",99.99,2014,"Microsoft","Eliazer Raizel", "123123DEASD123", 365);
    Software s1 = new Software(1,"Microsoft Office",99.99,2014,"Microsoft",500, 2.2, "Windows 7");
    
    // Printing test if the classes are working correct
    System.out.println(p1.getProductName());
    System.out.println(b1.getBookAuthor());
    System.out.println(s1.getSoftProcSpeed());

    
    }
    AmazonStore(){
        super("Amazon Store");
        setSize(500,500);
        setLayout(new FlowLayout());
        
        b1 = new JButton("one");
        b2 = new JButton("two");
        b3 = new JButton("three");
        add(b1);
        add(b2);
        add(b3);
        
        p1 = new JPanel();
        p1.setBackground(Color.red);
        p2 = new JPanel();
        p2.setBackground(Color.blue);
        p3 = new JPanel();
        p3.setBackground(Color.yellow);
        t1 = new JTextField(10);
        p2.add(t1);
        
        container = new JPanel();
        container.setPreferredSize(new Dimension(300,300));
        container.setBackground(Color.green);
        c1 = new CardLayout();
        container.setLayout(c1);
        container.add(p1, "card1");
        container.add(p2, "card2");
        container.add(p3, "card3");
        add(container);
        
        setVisible(true);
        
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            c1.show(container, "card1");
        }
        if(e.getSource() == b2){
            c1.show(container, "card2");
        }
        if(e.getSource() == b3){
            c1.show(container, "card3");
        }
        
    }
    
}

class Products{
    
    // Product Constructors
    
    private int pID;
    private String pName;
    private double pCost;
    private int pYearPub;
    private String pPubHouse;
    
    public Products(int pID, String pName, double pCost, int pYearPub, 
            String pPubHouse){
        System.out.println("Product Created");
        this.pID = pID;
        this.pName = pName;
        this.pCost = pCost;
        this.pYearPub = pYearPub;
        this.pPubHouse = pPubHouse;
}    
    // Products Setters
    public void setProductID(int pID){
        this.pID=pID;   
    }
    public void setProductName(String pName){
        this.pName=pName;
    }
    public void setProductCost(double pCost){
        this.pCost=pCost;
    }
    public void setProductYearPublication(int pYearPub){
        this.pYearPub=pYearPub;
    }
    public void setProductPublicationHouse(String pPubHouse){
        this.pPubHouse=pPubHouse;
    }
    
    // Products Getters
    public int getProductID(){
        return pID;   
    }
    public String getProductName(){
        return pName;
    }
    public double getProductCost(){
        return pCost;
    }
    public int getProductYearPublication(){
        return pYearPub;
    }
    public String getProductPublicationHouse(){
        return pPubHouse;
    }




}




