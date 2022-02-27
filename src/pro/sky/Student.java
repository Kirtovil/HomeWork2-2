package pro.sky;

public class Student {
    protected String name;
    protected String surname;
    protected int magickPower;
    protected int transgressian;

    public Student(String name, String surname, int magickPower, int transgressian) {
        this.name = name;
        this.surname = surname;
        this.magickPower = magickPower;
        this.transgressian = transgressian;


    }

    public int getMagickPower() {
        return magickPower;
    }

    public void setMagickPower(int magickPower) {
        this.magickPower = magickPower;
    }

    public int getTransgressian() {
        return transgressian;
    }

    public void setTransgressian(int transgressian) {
        this.transgressian = transgressian;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

