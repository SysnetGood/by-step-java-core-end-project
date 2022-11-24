package by.step.java.core.end.project.controller;

public class UserMenu extends Menu{

    private String[] userMenu = {
            "1. Просмотр учеников",
            "2. Просмотр классного руководства",
            "3. Профиль учителя",
            "4. Выход"
    };

    @Override
    public String[] getMenu() {
        return userMenu;
    }
}
