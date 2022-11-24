package by.step.java.core.end.project.controller;

import by.step.java.core.end.project.service.ClassesService;
import by.step.java.core.end.project.service.classes.ClassModel;

import java.util.Scanner;

public class MenuController {

    private Scanner sc = new Scanner(System.in);
    private Menu menu;
    private LoginController loginController;

    public MenuController(Menu menu, LoginController loginController) {
        this.menu = menu;
        this.loginController = loginController;
    }

    private void showMenu(Menu menu) {
        for (String s : menu.getMenu()) {
            System.out.println(s);
        }
    }

    private void showSubMenu(String[] submenu) {
        for (String s : submenu) {
            System.out.println(s);
        }
    }

    public void workWithMenu() {
        if (menu instanceof AdminMenu) {
            workWithAdminMenu();
        } else {
            workWithUserMenu();
        }
    }

    private void workWithAdminMenu() {
        showMenu(menu);
        switch (sc.nextInt()) {
            case 1: {
                workWithclassAdminMenu();
                break;
            }
            case 2: {
                workWithstudentAdminMenu();
                break;
            }
            case 3: {
                workWithteacherAdminMenu();
                break;
            }
            case 4: {
                loginController.login();
            }
            case 5: {
                return;
            }
            default: {
                showErrorMenuMessage();
                workWithAdminMenu();
            }
        }
    }

    private void showErrorMenuMessage() {
        System.out.println("Wrong menu point");
    }

    private ClassesService classesService = new ClassesService();

    private void workWithclassAdminMenu() {
        showSubMenu(((AdminMenu) menu).getClassAdminMenu());
        switch (sc.nextInt()) {
            case 1: {
                ClassModel classModel = createNewClass();
                classesService.addNewClass(classModel);
                workWithclassAdminMenu();
                break;
            }
            case 2: {

            }
            case 3: {

            }
            case 4: {
                workWithAdminMenu();
            }
            default: {

            }

        }
    }

    private ClassModel createNewClass() {
        int id;
        String name;
        int count;
        String teacher;

        System.out.print("Введите айди класса: ");
        id = sc.nextInt();
        System.out.print("Введите имя класса: ");
        name = sc.next();
        System.out.print("Введите колличество учеников класса: ");
        count = sc.nextInt();
        System.out.print("Введите классного руководителя класса: ");
        teacher = sc.next();
        return new ClassModel(id, name, count, teacher);
    }

    private void workWithstudentAdminMenu() {
        showSubMenu(((AdminMenu) menu).getStudentAdminMenu());
        switch (sc.nextInt()) {
            case 1: {

            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
            default: {

            }

        }
    }

    private void workWithteacherAdminMenu() {
        showSubMenu(((AdminMenu) menu).getTeacherAdminMenu());
        switch (sc.nextInt()) {
            case 1: {

            }
            case 2: {

            }
            case 3: {

            }
            case 4: {

            }
            default: {

            }

        }
    }

    private void workWithUserMenu() {

    }
}
