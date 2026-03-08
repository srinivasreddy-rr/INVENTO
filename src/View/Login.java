package View;
import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class Login implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Welcome to INVENTO");
        System.out.println("Enter your Email:");
        String email = s.next();
        System.out.println("Enter your password:");
        String password = s.next();
        Controller.Login login = new Controller.Login(email, password, database);
        if (login.isLoggedIn()) {
            Employee employee = login.getUser();
            System.out.println("Welcome " + employee.getFirstName());
            employee.showList(s, database);
        } else {
            System.out.println("Wrong email or Password!");
            System.out.println("Try again later");
        }
    }
        @Override
        public String getOption() {
            return "Login";
        }


}
