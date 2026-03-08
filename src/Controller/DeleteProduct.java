package Controller;

import Model.Database;

import java.sql.SQLException;

public class DeleteProduct {
    public DeleteProduct(int ID, Database database){
        String delete = "DELETE FROM `products` WHERE `ID` = "+ID+";";
        try{
            database.getStatement().execute(delete);
            System.out.println("Product Deleted succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
