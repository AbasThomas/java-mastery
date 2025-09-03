package org.example;

public abstract class HealthCare {
    private  String name;
    private  String staffId;

    public HealthCare(String name, String staffId){
        this.name = name;
        this.staffId = staffId;

    }


    public abstract void performDuty();

    public void clockIn(){
        System.out.println(name + " clocked in");
    }

    public String getStaffId() {
        return staffId;
    }
}


//diff btw inheritance and association in java
