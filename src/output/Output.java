package output;

// No uses IA
public class Output {

    public static void showMenu(){
        System.out.print("""
                
                ***********************************************************
                ******** << Bienvenido al Gestor del Estudiante >> ********
                ***********************************************************
                
                1) Dar de alta a un estudiante
                2) Dar de baja a un estudiante
                3) Modificar nota del estudiante
                4) Mostrar relación de estudiantes
                
                """);
    }
    public static void valueRequest(){
        System.out.println("Ingrese el número de operación a realizar: ");
    }
    public static void fullNameRequest(){
        System.out.println("Ingrese el nombre completo del estudiante: ");
    }
    public static void AgeRequest(){
        System.out.println("Ingrese la edad del estudiante: ");
    }
    public static void birthdayRequest(){
        System.out.println("Ingrese la fecha de nacimiento del estudiante: ");
    }
    public static void curseRequest(){
        System.out.println("Ingrese la asignatura del estudiante: ");
    }
    public static void ScoreRequest(){
        System.out.println("Ingrese la nota de la asignatura del estudiante: ");
    }
    public static void  confirmationMessage(){
        System.out.println("La información ha sido correctamente guardada!! >,< ");
    }
    public static void  studentEmpty(){
        System.out.println("No se ha encontrado estudiantes");
    }
    public static void  studentSelect(){
        System.out.println("Por favor, seleccione al estudiante: ");
    }
    public static void deleteConfirmation(){
        System.out.println("El estudiante ha sido correctamente eliminado <(>.<)/ ");
    }
    public static void modifyConfirmation(){
        System.out.println("La nota ha sido modificado con éxito <(>.<)/ ");
    }
    public static void tableHeader(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-20s | %-20s | %-2s | %-20s | %-2s |\n","ID","Nombre completo","Primera Asignatura","(nota)","Segunda Asignatura","(nota)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------");

    }
    public static void tableBody(int id, String nombreCompleto, String Primera_Asignatura, int nota1, String Segunda_Asignatura, int nota2) {
        System.out.printf("| %-2s | %-20s | %-20s | %-2s | %-20s | %-2s |\n", id, nombreCompleto, Primera_Asignatura, nota1, Segunda_Asignatura, nota2);
    }
    public static void tableEnds() {
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
    }

}
