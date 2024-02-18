public class hogwarts {
    private String firstName;
    private String secondName;

    private int spellPower;
    private int transgressionDistance;

    public hogwarts(String firstName, String secondName, int spellPower, int transgressionDistance) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public void setSpellPower(int spellPower) {
        this.spellPower = spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void studentComparison(hogwarts firstStudent, hogwarts secondStudent) {
        int firstStudentStatistic = firstStudent.getSpellPower() + firstStudent.getTransgressionDistance();
        int secondStudentStatistic = secondStudent.getSpellPower() + secondStudent.getTransgressionDistance();

        if (firstStudentStatistic > secondStudentStatistic) {
            System.out.println("Лучший студент: " + firstStudent.getFirstName() + " " + firstStudent.getSecondName());
        } else if (firstStudentStatistic < secondStudentStatistic) {
            System.out.println("Лучший студент: " + secondStudent.getFirstName() + " " + secondStudent.getSecondName());
        } else {
            System.out.println("Студенты равны!");
        }
    }
}