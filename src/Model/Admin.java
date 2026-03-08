package Model;

import View.*;


public class Admin extends Employee{
    public Admin() {
           generateList();
    }
    public Admin(int ID,String firstName,String lastName,String email,
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
            new CreateEmployee(),
            new ReadAllEmployees(),
            new UpdateEmployee(),
            new DeleteEmployee(),
            new CreateSection(),
            new ReadAllSection(),
            new UpdateSection(),
            new DeleteSection(),
            new CreateProduct(),
            new ReadAllProducts(),
            new ReadSectionProducts(),
            new UpdateProduct(),
            new DeleteProduct(),
            new CreateReceipt(),
            new ReadAllReceipts(),
            new ChangePassword()
    };
}

    @Override
    public int getDepartment() {
        return 0;
    }


}
