package module;

import student.Student;

import java.util.ArrayList;

public class Module {

    private String module;
    private String id;
    private ArrayList<Student> studentList;

    public Module(String module, String id, ArrayList<Student> studentList) {
        this.module = module;
        this.id = id;
        this.studentList = studentList;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

}
