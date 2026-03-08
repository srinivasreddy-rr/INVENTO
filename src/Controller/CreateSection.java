package Controller;

import Model.Database;
import Model.Section;

import java.sql.SQLException;

public class CreateSection {
    public CreateSection(Section s, Database database){
         String insert = "INSERT INTO `section`( `Name`, `Description`) VALUES ('"+s.getName()+"','"+s.getDescription()+"');";
        try{
            database.getStatement().execute(insert);
            System.out.println("Section created succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
