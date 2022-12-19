package Homework3;

public class Hospital {
    private int doctors;
    private int nurses;
    private int otherStaff;
    private int patients;
    private int doctorsOffices;
    private int operatingRooms;
    private int chambers;

    Hospital(){

    }

    Hospital(int doctors, int nurses, int otherStaff, int patients, int doctorsOffices, int operatingRooms, int chambers){
        this.doctorsOffices = doctorsOffices;
        this.operatingRooms = operatingRooms;
        this.chambers = chambers;
        this.doctors = doctors;
        this.nurses = nurses;
        this.otherStaff = otherStaff;
        this.patients = patients;
    }

    Hospital(Hospital hospital){
        this.doctors = hospital.doctors;
        this.nurses =hospital.nurses;
        this.otherStaff =hospital.otherStaff;
        this.doctorsOffices =hospital.doctorsOffices;
        this.operatingRooms =hospital.operatingRooms;
        this.chambers =hospital.chambers;
    }

    public void setDoctors(int doctors) {
        this.doctors = doctors;
    }

    public void setNurses(int nurses) {
        this.nurses = nurses;
    }

    public void setOtherStaff(int otherStaff) {
        this.otherStaff = otherStaff;
    }

    public void setPatients(int patients) {
        if (patients > chambers){
            System.out.println("Not enough chambers for this amount of patients");
            return;
        }
        this.patients = patients;
    }

    public void setDoctorsOffices(int doctorsOffices) {
        this.doctorsOffices = doctorsOffices;
    }

    public void setOperatingRooms(int operatingRooms) {
        this.operatingRooms = operatingRooms;
    }

    public void setChambers(int chambers) {
        this.chambers = chambers;
    }

    public int getDoctors() {
        return doctors;
    }

    public int getNurses() {
        return nurses;
    }

    public int getOtherStaff() {
        return otherStaff;
    }

    public int getPatients() {
        return patients;
    }

    public int getDoctorsOffices() {
        return doctorsOffices;
    }

    public int getOperatingRooms() {
        return operatingRooms;
    }

    public int getChambers() {
        return chambers;
    }

    public int getFreeChambers(){
        return chambers - patients;
    }
}