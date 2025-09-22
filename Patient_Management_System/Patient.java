package Patient_Management_System;
class Patient {
    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public void setMedicalHistory(String history) { this.medicalHistory = history; }
    protected String getMedicalHistory() { return medicalHistory; }
	public int getPatientId() {
		 return patientId;
    }
	}


