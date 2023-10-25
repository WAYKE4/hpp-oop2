package com.company;

public class Klinika {
    String hirurg = "hirurg";
    String terapevt = "terapevt";
    String dantist = "dantist";
    Patient patient;

    public Klinika(Patient patient) {
        this.patient = patient;
    }

    void hirurgTreatment() {
        System.out.println("Le4it hirurg");
    }

    void terapevtTreatment() {
        System.out.println("Le4it terapevt");
    }

    void dantistTreatment() {
        System.out.println("Le4it dantist");
    }

    void treatmentPlan(int treatmentPlan) {
        switch (treatmentPlan) {
            case 1 -> {
                patient.doctor = hirurg;
                hirurgTreatment();
            }
            case 2 -> {
                patient.doctor = dantist;
                dantistTreatment();
                ;
            }
            default -> {
                patient.doctor = hirurg;
                terapevtTreatment();

            }
        }

    }
}
