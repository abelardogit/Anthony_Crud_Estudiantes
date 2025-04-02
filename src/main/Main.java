package main;

import add.Add;
import delete.Delete;
import input.Input;
import model.Student;
import modify.Modify;
import output.Output;
import validator.Validator;
import list.List;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int optionMenu;
    final static int USER_ADD = 1;
    final static int USER_DELETE = 2;
    final static int MODIFY_SCORE = 3;
    final static int USER_LIST = 4 ;
    final static int EXIT = 5;
    public final static int STUDENT_NUMBER = 2;
    // El main no tiene la responsabilidad de gestionar esta lista
    public static HashMap<Integer, Student> students;
    public static Iterator<Map.Entry<Integer, Student>> iterate; // ❌
    public static void main(String[] args) {

        students = new HashMap<>();
        boolean userWantToExit= false;

        do {

        boolean correctOption = false;

        // ¿Quizá en un método?
        do {
        showMenu();
        optionMenu=selectValue();
        correctOption = validateOpcion();
        }while(!correctOption);
// aprovecha para mejorar tus habilidades para escribir código semántico.
        if (optionMenu==EXIT){
        userWantToExit=true;
        }else {
            switch (optionMenu) {
                case USER_ADD:
                    addUser();
                    listUser();
                    break;
                case USER_DELETE:
                    listUser();
                    Userdown();
                    break;
                case MODIFY_SCORE:
                    listUser();
                    modifyUser();
                    break;
                case USER_LIST:
                    listUser();
                    break;
            }
        }

        }while(!userWantToExit);

    }

    private static void modifyUser() {
        Modify.modifyScore();
        Output.modifyConfirmation();
    }

    private static void Userdown() {
        Delete.deleteUser();
        Output.deleteConfirmation();
    }

    private static void listUser() {
        List.listStudent();
    }

    private static void addUser() {
        Add.adduser();
    }

    public static void showMenu(){
        Output.showMenu();
    }
    public static int selectValue(){
        Output.valueRequest();
        return Input.scanValue();
    }
    public static boolean validateOpcion(){
    return Validator.validateOpcion(optionMenu);
    }
}