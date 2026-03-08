package View;

import Controller.ReadAllEmployees;
import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class DeleteEmployee implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter Employee ID(-1 to show All Employees):");
        int ID = s.nextInt();
        while(ID<0){
            new ReadAllEmployees(database).print();
            System.out.println("Enter Employee ID(-1 to show All Employees):");
            ID = s.nextInt();
        }
        new Controller.DeleteEmployee(ID, database);
    }

    @Override
    public String getOption() {
        return "Fire Employee";
    }
}
