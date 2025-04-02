package delete;

import input.Input;
import main.Main;
import model.Student;
import output.Output;

import java.util.Map;

public class Delete {
    public static void deleteUser(){
        Main.iterate = Main.students.entrySet().iterator();

        Output.studentSelect();
        int studentId = Input.getStudentId();
        while(Main.iterate.hasNext()){
            Map.Entry<Integer, Student> in = Main.iterate.next(); // No uses la IA
            Integer id = in.getKey();
            if(studentId == id){
                Main.iterate.remove();
            }
        }
    }

}
