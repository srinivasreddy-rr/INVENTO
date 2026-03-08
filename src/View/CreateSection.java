package View;

import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Section;

import java.util.Scanner;

public class CreateSection implements Option {

    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter Section Name:");
        String name = s.next();
        System.out.println("Enter Description:");
        String description = s.next();
        Section section = new Section();
        section.setName(name);
        section.setDescription(description);
        new Controller.CreateSection(section,database);
    }

    @Override
    public String getOption() {
        return "Add New Section";
    }
}
