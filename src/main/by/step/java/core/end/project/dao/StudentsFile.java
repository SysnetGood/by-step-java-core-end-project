package by.step.java.core.end.project.dao;

import by.step.java.core.end.project.service.student.StudentModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentsFile extends FileDAO {

    @Override
    public List readFile() {
        List<StudentModel> students = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\students.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                students.add(new StudentModel(
                        Integer.parseInt(tempArray[0]),
                        tempArray[1],
                        Integer.parseInt(tempArray[2]),
                        tempArray[3],
                        tempArray[4]
                        )
                );

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return students;
    }
}
