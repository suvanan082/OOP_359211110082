package ooplab8;

import java.util.Date;

public class Student {
    private String id;
    private String program;

    public Student(String name, String gender, Date dateOfBirth, int age, String id, String program) {
        super(name, gender, dateOfBirth, age);
        this.id = id;
        this.program = program;
        //toString()
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
//getter and setter method
public String getId() {
    return id;
}

    public void setId(String id) {
        this.id = id;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}