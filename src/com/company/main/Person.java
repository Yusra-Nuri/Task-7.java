package com.company.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
    String SurnameNuri56870, FirstNameNuri56870, StreetNuri56870, zipCodeNuri56870, CityNuri56870;

    void initializeNuri56870() throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Surname: ");
        SurnameNuri56870 = br.readLine();
        System.out.println("First Name: ");
        FirstNameNuri56870 = br.readLine();
        System.out.println("Street: ");
        StreetNuri56870 = br.readLine();
        System.out.println("zipCode: ");
        zipCodeNuri56870 = br.readLine();
        System.out.println("City: ");
        CityNuri56870 = br.readLine();
    }

    void printNuri56870() {
        System.out.println("Surname: " + SurnameNuri56870);
        System.out.println("First Name: " + FirstNameNuri56870);
        System.out.println("Street: " + StreetNuri56870);
        System.out.println("zipCode: " + zipCodeNuri56870);
        System.out.println("City: " + CityNuri56870);
    }
}

class Staff extends Person {
    String EducationNuri56870, PositionNuri56870;

        void initialize1Nuri56870() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            initializeNuri56870();
            System.out.println("Education: ");
            EducationNuri56870 = br.readLine();
            System.out.println("Position: ");
            PositionNuri56870 = br.readLine();
        }

        void print1Nuri56870() {
            //call appropriate methods from the Person class

            printNuri56870();
            System.out.println("Education: " + EducationNuri56870);
            System.out.println("Position: " + PositionNuri56870);
        }
    }
    class Main {
        public static void main(String[] args) throws  IOException{

            Staff uc = new Staff();
            uc.initialize1Nuri56870();
            uc.print1Nuri56870();
        }
    }