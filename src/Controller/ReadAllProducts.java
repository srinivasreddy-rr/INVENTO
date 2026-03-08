package Controller;

import Model.Database;
import Model.Product;

import java.sql.ResultSet;
import java.util.ArrayList;


public class ReadAllProducts {
    private ArrayList<Product> products;
    public ReadAllProducts(Database database){
        String select = "SELECT * FROM `products` ;";
        products = new ArrayList<>();
 try{
     ResultSet rs = database.getStatement().executeQuery(select);
     while(rs.next()){
         Product p= new Product();
         p.setID(rs.getInt("ID"));
         p.setName(rs.getString("Name"));
         p.setDescription(rs.getString("Description"));
         p.setPrice(rs.getDouble("Price"));
         p.setQty(rs.getInt("Qty"));
         products.add(p);
     }
 }catch(Exception e){
   e.printStackTrace();
 }
    }
    public void print(){
        for(Product p : products){
            p.print();
        }
        System.out.println("-------------------------");
    }
    public ArrayList<Integer> getIDs(){
        ArrayList<Integer> IDs = new ArrayList<>();

        for(Product p : products){
            IDs.add(p.getID());
        }
        return IDs;
    }
}
