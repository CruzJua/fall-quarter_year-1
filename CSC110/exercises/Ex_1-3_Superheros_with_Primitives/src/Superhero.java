public class Superhero {

     /*
    rules for class-level variables (aka attributes)
    1] All attributes should be private
    2] Create a setter and getter for all attributes
    3] ALWAYS use the get/set methods to interact with an attribute,
    4]

     */




    //Class attribute
    private static String superheroName;
    private static int power;
    private static float winRate;

    //Getter
    public static String getName(){
        return superheroName;
    }
    public static int getPower(){
        return power;
    }

    public static float getWinRate(){
        return winRate;
    }

    //Setter
    private static void setName(String name){
        superheroName = name;
    }

    //The variable in the parens (int level) is called a parameter
    private static void setPower(int level){
        power = level;
    }

    private static void setWinRate(float winner){
        winRate = winner;
    }

    public static void run(){

        //local variable
        int x;

        //Set the hero's name
        setName("Goku");

        //Set the hero's power level
        //NOTE: the 10 here is called an argument
        setPower(10);

        //Set the win rate against thanos
        setWinRate(0.95f);


        //Print the header
        System.out.println("My Superhero Info");
        //Print out the variables
            //Print the hero's name
        System.out.println("My superhero's name is: " + getName());
            //Print the power level of the hero
        System.out.println("My superhero's power level (1-10) is: " + getPower());
            //Print the likelihood of winning
        System.out.println("My superhero's likelihood of beating thanos (0.01-0.99) is: " + getWinRate());
    }
}
