package by.step.java.core.end.project.dao;

import by.step.java.core.end.project.service.user.TypeOfUser;
import by.step.java.core.end.project.service.user.UserModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UsersFile extends FileDAO {

    @Override
    public ArrayList<UserModel> readFile() {
        ArrayList<UserModel> userModels = new ArrayList<>();
        String line;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\main\\resources\\users.txt"));
            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArray = line.split(",");

                userModels.add(new UserModel(
                        Integer.parseInt(tempArray[0]),
                        tempArray[1],
                        tempArray[2],
                        getTypeOfUserByString(tempArray[3])
                ));

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userModels;
    }

    private TypeOfUser getTypeOfUserByString(String typeOfUser) {
        TypeOfUser tempUserType;

        if (typeOfUser.equals(TypeOfUser.ADMINISTRATOR.toString().toLowerCase())) {
            tempUserType = TypeOfUser.ADMINISTRATOR;
        } else {
            tempUserType = TypeOfUser.TEACHER;
        }
        return tempUserType;
    }
}
