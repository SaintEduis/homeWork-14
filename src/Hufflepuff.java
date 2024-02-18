public class Hufflepuff extends hogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String secondName, int spellPower, int transgressionDistance, int diligence, int loyalty, int honesty) {
        super(firstName, secondName, spellPower, transgressionDistance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public static void studentComparison(Hufflepuff firstStudent, Hufflepuff secondStudent) {
        int firstStudentStatistic = firstStudent.getDiligence() + firstStudent.getHonesty() + firstStudent.getLoyalty();
        int secondStudentStatistic = secondStudent.getDiligence() + secondStudent.getHonesty() + secondStudent.getLoyalty();

        if (firstStudentStatistic > secondStudentStatistic) {
            System.out.println("Лучший студент: " + firstStudent.getFirstName() + " " + firstStudent.getSecondName());
        } else if (firstStudentStatistic < secondStudentStatistic) {
            System.out.println("Лучший студент: " + secondStudent.getFirstName() + " " + secondStudent.getSecondName());
        } else {
            System.out.println("Студенты равны!");
        }
    }
}
