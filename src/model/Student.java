package model;

public class Student {
    private String fullName;
    private String firstCurse;
    private int age;
    private String birthday;
    protected int firstScore;
    private String secondCurse;
    protected int secondScore;

    public Student(String fullName, int age, String birthday, String firstCurse, int firstScore, String secondCurse, int secondScore) {
        this.fullName = fullName;
        this.age = age;
        this.birthday = birthday;
        this.firstCurse = firstCurse;
        this.firstScore = firstScore;
        this.secondCurse = secondCurse;
        this.secondScore = secondScore;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstCurse() {
        return firstCurse;
    }

    public int getFirstScore() {
        return firstScore;
    }

    public String getSecondCurse() {
        return secondCurse;
    }

    public int getSecondScore() {
        return secondScore;
    }

    public void setFirstScore(int firstScore) {
        this.firstScore = firstScore;
    }

    // Si no lo usas, no lo pongas :)
    public void setSecondScore(int secondScore) {
        this.secondScore = secondScore;
    }

}
