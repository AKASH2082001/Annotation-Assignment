package com.harman.projannotation;

import java.math.BigInteger;
import java.util.Scanner;

class Employee {
        void details(){}
        @Deprecated
        void test(){
            System.out.println("Testing...");
        }
    }
    class Details extends Employee {
        @Override
        void details() {
            super.details();
            Scanner in = new Scanner(System.in);
            String name, address, email;
            System.out.println("Employee Name :");
            name = in.nextLine();
            System.out.println("Employee Address :");
            address = in.nextLine();
            System.out.println("Employee email :");
            email = in.nextLine();
            int age;
            BigInteger phone;
            System.out.println("Employee Age :");
            age = in.nextInt();
            System.out.println("EMployee Phone no:");
            phone = in.nextBigInteger();
            System.out.println("Name :" + name);
            System.out.println("Age :" + age);
            System.out.println("Address :" + address);
            System.out.println("email :" + email);
            System.out.println("Phone :" + phone);
        }
        public @interface Myannotation{
        }
        @Myannotation()
        public static void main(String[] args) {
            Details obj = new Details();
            obj.test();
            obj.details();
        }
    }

