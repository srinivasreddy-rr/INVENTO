package View;


import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class ReadAllProducts implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
          new Controller.ReadAllProducts(database).print();

    }

    @Override
    public String getOption() {
        return "View All Products";
    }
}
