package Controller;

import Model.*;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ReadEmployee {
    private Employee e;
    public ReadEmployee(int ID, Database database)  {
        String select = "SELECT * FROM `employees_details` WHERE `ID` = " + ID + ";";
       try{
           ResultSet rs = database.getStatement().executeQuery(select);
           rs.next();
           String firstName = rs.getString("FirstName");
           String lastName = rs.getString("LastName");
           String phoneNumber = rs.getString("PhoneNumber");
           String email = rs.getString("Email");
           String password = rs.getString("Password");
           String address = rs.getString("Address");
           double salary = rs.getDouble("Salary");
           int department = rs.getInt("Department");

           switch (department) {
               case 0:
                   e = new Admin();
                   break;
               case 1:
                   e = new Cashier();
                   break;
               case 2:
                   e = new Storekeeper();
                   break;
               default:
                   System.out.println("Invalid Department");
                   e = new Cashier();
                   break;
           }
           e.setID(ID);
           e.setFirstName(firstName);
           e.setLastName(lastName);
           e.setEmail(email);
           e.setAddress(address);
           e.setPassword(password);
           e.setSalary(salary);
           e.setPhoneNumber(phoneNumber);
           e.setEmail(email);
           e.setPassword(password);
       } catch (SQLException exception ){
           exception.printStackTrace();
       }
    }
    public Employee getEmployee(){
        return e;
    }
    public void printEmployee(){
        e.print();


    }

}
