package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void welcome(){
        System.out.println("Welcome to User Registration System Problem");
    }
    public static void main(String[] args) throws Invalid_InputDetailsException {
        welcome(); //calling static method
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name:\nEnter 2: To validate Last Name:\nEnter 3: To validate email: \nEnter 4: To validate Mobile Number: \nEnter 5: To validate passwordRule1: \nEnter 6: To Validate Password Rule2 : \nEnter 7: To Validate Password Rule3 : \nEnter 8: To Validate Password Rule4 : ");
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