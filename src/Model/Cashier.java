package Model;

import View.ChangePassword;
import View.CreateProduct;
import View.CreateReceipt;
import View.ReadAllReceipts;


public class Cashier extends Employee {
    public Cashier(){
        generateList();
    }
    public Cashier(int ID,String firstName,String lastName,String email,
                    String phoneNumber,String address,double salary,String password) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.password = password;
        generateList();
    }
    private void generateList(){
        this.options =  new Option[] {
                new CreateReceipt(),
                new ReadAllReceipts(),
                new ChangePassword()
        };
    }

    @Override
    public int getDepartment() {
        return 1;

    }

}
