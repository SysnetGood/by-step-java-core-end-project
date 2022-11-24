package by.step.java.core.end.project.service.student;

public class StudentModel {
    private int id;
    private String fio;
    private int age;
    private String className;
    private String teacherName;

    public StudentModel(int id, String fio, int age, String className, String teacherName) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.className = className;
        this.teacherName = teacherName;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
