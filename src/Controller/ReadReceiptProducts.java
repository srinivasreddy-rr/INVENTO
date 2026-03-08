package Controller;

import Model.Database;
import Model.Product;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReadReceiptProducts {
    private ArrayList<Product> products;

    public ReadReceiptProducts(int ID, Database database){
        ArrayList<Integer> productIDs = new ArrayList<>();
        ArrayList<Integer> qtys = new ArrayList<>();
        products = new ArrayList<>();
        String select = "SELECT * FROM `receiptsproducts` WHERE `Receipt` = "+ID+" ;";
        try{
            ResultSet rs = database.getStatement().executeQuery(select);
            while (rs.next()){
         productIDs.add(rs.getInt("Product"));
         qtys.add(rs.getInt("Qty"));
            }
            for(int i = 0;i<productIDs.size();i++){
                products.add(new ReadProducts(productIDs.get(i),database).getProduct());
                products.get(i).setQty(qtys.get(i));
            }
        } catch (SQLException e) {
          e.printStackTrace();
        }
    }
    public ArrayList<Product> getProducts(){
        return products;
    }
}
