package org.example;

public class Teacher {
    Library library;  // association
    Teacher(Library library) {
        this.library = library;
    }
    public void teach(){
        library.open();
        System.out.println("Teacher is teaching in the library");
    }
}
