public class Student extends Person{

    public Student(int age, String name, double oklad, int stagRabotyLet) {
        super(age, name, oklad, stagRabotyLet);
    }

    public void study(){
        System.out.println("I am studying");
    }
}
