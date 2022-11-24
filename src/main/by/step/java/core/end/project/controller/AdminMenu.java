package by.step.java.core.end.project.controller;

public class AdminMenu extends Menu {

    private String[] adminMenu = {
            "1. Работа с классами",
            "2. Работа с учениками",
            "3. Работа с учителями",
            "4. Релогин",
            "5. Выход из программы"
    };

    private String[] classAdminMenu = {
            "1. Добавить класс",
            "2. Изменить класс",
            "3. Удалить класс",
            "4. Вернуться"
    };

    private String[] studentAdminMenu = {
            "1. Добавить ученика",
            "2. Изменить ученика",
            "3. Удалить ученика",
            "4. Вернуться"
    };

    private String[] teacherAdminMenu = {
            "1. Добавить учителя",
            "2. Изменить учителя",
            "3. Удалить учителя",
            "4. Вернуться"
    };

    @Override
    public String[] getMenu() {
        return adminMenu;
    }

    public String[] getClassAdminMenu() {
        return classAdminMenu;
    }

    public String[] getStudentAdminMenu() {
        return studentAdminMenu;
    }

    public String[] getTeacherAdminMenu() {
        return teacherAdminMenu;
    }
}
