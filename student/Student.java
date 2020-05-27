package student;

public class Student {

    private String name;
    private String Institute;
    private int age;
    private int[] points;
    private boolean steep;
    private double middlepoints;
    
    public Student(String name, String Institute, int age, int[] points, boolean steep){
        this.name = name;
        this.Institute = Institute;
        this.points = points;
        this.age = age;
        this.steep = steep;
        SetMdPoints();
        
    }

public void Set(){
        return;
}

    public void SetName(String S) {
        name = S;
    }

    public String GetName() {
        return name;
    }

    public void SetAge(int number) {
        age = number;
    }

    public int GetAge() {
        return age;
    }

    public void SetInst(String S) {
        Institute = S;
    }

    public String GetInst() {
        return Institute;
    }

    public void SetPoints(int[] massivepoints) {
        points = massivepoints;
    }

    public int[] GetPoints() {
        return points;
    }

    public void SetSteep(boolean c) {
        steep = c;
    }

    public boolean GetSteep() {
        return steep;
    }
    
    public void SetMdPoints(){
        double sum = 0;
        for (int i = 0; i < this.points.length; i++) {
            sum = sum + this.points[i];
        }
        this.middlepoints = sum / this.points.length;
    }

    public double GetMdPoints() {
        return middlepoints;
    }

    public void Result() {
        System.out.printf("ФИО Студента --> %s", this.GetName());
        System.out.println();
        System.out.printf("Институт --> %s", this.GetInst());
        System.out.println();
        System.out.printf("Возраст --> %s", this.GetAge());
        System.out.println();
        System.out.printf("Баллы(средний бал) --> %s", this.GetMdPoints());
        System.out.println();
        System.out.printf("Наличие стипендии --> %s", this.GetSteep());
        System.out.println();
        System.out.println("------------------------------------");
    }

}
