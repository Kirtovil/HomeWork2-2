package pro.sky;

public class Slytherin extends Student {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public Slytherin(String name, String surname, int magickPower, int transgressian, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magickPower, transgressian);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
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

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public String toString() {
        return "ЛИчные качества : " +
                "хитрость - " + cunning +
                ", решительность - " + determination +
                ", амбициозность - " + ambition +
                ", находчивость - " + resourcefulness +
                ", жажда власти - " + thirstForPower +
                '.';
    }
}
