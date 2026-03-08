package Model;

import java.util.Scanner;

public abstract class Employee {
    protected int ID;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String phoneNumber;
    protected String address;
    protected double salary;
    protected String password;
    protected Option[] options;
    public Employee(){

    }
    public Employee(int ID,String firstName,String lastName,String email,
                    String phoneNumber,String address,double salary,String password){
         this.ID = ID;
         this.firstName = firstName;
         this.lastName = lastName;
         this.email = email;
         this.phoneNumber = phoneNumber;
         this.address = address;
         this.password = password;
         this.salary = salary;

    }
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String  getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String  getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String  getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String  getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String  getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public double  getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String  getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public abstract int getDepartment();
    // 0 ==> Admin
    // 1 ==> Cashier
    // 2 ==> StoreKeeper
public  String getDepartmentToString(){
    String dept;
    switch(getDepartment()){
        case 0 :
            dept = "Manager";
            break;
        case 1 :
            dept = "Cahsier";
            break;
        case 2 :
           dept = "Cashier";
            break;
        default:
            dept = "Invalid";
            break;
    }
    return dept;
}
    public void showList(Scanner s,Database database) {
        System.out.println("-------------------------");
        for(int i = 1;i<=options.length;i++){
            System.out.println(i +". " +options[ i-1 ].getOption());
        }
        System.out.println("-------------------------");
        int selected = s.nextInt();
        options[selected-1].oper(this,s,database);
        showList(s,database);
    }
    public String getName(){
    return getFirstName()+" "+getLastName();
    }
    public void print(){
        System.out.println("-------------------------------------");
        System.out.println("ID:\t\t\t\t"+getID());
        System.out.println("First Name:\t\t" +getFirstName());
        System.out.println("Last Name:\t\t" +getLastName());
        System.out.println("Email:\t\t\t"+getEmail());
        System.out.println("Phone Number:\t"+getPhoneNumber());
        System.out.println("Address:\t\t"+getAddress());
        System.out.println("Salary:\t\t\t"+getSalary()+"₹");
        System.out.println("Department:\t\t"+getDepartmentToString());
        System.out.println("-------------------------------------");
    }
}
