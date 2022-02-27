package pro.sky;

public class Gryffendor extends Student {
    private int nobility;

    private int honor;
    private int bravery;

    public Gryffendor(String name, String surname, int magickPower, int transgressian, int nobility, int honor, int bravery) {
        super(name, surname, magickPower, transgressian);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return  "Студент - " +
                name + " "  +
                surname +
                "; сила магии - " + magickPower +
                ", дальность трансгрессии - " + transgressian +
                "; Личные качества : " +
                "благородство - " + nobility +
                ", честь - " + honor +
                ", храбрость - " + bravery +
                '.';
    }
}


