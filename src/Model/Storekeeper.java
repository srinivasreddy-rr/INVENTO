package Model;

import View.*;

public class Storekeeper extends Employee {
    public Storekeeper(){
       generateList();
    }
    public Storekeeper(int ID,String firstName,String lastName,String email,
                    String phoneNumber,String address,double salary,String password){
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
                new CreateSection(),
                new ReadAllSection(),
                new UpdateSection(),
                new DeleteSection(),
                new CreateProduct(),
                new ReadAllProducts(),
                new ReadSectionProducts(),
                new UpdateProduct(),
                new DeleteProduct(),
                new ChangePassword()
        };
    }
    @Override
    public int getDepartment() {
        return 2;

    }


}
