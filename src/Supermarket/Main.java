package Supermarket;


import Model.Database;



import View.Login;

import java.util.Scanner;

public class Main {
    public  static void main(String[] args){
        new Login().oper(null,new Scanner(System.in),new Database());
    }
}
