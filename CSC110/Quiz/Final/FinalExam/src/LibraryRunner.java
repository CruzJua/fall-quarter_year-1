import java.util.Scanner;

/**
 * IF YOUR PROJECT DOESN'T RUN:
 *  1. File > Project Structure
 *  2. Under ProjectSettings > Project make sure an SDK is selected. (any SDK >= 11)
 */
public class LibraryRunner {
    //Declare an instance of your Library here
    Library library = new Library();
    /**
     * Write code to show your "game" library works
     * Make sure to test:
     * Add/Remove/Favorite/Un-Favorite/Search
     * Make sure to show the state of the library after each test:
     * displayLibraryArray(library.getAllGames());
     */
    public void run(){
//        Scanner scanLee = new Scanner(System.in);
//        //Prompt the user with some sout
//
//        //read in the user input
//        String input = scanLee.nextLine();

        displayLibraryArray(library.getGames());
    }


//    Display a current list of games in your library.
//    Each game should show:
//    Name of the game
//    Whether or not it is a favorite
//    Add a new game to the library
//    Remove an existing game from the library by name if present
//    Mark a game as a favorite
//    Remove a game as a favorite
//    You must create the appropriate classes and properly encapsulate them:
//            LibraryRunner.java (partially provided already)
//    Responsible for demonstrating your library works
//    Calls methods and passes data to the library
//    Getting data from the library to display the collection of games by calling displayLibraryArray (passing your game array)
//    Game class:
//    Constructor
//            Name
//    Is Favorite (Keep track of whether it is a favorite or not)
//    Know how to display itself in a string format
//    Library class (not the same as LibraryRunner):
//    Manages the collection of games
//    Should allow at least 25 games
//    Should use a basic array of games to store instances of your games
//    No use of ArrayList or List is allowed
//    Your array should be private in the library class
//    Your library must support the following features:
//    For the following features:
//    When searching the name field, it should be considered case insensitive (i.e. Minecraft, minecraft and MineCraft are all equal)
//    Features:
//    Adding a new game by name (should not be favorited by default)
//    Games added should be unique in your collection by name. If you try to add with the same name, it should not be added.
//    Find a game by name (several features could use this method to complete their task)
//    Remove a game by name (should do nothing if the game is not found)
//    Favorite a game by name (should do nothing if the game is not found)
//    Un-Favorite a game by name (should do nothing if the game is not found)
//    Get all games as a collection (used for LibraryRunner display)
//    Should build, run, and not crash.





    /**
     * Displays the library items in the console. Pass the array from your library
     * DO NOT CHANGE THIS METHOD
     * @param passLibraryArrayHere The list of items from your library
     */
    private void displayLibraryArray(Object[] passLibraryArrayHere){
        if(passLibraryArrayHere != null) {
            String objectText = "";
            System.out.println("Current Library:");
            for (int i = 0; i < passLibraryArrayHere.length; i++) {
                if (passLibraryArrayHere[i] == null) {
                    continue;
                }
                System.out.println("\t" + (i + 1) + ": " + passLibraryArrayHere[i].toString());
            }
        } else {
            System.out.println("There are no items in your library");
        }
    }
}
