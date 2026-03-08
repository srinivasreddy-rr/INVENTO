package View;

import Model.Database;
import Model.Employee;
import Model.Option;

import java.util.Scanner;

public class ChangePassword implements Option {
    @Override
    public void oper(Employee user, Scanner s, Database database) {
        System.out.println("Enter Old Password");
        String oldpass = s.next();

        if(!oldpass.equals(user.getPassword())){
            System.out.println("Incorrect Password\n Try again Later");
            return;
        }
        System.out.println("Enter new Password");
        String newpass = s.next();
        System.out.println("Confirm password");
        String confirmpass = s.next();
        if(!newpass.equals(confirmpass)){
            System.out.println("Password doesn't match\n Try again later");
            return;
        }
        new Controller.ChangePassword(confirmpass,user,database);
    }

    @Override
    public String getOption() {
        return "Change Password";
    }
}
