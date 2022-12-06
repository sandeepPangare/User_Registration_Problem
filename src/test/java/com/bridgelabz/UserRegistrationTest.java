package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validFirstName("Sandeep"));
            System.out.println("First name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validFirstName("sandeep"));
            System.out.println("First name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validLastName("Pangare"));
            System.out.println("Last name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validLastName("pangare"));
            System.out.println("Last name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validEmail("abc.xyz@bl.co.in"));
            System.out.println("Email is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }



    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validEmail("abc@bl.in@.in"));
            System.out.println("Email is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validMobileNumber("91 9919819801"));
            System.out.println("Mobile Number is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validMobileNumber("919919819801"));
            System.out.println("Mobile Number is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule1("Sandy005"));
            System.out.println("Password Rule1 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule1("Sandy05"));
            System.out.println("Password Rule1 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule2("Sandy.05"));
            System.out.println("Password Rule2 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule2("sandy.05"));
            System.out.println("Password Rule2 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue()  {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule3("Sandy@105"));
            System.out.println("Password Rule3 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule3("Sandy@#$%"));
            System.out.println("Password Rule3 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule4("Sandy@55vire"));
            System.out.println("Password Rule4 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validPasswordRule4("Sandy555"));
            System.out.println("Password Rule4 is valid");
        } catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }
}
