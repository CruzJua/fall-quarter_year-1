//In java there are two primary name conventions
//camelCase - first word in the name is lower case, subsequent works in the name start with a capital
//PascalCasing - every word in the name starts with a capital

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run(){
        String myWords = "null";
        int numOfChars = myWords.length();
        System.out.println("Num of chars: " + numOfChars);
    }

    public static void run2(){
        //Create a new instance of the game class
        Game heavenlySword = new Game();

        //Set the title to heavenly Sword
        heavenlySword.title = "Heavenly Sword";

        //Set the release year to 2006
        heavenlySword.releaseYear = 2006;

        //Set the platform  to "PS3"
        heavenlySword.platform = "PS3";

        //Print out the games data
        System.out.println("Title: " + heavenlySword.title);
        System.out.println("Release Year: " + heavenlySword.releaseYear);
        System.out.println("Platform: " + heavenlySword.platform);
    }

    //For
        //Use when you now how many iterations will happen
    //While
        //Use when you don't know how many iterations need to happen and when it can't not iterate at all
    //Do-While
        //Use when it must run at least once but don't know how many iterations may be needed

    //Create a new class named Game
    //A game has a title, releaseYear, platform
    //To start do not make the attribute public and do not create Getters or Setters
}