package Controller;

import Model.Database;
import Model.Employee;

import java.sql.SQLException;

public class ChangePassword {
    public ChangePassword(String password, Employee user, Database database){
         String update = "UPDATE `employees_details` SET `Password`='"+password+"' WHERE `ID`='"+user.getID()+" ';";
        try{
            database.getStatement().execute(update);
            System.out.println("Password Changed succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
