public class HourseRiding extends Hobby {

    private boolean masterOfSport;
    private short amountOfGoldMedals;

    public HourseRiding(double duration, long amountOfCompetitions, boolean masterOfSport, short amountOfGoldMedals){
        super(duration, amountOfCompetitions);
        this.masterOfSport = masterOfSport;
        this.amountOfGoldMedals = amountOfGoldMedals;
    }

    public boolean isMasterOfSport() {
        return masterOfSport;
    }

    public void setMasterOfSport(boolean masterOfSport) {
        this.masterOfSport = masterOfSport;
    }

    public short getAmountOfGoldMedals() {
        return amountOfGoldMedals;
    }

    public void setAmountOfGoldMedals(short amountOfGoldMedals) {
        this.amountOfGoldMedals = amountOfGoldMedals;
    }

    @Override
    public String tellAboutHobby() {
        return "Duration - " + getDuration() + ", amount of competitions - " + getAmountOfCompetitions() +
                ", master of sport - " + masterOfSport + ", amount of gold medals - " + amountOfGoldMedals + ".";
    }
}
