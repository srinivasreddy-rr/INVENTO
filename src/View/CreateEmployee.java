package View;

import Model.*;

import java.util.Scanner;

public class CreateEmployee implements Option {


    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter the first name:");
        String firstName = s.next();
        System.out.println("Enter the Last name:");
        String lastName = s.next();
        System.out.println("Enter email:");
        String email = s.next();
        System.out.println("ENTER Phone number:");
        String phoneNumber = s.next();
        System.out.println("Enter address:");
        String address = s.next();
        System.out.println("Enter Salary(double):");
        double salary = s.nextDouble();
        System.out.println("Enter Password:");
        String password = s.next();
        System.out.println("Enter department(0.Admin 1.Cashier 2.StoreKeeper):");
        int department = s.nextInt();
        Employee e;
        switch (department){
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
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setEmail(email);
        e.setAddress(address);
        e.setPassword(password);
        e.setSalary(salary);
        e.setPhoneNumber(phoneNumber);
        new Controller.CreateEmployee(e,database);
    }

    @Override
    public String getOption() {
        return "Add New Employee";
    }
}
