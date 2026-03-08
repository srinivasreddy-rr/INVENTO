package Model;

import java.sql.RowIdLifetime;

public class Product {
    private int ID;
    private String name;
    private String description;
    private double price;
    private int qty;

    public Product(){

    }
    public Product(int ID,String name,String description,double price,int qty){
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.qty = qty;
        this.price= price;
    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
 public void print(){
     System.out.println("-------------------------");
     System.out.println("ID:\t\t"+getID());
     System.out.println("Name:\t\t"+getName());
     System.out.println("Description:\t"+getDescription());
     System.out.println("Price:\t\t"+getPrice()+"$");
     System.out.println("Quantity:\t\t"+getID());
 }
}
