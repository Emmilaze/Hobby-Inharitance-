public class Volleball extends Hobby {
    private char numberInTeam = '1';
    private float winRate;

    public Volleball(double duration, long amountOfCompetitions, char numberInTeam, float winRate) {
        super(duration, amountOfCompetitions);
        this.numberInTeam = numberInTeam;
        this.winRate = winRate;
    }

    public char getNumberInTeam() {
        return numberInTeam;
    }

    public void setNumberInTeam(char numberInTeam) {
        this.numberInTeam = numberInTeam;
    }

    public float getWinRate() {
        return winRate;
    }

    public void setWinRate(float winRate) {
        this.winRate = winRate;
    }

    @Override
    public String tellAboutHobby() {
        return "Duration - " + getDuration() + ", amount of competitions - " + getAmountOfCompetitions() +
                ", number in team - " + numberInTeam + ", winrate - " + winRate + ".";
    }
}
