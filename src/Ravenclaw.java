public class Ravenclaw extends hogwarts {

    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativeStreak;

    public Ravenclaw(String firstName, String secondName, int spellPower, int transgressionDistance, int intelligence, int wisdom, int wit, int creativeStreak) {
        super(firstName, secondName, spellPower, transgressionDistance);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativeStreak = creativeStreak;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativeStreak() {
        return creativeStreak;
    }

    public void setCreativeStreak(int creativeStreak) {
        this.creativeStreak = creativeStreak;
    }

    public static void studentComparison(Ravenclaw firstStudent, Ravenclaw secondStudent) {
        int firstStudentStatistic = firstStudent.getCreativeStreak() + firstStudent.getIntelligence() + firstStudent.getWit() + firstStudent.getWisdom();
        int secondStudentStatistic = secondStudent.getCreativeStreak() + secondStudent.getIntelligence() + secondStudent.getWit() + secondStudent.getWisdom();

        if (firstStudentStatistic > secondStudentStatistic) {
            System.out.println("Лучший студент: " + firstStudent.getFirstName() + " " + firstStudent.getSecondName());
        } else if (firstStudentStatistic < secondStudentStatistic) {
            System.out.println("Лучший студент: " + secondStudent.getFirstName() + " " + secondStudent.getSecondName());
        } else {
            System.out.println("Студенты равны!");
        }
    }
}
