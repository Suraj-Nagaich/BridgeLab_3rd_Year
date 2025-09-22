package Patient_Management_System;

public class Main {
	 public static void main(String[] args) {
	        Patient p1 = new Patient(101, "Suraj", 20);
	        p1.setMedicalHistory("Diabetes, Allergy");
	        Doctor d1 = new Doctor(201, "Dr. Sanjay Sharma", "Dermatologist");
	        Appointment appt1 = new Appointment(p1, d1, "22-Sep-2025", "10:00 AM");
	        appt1.showAppointmentDetails();

	        System.out.println(" Reports ");
	        PatientReport preg = new PatientReport();
	        preg.generateReport();
	        DoctorReport dreg = new DoctorReport();
	        dreg.generateReport();
	    }
	}


