package View;

import Controller.ReadAllSection;
import Model.Database;
import Model.Employee;
import Model.Option;
import Model.Product;

import java.util.Scanner;

public class CreateProduct implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        Product product = new Product();
        System.out.println("Enter Name:");
        product.setName(s.next());
        System.out.println("Enter Description:");
        product.setDescription(s.next());
        System.out.println("Enter Price(double):");
        product.setPrice(s.nextDouble());
        System.out.println("Enter Quantity(Integer):");
        product.setQty(s.nextInt());
        System.out.println("Enter section ID(-1 to show all sections):");
        int sectionID = s.nextInt();
        ReadAllSection sections = new ReadAllSection(database);
        while(sectionID<0){
            new ReadAllSection(database).print();
            System.out.println("Enter section ID(-1 to show all sections):");
            sectionID = s.nextInt();
        }
        if(!sections.getIDs().contains(sectionID)){
            System.out.println("Section Doesn't exist!");
            return;
        }
        new Controller.CreateProduct(product,sectionID,database);
    }

    @Override
    public String getOption() {
        return "Add New Product";
    }
}
