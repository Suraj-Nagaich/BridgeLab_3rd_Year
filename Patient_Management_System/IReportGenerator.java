package Patient_Management_System;
interface IReportGenerator {
    void generateReport();
}
class PatientReport implements IReportGenerator {
    public void generateReport() {
        System.out.println("Generating Patient Report...");
    }
}
class DoctorReport implements IReportGenerator {
    public void generateReport() {
        System.out.println("Generating Doctor Report...");
    }
}
