package modify;

import input.Input;
import main.Main;
import model.Student;
import output.Output;

import java.util.Map;

public class Modify {
    public static void modifyScore() {
        Main.iterate = Main.students.entrySet().iterator();

//        if(!Main.iterate.hasNext()){ // 👏
//            Output.studentEmpty();
//        }

        Output.studentSelect();
        int studentId = Input.getStudentId();
        while(Main.iterate.hasNext()){
            Map.Entry<Integer, Student> in = Main.iterate.next();
            Integer id = in.getKey();
            if(studentId == id){
                Output.ScoreRequest();
                int newScore = Input.getScore();   // ❌
                Student students = in.getValue();
                students.setFirstScore(newScore);
            }
        }
    }

}
