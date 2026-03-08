package View;

import Controller.ReadAllSection;
import Controller.ReadSection;
import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Section;

import java.util.Scanner;

public class UpdateSection implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter section ID(-1 to show all Sections):");
        int ID =s.nextInt();
        while(ID<0){
            new ReadAllSection(database).print();
            System.out.println("Enter Section ID(-1 to show all Sections):");
            ID =s.nextInt();
        }
        Section section = new ReadSection(ID,database).getSection();

        System.out.println("Enter section name(-1 to keep "+section.getName()+"):");
        String name = s.next();
        if(!name.equals("-1")){
            section.setName(name);
        }
        System.out.println("Enter section desciption(-1 to keep "+section.getDescription()+"):");
        String description = s.next();
        if(!description.equals("-1")){
            section.setDescription(description);
        }
        new Controller.UpdateSection(section, database);

    }

    @Override
    public String getOption() {
        return "Update Section's Data";
    }
}
