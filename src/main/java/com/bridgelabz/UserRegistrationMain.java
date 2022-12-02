package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void welcome(){
        System.out.println("Welcome to User Registration System Problem");
    }
    public static void main(String[] args) {
        welcome(); //calling static method
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name:\nEnter 2: To validate Last Name:\nEnter 3: validate email: \nEnter 4 : to validate Mobile Number: \nEnter 5: validate passwordRule1: \n6. Validate Password Rule2 : \n7. Validate Password Rule3 : \n8. Validate Password Rule4 : ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName("Sandeep");
                break;
            case 2:
                UserRegistration.validLastName("Pangare");
                break;
            case 3:
                UserRegistration.validEmail("abc.xyz@bl.co.in");
                break;
            case 4:
                UserRegistration.validMobileNumber("91 9919819801");
                break;
            case 5:
                UserRegistration.validPasswordRule1("Sandy005");
                break;
            case 6:
                UserRegistration.validPasswordRule2("Sandy.05");
                break;
            case 7:
                UserRegistration.validPasswordRule3("Sandy105");
                break;
            case 8:
                UserRegistration.validPasswordRule4("Sandy@55");
                break;
        }
    }
}