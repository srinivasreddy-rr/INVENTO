package Controller;

import Model.Database;

import java.sql.SQLException;

public class DeleteSection {
    public DeleteSection(int ID, Database database){
      String delete = "DELETE FROM `section` WHERE `ID` = "+ID+";";
      String deleteProducts = "DELETE FROM `products` WHERE `Section` = "+ID+";";
      try{
         database.getStatement().execute(delete);
          database.getStatement().execute(deleteProducts);
          System.out.println("Section Deleted Succesfully");
      }catch(SQLException e){
          e.printStackTrace();
      }
    }
}
