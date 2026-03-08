package View;

import Controller.ReadAllProducts;
import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class DeleteProduct implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter Products ID(-1 to show all products):");
        int ID = s.nextInt();
        ReadAllProducts readProducts = new ReadAllProducts(database);
        while(ID<0){
            readProducts.print();
            System.out.println("Enter Products ID(-1 to show all products):");
            ID = s.nextInt();
        }
        if(!readProducts.getIDs().contains(ID)){
            System.out.println("Invalid Product ID");
            return;
        }
        new Controller.DeleteProduct(ID,database);
    }

    @Override
    public String getOption() {
        return "Remove Product";
    }
}
