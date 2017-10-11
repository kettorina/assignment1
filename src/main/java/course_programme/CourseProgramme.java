package course_programme;

import module.Module;
import org.joda.time.LocalDate;
import student.Student;

import java.util.ArrayList;

public class CourseProgramme {

    private String courseName;
    private ArrayList<Module> moduleList;
    private LocalDate startDate;
    private LocalDate endDate;

    public CourseProgramme(String courseName, ArrayList<Module> moduleList, LocalDate startDate, LocalDate endDate) {
        this.courseName = courseName;
        this.moduleList = moduleList;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

}
