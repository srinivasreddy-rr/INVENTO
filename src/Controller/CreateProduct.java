package Controller;

import Model.Database;
import Model.Product;

import java.sql.SQLException;

public class CreateProduct {
    public CreateProduct(Product p, int section,Database database){
        String insert = "INSERT INTO `products`( `Name`, `Description`, `Price`, `qty`, " +
                "`Section`) VALUES ('"+p.getName()+"','"+p.getDescription()+"','"+p.getPrice()+"'," +
                "'"+p.getQty()+"','"+section+"');";
        try{
            database.getStatement().execute(insert);
            System.out.println("Prouduct created succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
