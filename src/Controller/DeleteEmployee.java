package Controller;

import Model.Database;

import java.sql.SQLException;

public class DeleteEmployee {
    public DeleteEmployee(int ID, Database database){
        String delete="DELETE FROM `employees_details` WHERE `ID` = "+ID+";";
        try{
            database.getStatement().execute(delete);
            System.out.println("Employee Deleted succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
