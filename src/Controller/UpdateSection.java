package Controller;

import Model.Database;
import Model.Section;

import java.sql.SQLException;

public class UpdateSection {
   public UpdateSection(Section s, Database database){
      String update = "UPDATE `section` SET `Name`='"+s.getName()+"',`Description`='" +
              ""+s.getDescription()+"' WHERE `ID` ="+s.getID()+" ;";
      try{
         database.getStatement().execute(update);
         System.out.println("Section Updated succesfully");
      } catch (SQLException exception) {
         exception.printStackTrace();
      }

   }
}
