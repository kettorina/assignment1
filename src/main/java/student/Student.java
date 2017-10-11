package student;

import java.util.Date;

public class Student {

    private String name;
    private int age;
    private Date dob;
    private String username;
    private String id;

    public Student(String name, int age, Date dob){
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public String getUsername() {
        return name+age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return dob;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
