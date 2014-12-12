

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eraizel
 */
public class AmazonStore {
    static Products[] productsList = new Products [100];
    public static void main (String [] args){
        // create a new instance of a product
    Products p1 = new Products(1,"Microsoft Office",99.99,2014,"Microsoft");
    Book b1 = new Book(1,"Microsoft Office",99.99,2014,"Microsoft","Eliazer Raizel", "123123DEASD123", 365);
    Software s1 = new Software(1,"Microsoft Office",99.99,2014,"Microsoft",500, 2.2, "Windows 7");
    
    // Printing test if the classes are working correct
    System.out.println(p1.getProductName());
    System.out.println(b1.getBookAuthor());
    System.out.println(s1.getSoftProcSpeed());
    
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




