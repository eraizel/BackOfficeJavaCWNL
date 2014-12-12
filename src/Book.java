/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eraizel
 */
class Book extends Products{
    private String bAuthor;
    private String bISBN;
    private int bNumberPages;
    
    public Book(int pID, String pName, double pCost, int pYearPub, 
            String pPubHouse, String bAuthor, String bISBN, int bNumberPages) {
        super(pID, pName, pCost, pYearPub, pPubHouse); // sent to parent class
        
        this.bAuthor = bAuthor;
        this.bISBN = bISBN;
        this.bNumberPages = bNumberPages;
        
    }
   
    //setters for Books
    public void setBookAuthor(String bAuthor){
        this.bAuthor=bAuthor;
    }
    public void setBookISBN(String bISBN){
        this.bISBN=bISBN;
    }
    public void setNumberPages(int bNumberPages){
        this.bNumberPages=bNumberPages;
    }
    
    // getters for Books
    public String getBookAuthor(){
        return bAuthor;
    }
    public String getBookISBN(){
        return bISBN;
    }
    public int getNumberPages(){
        return bNumberPages;
    }
    
}    
   