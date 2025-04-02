package add;

import input.Input;
import model.Student;
import output.Output;

public class Add {
    public static void adduser(){
        for (int i =0;i<main.Main.STUDENT_NUMBER;i++){
            Output.fullNameRequest();
            String fullName = Input.getFullName();
            Output.AgeRequest(); // Los métodos deben empezar con minúscula
            int age = Input.getAge();
            Output.birthdayRequest();
            String birthday= Input.getBirthday();
            Output.curseRequest();
            String firstCurse = Input.getCurse();
            Output.ScoreRequest();
            int firstScore = Input.getScore();
            Output.curseRequest();
            String secondCurse = Input.getCurse();
            Output.ScoreRequest();
            int secondScore = Input.getScore();

            main.Main.students.put(i+1, new Student(fullName,age,birthday,firstCurse,firstScore,secondCurse,secondScore));
        }
        Output.confirmationMessage();
    }
}
