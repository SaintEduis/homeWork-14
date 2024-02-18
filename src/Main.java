import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Gryffindor[] studentsOfGryffindor = {
                new Gryffindor("Гарри", "Поттер", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Гермиона", "Гермиона", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Gryffindor("Рон", "Уизли", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100))
        };

        Ravenclaw[] studentsOfRavenclaw = {
                new Ravenclaw("Чжоу", "Чанг", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Ravenclaw("Падма", "Патил", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Ravenclaw("Маркус", "Белби", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };

        Hufflepuff[] studentsOfHufflepuff = {
                new Hufflepuff("Захария", "Смит", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Hufflepuff("Седрик", "Диггори", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Hufflepuff("Джастин", "Финч-Флетчли", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };

        Slytherin[] studentsOfSlytherin = {
                new Slytherin("Драко", "Малфой", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Грэхэм", "Монтегю", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
                new Slytherin("Грегори", "Гойл", random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100), random.nextInt(100)),
        };
    }
}