package Patient_Management_System;
class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    public Appointment(Patient patient, Doctor doctor, String date, String time) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }
	public void showAppointmentDetails() {
		System.out.println("Appointment Details:");
        System.out.println("Patient: " + patient.getName() + " (ID: " + patient.getPatientId() + ")");
        System.out.println("Doctor: " + doctor.getName() + " [" + doctor.getSpecialization() + "]");
        System.out.println("Date: " + date + ", Time: " + time);
	}
}

