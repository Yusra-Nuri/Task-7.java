package com.company.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

interface Salary{
    int SalaryToPay_Nuri_56870(int hours, int rate);

    default int SalaryForOvertime_Nuri_56870(int OvertimeHours, int OvertimeRate) {
        return OvertimeHours * OvertimeRate;
    }
    static boolean Bonus_Nuri_56870(int yearsOfExperience){
        if(yearsOfExperience >= 5)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
class Person {
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

class Staff extends Person implements Salary{
    String EducationNuri56870, PositionNuri56870;

        void initialize1Nuri56870() throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            initializeNuri56870();
            System.out.println("Education: ");
            EducationNuri56870 = br.readLine();
            System.out.println("Position: ");
            PositionNuri56870 = br.readLine();
        }

        void print1Nuri56870()
        {
            printNuri56870();
            System.out.println("Education: " + EducationNuri56870);
            System.out.println("Position: " + PositionNuri56870);
        }
        @Override
        public int SalaryForOvertime_Nuri_56870(int OvertimeHours, int OverRate )
        {
        return Salary.super.SalaryForOvertime_Nuri_56870(OvertimeHours, OverRate);
        }

        public int SalaryToPay_Nuri_56870(int hours, int rate)
        {
        return hours*rate;
        }

       }
    }

    class Main {
        public static void main(String[] args) throws  IOException{

            Salary.Staff uc = new Salary.Staff();
            uc.initialize1Nuri56870();
            uc.print1Nuri56870();

            System.out.println("");
            System.out.println("Salary to be paid: "+ uc.SalaryToPay_Nuri_56870(60,30));
            System.out.println("Salary for Overtime: " + uc.SalaryForOvertime_Nuri_56870(20,40));
            System.out.println("Bonus: " + Salary.Bonus_Nuri_56870(10));
        }

    }