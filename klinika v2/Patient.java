package com.company;


import java.util.Scanner;

public class Patient extends Klinika {
    String doctor;

    {
        System.out.println("Vvedenite plan le4eniya");
    }

    Scanner scanner = new Scanner(System.in);
    int treatmentPlan = scanner.nextInt();

    void treatmentPlan(int treatmentPlan) {
        switch (treatmentPlan) {
            case 1 -> {
                doctor = hirurg;
                System.out.print(doctor + " " );
                hirurgTreatment();
            }
            case 2 -> {
                doctor = dantist;
                System.out.print(doctor + " " );
                dantistTreatment();

            }
            default -> {
                doctor = hirurg;
                System.out.print(doctor + " " );
                terapevtTreatment();

            }
        }


    }
}