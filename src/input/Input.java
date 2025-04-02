package input;

import java.util.Scanner;

public class Input {
    final static    Scanner value = new Scanner(System.in); // ¿value?
//    final static    Scanner keyboard;

    /*
        static {
         keyboard = new Scanner(System.in);
        }

     */

    public static int scanValue(){
        return value.nextInt();
    } // ❌
    public static String getFullName(){
        return value.next();

    }
    public static int getAge(){
        return value.nextInt();

    }
    public static String getBirthday(){
        return value.next();
    }
    public static String getCurse(){
        return value.next();
    }
    public static int getScore(){
        return value.nextInt();
    }
    public static int getStudentId(){
        return value.nextInt();
    }
}
