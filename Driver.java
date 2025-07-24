public class Driver {
    private String name;
    private String team;
    private String carCode;
    private String grandPrix;
    private int posFinished;
    private float fastestLap;

    public Driver(String name, String team, String carCode,String grandPrix, int posFinished, float fastestLap) {
        this.name = name;
        this.team = team;
        this.carCode = carCode;
        this.grandPrix = grandPrix;
        this.posFinished = posFinished;
        this.fastestLap = fastestLap;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTeam(String team) {
        this.team = team;
    }

    public void setCarCode(String carCode) {
        this.carCode = carCode;
    }

    public void setGrandPrix(String grandPrix) {
        this.grandPrix = grandPrix;
    }
    public void setPosFinished(int posFinished) {
        this.posFinished = posFinished;
    }
    public void setFastestLap(float fastestLap) {
        this.fastestLap = fastestLap;
    }
    public String getName() {
        return name;
    }
    public String getTeam() {
        return team;
    }
    public String getGrandPrix() {
        return grandPrix;
    }
    public int getPosFinished() {
        return posFinished;
    }
    public float getFastestLap() {
        return fastestLap;
    }
    
    @Override
    public String toString() {
        return name + "\t" + team + "\t"+carCode +"\t" + grandPrix + "\t" + posFinished + "\t" + fastestLap;
    }
    public String csvFormat() {
        return name + "," + team + ","+carCode +"," + grandPrix + "," + posFinished + "," + fastestLap;
    }
}
