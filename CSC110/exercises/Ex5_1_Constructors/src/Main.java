public class Main {
    //Pro Tip : We don't need an instance of the Main class,
    //so make everything in the Main class static
    private static Car car1;
    private static Car car2;

    public static void main(String[] args) {
        run();
    }




    public static void run(){
        car1 = new Car();
        car2 = new Car("Honda", "Accord",
                "Silver", 2002,
                4, true);
        System.out.println(car1.toString());
        System.out.println();
        System.out.println(car2.toString());
    }

    //Declare a new class called Car
    //Create attributes and get/set methods for the following
        //Make (toyota, ford, Honda) -> default is "[unknown]"
        //Model (Corolla, Explorer, Civic) -> default is "[unknown]"
        //Year - 1885 min inclusive and default
        //Color - default is black
        //Number of Doors (must be at least 1 and no more than 7; default is 2)
        //Is Operational -> default is true
    //Create an empty ctor, and one containing all the information above

    //Write code in the main class to create the default car and a custom car.
    //Then, print to the console in a user-friendly way the data from each car
}
