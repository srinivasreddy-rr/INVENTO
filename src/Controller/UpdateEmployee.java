package Controller;

import Model.Database;
import Model.Employee;

import java.sql.SQLException;

public class UpdateEmployee {
    public UpdateEmployee(Employee e, Database database) {
        String update = "UPDATE `employees_details` SET `FirstName`='"+ e.getFirstName()+
                "',`LastName`='" +e.getLastName()+"',`Email`='"+e.getEmail()+"'," +
                "`PhoneNumber`='"+e.getPhoneNumber()+"',`Address`='"
                +e.getAddress()+"',`Salary`='"+e.getSalary()+"' WHERE `ID` ="+e.getID()+" ;";
        try{
            database.getStatement().execute(update);
            System.out.println("Employee Updated succesfully");
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
