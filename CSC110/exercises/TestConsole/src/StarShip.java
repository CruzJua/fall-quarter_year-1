public class StarShip {
    private String squadron;
    private String callSignColor;
    private int callSignNumber;
    private int numOfMissles;
    private float maxDriveSpeed = 0.5f;

    public StarShip(){}
    public StarShip(float maxDriveSpeed){
        this.maxDriveSpeed = maxDriveSpeed;
    }
    public StarShip(String squadron, float maxDriveSpeed){
        setSquadron(squadron);
        this.maxDriveSpeed = maxDriveSpeed;
    }

    public String getSquadron() {
        return squadron;
    }

    public void setSquadron(String squadron) {
        this.squadron = squadron;
    }

    public String getCallSignColor() {
        return callSignColor;
    }

    public void setCallSignColor(String callSignColor) {
        this.callSignColor = callSignColor;
    }

    public int getCallSignNumber() {
        return callSignNumber;
    }

    public void setCallSignNumber(int callSignNumber) {
        this.callSignNumber = callSignNumber;
    }

    public float getMaxDriveSpeed() {
        return maxDriveSpeed;
    }

    public int getNumOfMissles() {
        return numOfMissles;
    }

    public void fireMissle(){}

    public void reloadMissles(){}

    @Override
    public String toString(){
        return "";
    }
}
