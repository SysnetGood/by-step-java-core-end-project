package by.step.java.core.end.project.service.classes;

public class ClassModel {
    private int id;
    private String className;
    private int countOfStudents;
    private String teacherName;

    public ClassModel(int id, String className, int countOfStudents, String teacherName) {
        this.id = id;
        this.className = className;
        this.countOfStudents = countOfStudents;
        this.teacherName = teacherName;
    }

    public int getId() {
        return id;
    }

    public String getClassName() {
        return className;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public String getTeacherName() {
        return teacherName;
    }
}
