package Controller;

import Model.Database;
import Model.Product;

import java.sql.ResultSet;

public class ReadProducts {
    private Product p;
    public ReadProducts(int ID, Database database){
   String select =  "SELECT * FROM `products` WHERE `ID` = "+ID+" ;";
        try{
            ResultSet rs = database.getStatement().executeQuery(select);
            while(rs.next()){
                p= new Product();
                p.setID(rs.getInt("ID"));
                p.setName(rs.getString("Name"));
                p.setDescription(rs.getString("Description"));
                p.setPrice(rs.getDouble("Price"));
                p.setQty(rs.getInt("Qty"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public Product getProduct(){
         return p;
    }
}
