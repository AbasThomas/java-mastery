package org.example;

public class Doctor extends HealthCare{
  public Doctor(String name, String staffId){
      super(name, staffId);
  }
    @Override
    public void performDuty() {
        System.out.println("Doctor treatign patients and wrting prescriptions");
    }
}
