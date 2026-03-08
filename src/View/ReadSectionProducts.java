package View;

import Controller.ReadAllSection;
import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class ReadSectionProducts implements Option {


    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter Section ID(-1 to show all Sections):");
        int section = s.nextInt();
        while(section<0){
            new ReadAllSection(database).print();
            System.out.println("Enter Section ID(-1 to show all Sections):");
             section = s.nextInt();
        }
        new Controller.ReadSectionProducts(section,database).print();
    }

    @Override
    public String getOption() {
        return "View Section Products";
    }
}
