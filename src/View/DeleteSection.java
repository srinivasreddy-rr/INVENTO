package View;

import Controller.ReadAllSection;
import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class DeleteSection  implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter Section ID(-1 to show all sections):");
        int ID = s.nextInt();
        ReadAllSection readAllSection = new ReadAllSection(database);
        while(ID<0){
            readAllSection.print();
            System.out.println("Enter Section ID(-1 to show all sections):");
            ID = s.nextInt();
        }
    if(!readAllSection.getIDs().contains(ID)){
        System.out.println("Invalid Section ID");
        return;
    }
        System.out.println("Are you sure you want to delete " +
                "this section with all its Products?\n1.Yes\n2.No");
    int res = s.nextInt();
    if(res==1){
        new Controller.DeleteSection(ID,database);
    }

    }

    @Override
    public String getOption() {
        return "Remove Section";
    }
}
