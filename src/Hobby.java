public abstract class Hobby {

    private double duration;
    private long amountOfCompetitions;

    public Hobby() {
    }

    public Hobby(double duration, long amountOfCompetitions) {
        this.amountOfCompetitions = amountOfCompetitions;
        this.duration = duration;
    }

    public Hobby(double duration){
        this.duration = duration;
    }


    public double getDuration() {
        return duration;
    }


    public void setDuration(double duration) {
        this.duration = duration;
    }

    public long getAmountOfCompetitions() {
        return amountOfCompetitions;
    }

    public void setAmountOfCompetitions(long amountOfCompetitions) {

        this.amountOfCompetitions = amountOfCompetitions;
    }

    public abstract String tellAboutHobby();
}