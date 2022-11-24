package by.step.java.core.end.project.dao;

import by.step.java.core.end.project.service.classes.ClassModel;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClassesFile extends FileDAO {

    @Override
    public List readFile() {
        List<ClassModel> classes = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\classes.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                classes.add(new ClassModel(
                        Integer.parseInt(tempArray[0]),
                        tempArray[1],
                        Integer.parseInt(tempArray[2]),
                        tempArray[3]
                ));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return classes;
    }
}
