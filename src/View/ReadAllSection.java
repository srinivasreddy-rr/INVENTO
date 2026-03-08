package View;

import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class ReadAllSection implements Option {



    @Override
    public void oper(Employee user, Scanner s, Database database) {
        new Controller.ReadAllSection(database).print();
    }

    @Override
    public String getOption() {
        return "View All Sections";
    }
}
