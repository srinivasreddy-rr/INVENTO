package Controller;


import Model.Database;
import Model.Employee;

import java.sql.SQLException;

public class CreateEmployee {

  public CreateEmployee(Employee e, Database database){
      String insert = "INSERT INTO `employees_details`( `FirstName`, `LastName`, `Email`," +
              " `PhoneNumber`, `Address`, `Salary`, `Department`, `Password`)" +
              " VALUES ('"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getEmail()+"','"+e.getPhoneNumber()+"','"+e.getAddress()+"','"+e.getSalary()+"','"+e.getDepartment()+"','"+e.getPassword()+"');";
            try{
                database.getStatement().execute(insert);
                System.out.println("Employee created succesfully");
            } catch (SQLException exception) {
               exception.printStackTrace();
            }

  }
}
