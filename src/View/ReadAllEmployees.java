package View;

import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class ReadAllEmployees  implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
           new Controller.ReadAllEmployees(database).print();
    }

    @Override
    public String getOption() {
        return "View All Employees";
    }
}
