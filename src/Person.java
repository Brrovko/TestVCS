public class Person {
    static int idPerson;
    int age;
    String name;

    public Person(int age, String name, double oklad, int stagRabotyLet) {
        this.age = age;
        this.name = name;
        this.oklad = oklad;
        this.stagRabotyLet = stagRabotyLet;
    }

    double oklad;
    int stagRabotyLet;

    double raschenZP(double oklad, int stagRabotyLet) {
        return oklad + oklad * stagRabotyLet / 10;
    }

    void generationSms(String name, double oklad, int stagRabotyLet) {
        System.out.println("Сотруднику " + idPerson + " " + name + " насчитано зарплаты - " + raschenZP(oklad, stagRabotyLet) + "$");
    }
}
