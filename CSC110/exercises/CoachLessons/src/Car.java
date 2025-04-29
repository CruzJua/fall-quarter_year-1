public class Car {
    //Make (toyota, ford, Honda) -> default is "[unknown]"
    private String make = "[Unknown]";

    //Model (Corolla, Explorer, Civic) -> default is "[unknown]"
    private String model = "[Unknown]";

    //Year - 1885 min inclusive and default
    private int year = 1885;

    //Color - default is black
    private Color color = Color.BLACK;

    //Number of Doors (must be at least 1 and no more than 7; default is 2)
    private int numOfDoors = 2;

    //Is Operational -> default is true
    private boolean isOperational = true;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    public Car (){

    }
    public Car(String make,String model,Color color, int year, int numOfDoors, boolean isOperational ){
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setNumOfDoors(numOfDoors);
        setOperational(isOperational);

    }

    public String prettyCarInfoString(){
        String carInfo = "";
        String carFunctionality;

        if(isOperational) {
            carFunctionality = " and it runs";
        } else {
            carFunctionality = " and it does not runs";
        }

        carInfo = "My car is a " + getColor() + " "
                + getYear() + " " + getMake()
                + " " + getModel() + " with "
                + getNumOfDoors() + " doors"
                + carFunctionality;


        return carInfo;
    }
    @Override
    public String toString(){
        return prettyCarInfoString();
    }
}
