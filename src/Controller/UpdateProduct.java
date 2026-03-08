package Controller;

import Model.Database;
import Model.Product;

import java.sql.SQLException;

public class UpdateProduct {
    public UpdateProduct(Product p, Database database){
        String update = "UPDATE `products` SET `Name`='"+p.getName()+"'," +
                "`Description`='"+p.getDescription()+"'," + "`Price`='"+p.getPrice()+"'," +
                "`Qty`='"+p.getQty()+"' WHERE `ID` = "+p.getID()+";";
        try{
            database.getStatement().execute(update);
            System.out.println("Product Updated succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
