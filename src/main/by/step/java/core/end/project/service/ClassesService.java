package by.step.java.core.end.project.service;

import by.step.java.core.end.project.dao.ClassesFile;
import by.step.java.core.end.project.dao.FileDAO;
import by.step.java.core.end.project.service.classes.ClassModel;

import java.util.ArrayList;

public class ClassesService {

    private ArrayList<ClassModel> classes;
    private FileDAO classesFile = new ClassesFile();

    public ClassesService() {
        this.classes = (ArrayList<ClassModel>) classesFile.readFile();
    }

    public boolean addNewClass(ClassModel classModel) {
        classes.add(classModel);
        ArrayList <String> convertedCollection = convertClassesToString();
         return classesFile.saveFile(convertedCollection, "classes");
    }

    private ArrayList<String> convertClassesToString() {
        ArrayList<String> strings = new ArrayList<>();
        for (ClassModel model : classes) {
            strings.add(model.getId() + "," + model.getClassName() + "," + model.getCountOfStudents() + "," + model.getTeacherName());
        }
        return strings;
    }
}
