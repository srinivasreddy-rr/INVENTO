package View;

import Controller.ReadAllEmployees;
import Controller.ReadEmployee;
import Model.Database;
import Model.Employee;
import Model.Option;

import java.sql.SQLException;
import java.util.Scanner;

public class UpdateEmployee implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database)  {
        System.out.println("Enter Employee ID(-1 to show All Employees):");
        int ID = s.nextInt();
        while(ID<0){
            new ReadAllEmployees(database).print();
            System.out.println("Enter Employee ID(-1 to show All Employees):");
             ID = s.nextInt();
        }
        Employee emp = new ReadEmployee(ID,database).getEmployee();
        System.out.println("Enter First Name(-1 to Keep "+emp.getFirstName()+"):");
        String firstName = s.next();
        if(!firstName.equals("-1")){
            emp.setFirstName(firstName);
        }
        System.out.println("Enter Last Name(-1 to Keep"+emp.getLastName()+"):");
        String lastName = s.next();
        if(!lastName.equals("-1")){
            emp.setLastName(lastName);
        }
        System.out.println("Enter Email(-1 to Keep"+emp.getEmail()+"):");
        String email = s.next();
        if(!email.equals("-1")){
            emp.setEmail(email);
        }
        System.out.println("Enter PhoneNumber(-1 to Keep"+emp.getPhoneNumber()+"):");
        String phonenumber = s.next();
        if(!phonenumber.equals("-1")){
            emp.setPhoneNumber(phonenumber);
        }
        System.out.println("Enter Address(-1 to Keep"+emp.getAddress()+"):");
        String address = s.next();
        if(!address.equals("-1")){
            emp.setAddress(address);
        }
        System.out.println("Enter Salary(-1 to Keep"+emp.getSalary()+"):");
        double salary = s.nextDouble();
        if(salary != -1){
            emp.setSalary(salary);
        }
          new Controller.UpdateEmployee(emp,database);
    }

    @Override
    public String getOption() {
        return "Update Employee's Data";
    }
}
