public class Gryffindor extends hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String secondName, int spellPower, int transgressionDistance, int nobility, int honor, int bravery) {
        super(firstName, secondName, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public static void studentComparison(Gryffindor firstStudent, Gryffindor secondStudent) {
        int firstStudentStatistic = firstStudent.getBravery() + firstStudent.getHonor() + firstStudent.getNobility();
        int secondStudentStatistic = secondStudent.getBravery() + secondStudent.getHonor() + secondStudent.getNobility();

        if (firstStudentStatistic > secondStudentStatistic) {
            System.out.println("Лучший студент: " + firstStudent.getFirstName() + " " + firstStudent.getSecondName());
        } else if (firstStudentStatistic < secondStudentStatistic) {
            System.out.println("Лучший студент: " + secondStudent.getFirstName() + " " + secondStudent.getSecondName());
        } else {
            System.out.println("Студенты равны!");
        }
    }
}
