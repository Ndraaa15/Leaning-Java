package src.OOP_C.GradeStudent;

public class Student {
    private static int count;
    private String name;
    private String address;
    private int age;
    private double mathGrade;

    private double englishGrade;

    private double scienceGrade;
    private double average;
    public Student(double mathGrade, double englishGrade, double scienceGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        this.scienceGrade = scienceGrade;
        count++;
    }

    public Student(double mathGrade, double englishGrade) {
        this.mathGrade = mathGrade;
        this.englishGrade = englishGrade;
        count++;
    }

    public Student(double mathGrade) {
        this.mathGrade = mathGrade;
        count++;
    }

    public Student() {
        name = "";
        address = "";
        age = 0;
        count++;
    }

    public Student(String n, String a, int ag) {
        name = n;
        address = a;
        age = ag;
        count++;
    }

    public void setName(String n) {
        name = n;
    }

    public void setAddress(String a) {
        address = a;
    }

    public void setAge(int ag) {
        age = ag;
    }

    public void setMath(double math) {
        mathGrade = math;
    }

    public void setEnglish(double english) {
        englishGrade = english;
    }

    public void setScience(double science) {
        scienceGrade = science;
    }

    private double getAverage() {
        double result = 0;
        result = (mathGrade + scienceGrade + englishGrade) / 3;
        return result;
    }

    boolean statusAkhir (double average){
        boolean isLolos = true;
        if (average >= 61){
             return isLolos;
        }else {
            isLolos = false;
        }
        return isLolos;
    }

    void jumlahObjek(){
        System.out.println(count);
    }
    public void displayMessage() {
        System.out.println("Siswa dengan nama " + name);
        System.out.println("beramalat di " + address);
        System.out.println("berumur " + age);
        System.out.println("mempunyai nilai rata rata " + getAverage());
        System.out.println("dengan keterangan " + (statusAkhir(getAverage()) ? "Lolos" : "Remidi"));
    }
}
