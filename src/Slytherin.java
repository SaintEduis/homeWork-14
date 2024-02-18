public class Slytherin extends hogwarts {

    private int cunning;
    private int decisiveness;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String firstName, String secondName, int spellPower, int transgressionDistance, int cunning, int decisiveness, int ambition, int resourcefulness, int thirstForPower) {
        super(firstName, secondName, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.decisiveness = decisiveness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDecisiveness() {
        return decisiveness;
    }

    public void setDecisiveness(int decisiveness) {
        this.decisiveness = decisiveness;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    public static void studentComparison(Slytherin firstStudent, Slytherin secondStudent) {
        int firstStudentStatistic = firstStudent.getAmbition() + firstStudent.getCunning() + firstStudent.getDecisiveness() + firstStudent.getThirstForPower() + firstStudent.getResourcefulness();
        int secondStudentStatistic = secondStudent.getAmbition() + secondStudent.getCunning() + secondStudent.getDecisiveness() + secondStudent.getThirstForPower() + secondStudent.getResourcefulness();

        if (firstStudentStatistic > secondStudentStatistic) {
            System.out.println("Лучший студент: " + firstStudent.getFirstName() + " " + firstStudent.getSecondName());
        } else if (firstStudentStatistic < secondStudentStatistic) {
            System.out.println("Лучший студент: " + secondStudent.getFirstName() + " " + secondStudent.getSecondName());
        } else {
            System.out.println("Студенты равны!");
        }
    }
}
