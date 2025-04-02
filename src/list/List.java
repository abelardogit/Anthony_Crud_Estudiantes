package list;
    import main.Main;
    import model.Student;
    import output.Output;
    import java.util.Map;

public class List {

        public static void listStudent(){
            Main.iterate = Main.students.entrySet().iterator();

            if(!Main.iterate.hasNext()){ // 👏
                Output.studentEmpty();
            }

            Output.tableHeader();
            while(Main.iterate.hasNext()){
                Map.Entry<Integer, Student> in = Main.iterate.next();
                Integer id = in.getKey();
                Student student = in.getValue();
                Output.tableBody(id,student.getFullName(),student.getFirstCurse(),student.getFirstScore(),student.getSecondCurse(),student.getSecondScore());
            }
            Output.tableEnds();

        }

}
