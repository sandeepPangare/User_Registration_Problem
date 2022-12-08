package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateFirstName.validate("Sandeep"));
            System.out.println("First name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateFirstName.validate("sandeep"));
            System.out.println("First name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateLastName.validate("Pangare"));
            System.out.println("Last name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateLastName.validate("pangare"));
            System.out.println("Last name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateEmail.validate("abc.xyz@bl.co.in"));
            System.out.println("Email is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateEmail.validate("abc@bl.in@.in"));
            System.out.println("Email is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatePhoneNumber.validate("91 9919819801"));
            System.out.println("Mobile Number is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatePhoneNumber.validate("919919819801"));
            System.out.println("Mobile Number is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule1.validate("Sandy005"));
            System.out.println("Password Rule1 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule1.validate("Sandy05"));
            System.out.println("Password Rule1 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule2.validate("Sandy.05"));
            System.out.println("Password Rule2 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule2.validate("sandy.05"));
            System.out.println("Password Rule2 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue()  {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule3.validate("Sandy@105"));
            System.out.println("Password Rule3 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule3.validate("Sandy@#$%"));
            System.out.println("Password Rule3 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule4.validate("Sandy@55vire"));
            System.out.println("Password Rule4 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatePasswordRule4.validate("Sandy555"));
            System.out.println("Password Rule4 is valid");
        } catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }
}