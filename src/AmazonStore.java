
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    JButton b1, b2, b3, b4;
    JPanel container, p1, p2, p3, p4;
    CardLayout c1;
    JLabel lID, lName, lCost, lYearPub, lPubHouse, lAuthor, lISBNb, 
            lNumberPages, lHardDisc, lProcSpeed, lMinRequirements;
    JTextField tID, tName, tCost, tYearPub, tPubHouse, tAuthor, tISBNb, 
            tNumberPages, tHardDisc, tProcSpeed, tMinRequirements;
    
    
    public static void main (String [] args){
        new AmazonStore();
        new DatabaseConnection();
    
        // create a new instance of a product
        Products p1 = new Products(1,"Microsoft Office",99.99,2014,"Microsoft");
        Book b1 = new Book(1,"Microsoft Office",99.99,2014,"Microsoft","Eliazer Raizel", "123123DEASD123", 365);
        Software s1 = new Software(1,"Microsoft Office",99.99,2014,"Microsoft",500, 2.2, "Windows 7");
    
    }
    
    AmazonStore(){
        super("Amazon Store");
        setSize(500,500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buttonAndPanels();
        mainContainer();
                
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
        if(e.getSource() == b4){
            c1.show(container, "card4");
        }
        
    }
    public void order(){
        p1 = new JPanel();
        p1.setBackground(Color.red);
    
    }
    public void addBook(){
        // Book Labels
        lID = new JLabel("Product ID:");
        lName = new JLabel("Book Name:");
        lCost = new JLabel("Book Cost:");
        lYearPub = new JLabel("Year of Publication:");
        lPubHouse = new JLabel("Publication House:");
        lAuthor = new JLabel("Book Author:");
        lISBNb = new JLabel("Book ISBN:"); 
        lNumberPages = new JLabel("Number of Pages");
        
        // Book TextFields
        tID = new JTextField(10);
        tName = new JTextField(30);
        tCost = new JTextField(10);
        tYearPub = new JTextField(10);
        tPubHouse = new JTextField(30);
        tAuthor = new JTextField(30);
        tISBNb = new JTextField(30); 
        tNumberPages = new JTextField(10);
        
        p2 = new JPanel();
        p2.setBackground(Color.yellow);
        p2.add(lID);
        p2.add(tID);
        p2.add(lName);
        p2.add(tName);
        p2.add(lCost);
        p2.add(tCost);
        p2.add(lYearPub);
        p2.add(tYearPub);
        p2.add(lPubHouse);
        p2.add(tPubHouse);
        p2.add(lAuthor);
        p2.add(tAuthor);
        p2.add(lISBNb);
        p2.add(tISBNb);
        p2.add(lNumberPages);
        p2.add(tNumberPages);
        
        
        
    
    }
    public void addSoftware(){
        p3 = new JPanel();
        p3.setBackground(Color.yellow);
    
    }
    public void addCostumer(){
        p4 = new JPanel();
        p4.setBackground(Color.white);
    
    }
    public void buttonOptions(){
        b1 = new JButton("New Order");
        b2 = new JButton("Add New Book");    
        b3 = new JButton("Add New Software");
        b4 = new JButton("Add Costumer");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    
    public void mainContainer(){
        container = new JPanel();
        container.setPreferredSize(new Dimension(300,300));
        //container.setBackground(Color.green);
        c1 = new CardLayout();
        container.setLayout(c1);
        container.add(p1, "card1");
        container.add(p2, "card2");
        container.add(p3, "card3");
        container.add(p4, "card4");
        add(container);
    }
    
    private void buttonAndPanels(){
        buttonOptions();
        order();
        addBook();
        addSoftware();
        addCostumer();
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




