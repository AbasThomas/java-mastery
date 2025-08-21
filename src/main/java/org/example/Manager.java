package org.example;

public class Manager {
    public class Manager extends Employee{

        private String[] teamNames;

        public Manager (String id, String firstName, String lastName, int age, String[] teamNames){
            super(id, firstName, lastName, age);
            this.teamNames = teamNames;
        }

        public StringBuilder addEmployees(String[] names){
            StringBuilder sb = new StringBuilder();
            for(String name : names){
                sb.append(name);
            }
            return sb;
        }

        public String managerDetail(){
            return super.personInfo()+ "\nTeamNames: " + teamNames;
}
    }
}
