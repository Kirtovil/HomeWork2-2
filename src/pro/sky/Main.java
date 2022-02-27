package pro.sky;

public class Main {

    public static void printStudent(Student student) {
        System.out.println(student.toString());
    }

    public static void betterHonor (Gryffendor gryffendorA, Gryffendor gryffendorB) {
        if (gryffendorA.getHonor() < gryffendorB.getHonor()) {
            System.out.println("Честь " + gryffendorB.getName() + ", больше чем у " + gryffendorA.getName());
        } else if (gryffendorA.getHonor() > gryffendorB.getHonor()) {
            System.out.println("Честь " + gryffendorA.getName() + ", больше чем у " + gryffendorB.getName());
        } else if (gryffendorA.getHonor() == gryffendorB.getHonor()) {
            System.out.println("Честь обоих студентов ровна");
        }
    }

    public static void betterHardworking(Hufflepuff hufflepuffA, Hufflepuff hufflepuffB) {
        if (hufflepuffA.getHardworking() < hufflepuffB.getHardworking()) {
            System.out.println("Трудолбие " + hufflepuffB.getName() + ", больше чем у " + hufflepuffA.getName());
        } else if (hufflepuffA.getHardworking() > hufflepuffB.getHardworking()) {
            System.out.println("Трудолбие " + hufflepuffA.getName() + ", больше чем у " + hufflepuffB.getName());
        } else if (hufflepuffA.getHardworking() == hufflepuffB.getHardworking()) {
            System.out.println("Они одинаково трудолюбивы");
        }
    }

    public static void betterAmbition(Slytherin slytherinA, Slytherin slytherinB) {
        if (slytherinA.getAmbition() < slytherinB.getAmbition()) {
            System.out.println("Амбиции " + slytherinB.getName() + ", больше чем у " + slytherinA.getName());
        } else if (slytherinA.getAmbition() > slytherinB.getAmbition()) {
            System.out.println("Амбиции " + slytherinA.getName() + ", больше чем у " + slytherinB.getName());
        } else if (slytherinA.getAmbition() == slytherinB.getAmbition()) {
            System.out.println("у обоих студентов равные амбиции");
        }
    }

    public static void betterSmart(Ravencow ravencowA, Ravencow ravencowB) {
        if (ravencowA.getSmart() < ravencowB.getSmart()) {
            System.out.println(ravencowB.getName() + " умнее " + ravencowA.getName());
        } else if (ravencowA.getSmart() > ravencowB.getSmart()) {
            System.out.println(ravencowA.getName() + " умнее " + ravencowB.getName());
        } else if (ravencowA.getSmart() == ravencowB.getSmart()) {
            System.out.println("Умственные способности обоих студентов равны");
        }
    }

    public static void moreMaicPower(Student a, Student b) {
        if (a.getMagickPower() > b.getMagickPower()) {
            System.out.println(a.getName() + " обладает более сильной магией, чем " + b.getName());
        } else if (a.getMagickPower() < b.getMagickPower()) {
            System.out.println(b.getName() + " обладает более сильной магией, чем " + a.getName());
        } else if (a.getMagickPower() == b.getMagickPower()) {
            System.out.println("МАгия обоих учеников на равном уровне");
        }
    }


    public static void main(String[] args) {
        Gryffendor potter = new Gryffendor("Гарри", "Поттер", 20, 64, 84, 11, 56);
        Gryffendor greynger = new Gryffendor("Гермиона", "Грейнджер", 79, 45, 26, 80, 62);
        Gryffendor wisley = new Gryffendor("Рон", "Уизли", 58, 47, 7, 62, 30);

        Hufflepuff smith = new Hufflepuff("Захария", "Смит", 92, 56, 41, 20, 9);
        Hufflepuff digori = new Hufflepuff("Седрик", "Дтгори", 83, 6, 18, 92, 39);
        Hufflepuff finch = new Hufflepuff("Джастин", "Финч-Флетчли", 59, 48, 32, 26, 51);

        Slytherin malfoy = new Slytherin("Драко", "Малфой", 81, 28, 33, 49, 15, 20, 34);
        Slytherin goyl = new Slytherin("Грегори", "Гойл", 8, 27, 3, 15, 99, 5, 3);
        Slytherin montegu = new Slytherin("Грэхэм", "Монтегю", 15, 89, 27, 64, 52, 74, 55);

        Ravencow chang = new Ravencow("Чжоу", "Чанг", 18, 46, 32, 10, 92, 14);
        Ravencow patil = new Ravencow("Падма", "Патил", 32, 56, 50, 40, 12, 1);
        Ravencow belby = new Ravencow("Маркус", "Белби", 1, 10, 22, 47, 85, 99);

        printStudent(potter);

        betterHonor(potter, wisley);

        betterAmbition(malfoy, goyl);

        betterHardworking(smith, finch);

        betterSmart(belby, chang);

        moreMaicPower(greynger, patil);
    }



}
