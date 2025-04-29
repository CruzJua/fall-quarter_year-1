import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //declaring a variable
    //syntax - the rules of the language, and it is non-negotiable
    //convention - unwritten "rules" (aka expectations of other developers)
    public static void main(String[] args) {
        //Making new instance of the Class Movie
        //Only possible because the variable in the movie calls is not static
        //Because static means BELONGING TO THE CALLS AND NOT THE INSTANCE
//        Movie mov1 = new Movie();
//        mov1.setTitles("the Prestige");
//        mov1.setRunTimeInMinutes(140);
//        mov1.setRatingScore(7.8f);
//
//        Movie mov2 = new Movie();
//        mov2.setTitles("Roderick");
//
//        Movie mov3 = new Movie();
//        mov3.setTitles("Blade");
//
//        Movie mov4 = new Movie();
//        mov4.setTitles("Krull");
//
//
//        System.out.println("Title: " + mov1.getTitle());
//        System.out.println("Title: " + mov2.getTitle());
//        System.out.println("Title: " + mov3.getTitle());
//        System.out.println("Title: " + mov4.getTitle());
//
//        //Variable that can hold a single value
//        int num = 10;
//
//        //Variable that can hold many valise of the same type
//            //How to declare an array - DataType[] variableName
//        int[] nums;
//            //Initialize an array - variableName = new DataType
//                //Once initialized arrays are immutable (unchangeable) in length
//        nums = new int[5];
//
//
//        //Declare array that can hod 10 strings
//        String[] names = new String[10];
//
//        //Every array identifies it's "buckets" by a numeric index value
//        //Ask an array how many buckets it has - name.length;
//        int arrayLength = nums.length;
//        //The first bucket is index 0
//
//
//        //Set an array buckets value -> name[index] = value
//        nums[0] = 2096;
//
//
//        //print to the console the value held in index 0 in the nums array
//        System.out.println(nums[0]);
        demo();

    }

    private  static void demo(){
        //Declare an array of 5 into that have a non-zero value
//        int[] nums = {1,2,3,4,5};
//        Integer[] nums = {null};
//        //Use a standard for loop to print the values in to the console, all on the same line
//        //separate by a single line character.
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
//        System.out.println(getRandomInt(10, 1) + "");
//        Movie mov1 = new Movie("The Prestige", 128, 9.1f);
//        System.out.println(mov1);
        String words = "Hello, World!";
        int currentIndex = 0;
        //Change this loop so you only display the char when it's a vowels, include the index at which it was found

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            switch (Character.toLowerCase(c)) {
                case 'a', 'e', 'i', 'o', 'u':
                    System.out.println(c + ": index " + i);
            }
        }
    }

    public static int getRandomInt(int min, int max){
        if (min < max){
            throw new IllegalArgumentException(String.format("The min (%d) cannot be greater than the max (%d).", min, max ));
        }
        return new Random().nextInt(min, max+1);

    }

    private static void demoTernaryLogic() {
//        Scanner scanLee = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = scanLee.nextLine();
//        //If the name is blank, set greeting to "Who's there?" else set greeting to "Hello there, name"
////            String greeting;
////            if (name.isBlank()){
////                greeting = "Who's there?";
////            }else {
////                greeting =  "Hello there, " + name;
////            }
//
//        //Same as above but using a ternary
//        String greeting = name.isBlank() ? "Who's there?" : "Hello there, " + name;
//
//        System.out.println(greeting);
    }

    private static void demoMethodOverLoads(){
//        Calculator calc = new Calculator();
//        int x = 10;
//        int y = 14;
//        int z = 2072;
//        int[] ints = {1,2,3,4,5,6,7};
//
//        int sum1 = calc.addNums(x, y);
//        int sum2 = calc.addNums(x, y, z);
//        int sum3 = calc.addNums(ints);
//
//        System.out.println("Sum 1: " + sum1);
//        System.out.println("Sum 2: " + sum2);
//        System.out.println("Sum 3: " + sum3);
    }


    private static void practiceArrays(){
        //Declare an array of movies
        Movie[] movies;
        //Use an instance of Random to pick a number between 3 and 6 inclusive
        int ranNum = new Random().nextInt(3, 7);
        //Initialize the array, using the random number as the length
        movies = new Movie[ranNum];
        //Use a for loop to populate the array
        for(int i = 0; i < ranNum; i++){
            movies[i] = new Movie("Movie" + (i + 1));
        }
        //(just make the tiles of the movie something like movie1 then movie2)
        //After it's fully populated, print each movie to the console
        for(int i = 0; i < ranNum; i++){
            System.out.println(movies[i].getTitle());
        }

        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i: nums){
            System.out.println(i + "");

        }
    }

    private static void typeDemo(){


//        //Java is a strongly-typed language
//        //There are 8 Primitive Types
//
//        //Boolean (true or false)
//        boolean bool = true; // or = false
//
//        //Numerics
//        //Integral
//        byte b = 18;                //8 bit
//        short s = -13456;           //16 bit
//        int i = 345678765;          //32 bit
//        long l = 34567856767654L;   //64 bit
//
//
//
//        System.out.println(b);
//
//
//        //floating-point
//        float fl =100.0f;
//        double d = 45678785678765.567d;
//
//        //Character numeric value
//        char c = 'c';
//        //String has multiple characters so use double tick, char is a single character so use single tick
//
//        //Java is a strongly-typed language
//
//        int integer = 1768764356;
//
//
//        //local variable
//        int sample;
//        //variable declaration
//
//
//        //...3 hours later
//
//        sample = 456234;
//
//        System.out.println("Hello world! My number is " + sample + " not " + integer);
//

    }

    private static void charDemo() {
        char david = 'd';

        //System.out.println((int)david);
    }

    private static void demoVars(){
        int a, s, q, d = 7;





    }

    private static void demoStringManipulation(){
        String firstName = "Juan";
        String lastName = "Cruz";
        int favNum = 18;

        //Basic concatenation
        //System.out.println(firstName + " " + lastName);

        //String substitution
//        System.out.printf("%s %s loves the number %d",firstName, lastName, favNum);

        //String template (aka string interpolation)
//        String message = STR."/{ firstName } /{ lastName } likes te number /{ favNum }";
//        System.out.printf(message);
    }

    public static void demoParsingInts(){
        //Declaring string variable and assigning value "23" to the variable
        // when you assign in line with declaration it's called initialization
        String someKindaName = "23";

        //Multiply the numeric value of the string by 3 and post the product
        //Before we do  math on a numeric value to a string, we must Parse it
        int parsedNum = Integer.parseInt(someKindaName);
        System.out.println(parsedNum * 3);

    }

    public static void demoJavaMathOperations(){
        /*
        java has five math operations
        Additions +
        Subtraction -
        Multiplication * (asterisk)
        Division / (forward slash)
        Modulus % (returns the remainder after division)
         */

        // There are two basic FLAVORS of math in Java
        //Integer math (whole numbers only)
        //Floating-point math (fractional math)
        int i1 = 9;
        int i2 = 26;

        System.out.print("Adding to ints: ");
        int sum = i1 + i2;
        System.out.println(sum);

        System.out.print("\nSubtracting two ints: ");
        int difference = i1 - i2;
        System.out.println(difference);

        System.out.print("\nMultiplying two ints: ");
        int product = i1 * i2;
        System.out.println(product);

        System.out.print("\nDividing two ints: ");
        int quotient = i2 / i1;
        System.out.println(quotient);

        System.out.print("\nMod'ing two ints: ");
        int remainder = i2 % i1;
        System.out.println(remainder);

        System.out.print("\nBONUS : is the variable even?:");
        //In any equation of x % y the result will always be 0 through y-1
        int result = i1 % 2;
        boolean isEven = false;
        if(result == 0){
            isEven = true;
        }
        System.out.println(result);

        //Floating-ponit math
        float f1 = 2.5f;
        float f2 = 1.3f;

        System.out.print("\nDividing two floats: ");
        float fQuotient = f1 / f2;
        System.out.println(fQuotient);

        System.out.print("\nMod'ing two floats: ");
        float fMod = f1 % f2;
        System.out.println(fMod);

        //Let's get strange
        System.out.print("\nAdding a float and an int: ");
        var mixedSum = i1 + f1;
        System.out.println(mixedSum);

        System.out.print("\nDividing two ints to get a float: ");
        float intToFloatQuotient = i2 / (float)i1;
        System.out.println(intToFloatQuotient);

    }

    public static void demoRandom(){
        //In Java, there is a class called Math
        //Pretend we get the return 0.9970123
        //After the * 10, we get 9.970123
        //After the cast, we get 9
        //0.091123981723 -> 0
        //Pick a number between 1-10 inclusive
//       int ramNum = (int)(Math.random() * 10) + 1;
        //Pick a number between 5-25 inclusive
        //min = 5
        //max = 25
        //multiplier = 21
        //constant = 5
//        int ranNum = (int)(Math.random() * 21) + 5;
        //Pick between x and y
//       int ranNum = (int)(Math.random() * (max - min + 1)) + min;
    }


    /**
     *     * returns the number of days nominally contained within the month corresponding to the birthMonth value.
     *      * value 1 = January, value 12 = December
     * @param birthMonth the number of the month of which we wish to know the days
     * @return the number of days within the specified month, or 0 if the month is outside the range 1-12
     */
    public static int demoSwitches(int birthMonth) {
        int daysInMonth = 0;

        //Switch syntax
        //switch(valueTOBeAnalyzed) {

        //}

        //Return the number of days the birth month has (excluding leap year)
        switch (birthMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:

                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            case 4, 6, 9, 11:
                daysInMonth = 30;
                break;
            default:
                System.out.println("Bro, do you even month");




        }
        return daysInMonth;
    }

    //There are 4 loops in Java
    //For loop - lets focus here
    //For-each loop
    //While loop
    //Do-While loop
    public static void demoForLoop(int seconds) {
        //For loops
            //Best for running a sequence for a specific number of times
            //How many times minimum could the body of the for loop execute?: 0
            //How many times MAXIMUM could the body of a for loop execute?: x times
        //Count down (meaning print to the console) from ten to 0 inclusive, then go BOOM!

        // && (means and) || (means or)
        for (int i = 0; i < 10  ; i++){
            //Do something
        }

        /*
        Pre-condition runs only once in the loops lifetime

        If the loop condition is true...
            loop logic here 1
            loop logic here 2
            loop logic here 3
        i++
         */

        //For loop syntax
        //for(pre-condition; boolean loop condition; iteration step){
        // The logic that need to iterate
        //}
        //Print the current second
        //Then we want to decrement
        //through 0
        for (; seconds > -1; seconds--){
            System.out.println(seconds);
        }


        //Then explode
        System.out.println("BOOM!");

    }

    public static void demoWhileLoops (int num){
        //While loops
            //Best for running a sequence of steps for an indeterminate number of times
            //How many times minimum could the body of the while loop execute?: 0
            //How many times MAXIMUM could the body of a while loop execute?: Infinite

        //while loop syntax
        //while(loopCondition) {IFF loop condition is true do stuff}

        //Add an int param to this method called num
        //While the num is a positive value
        while(num > 1){
            //Print num to the console after multiplication
            System.out.println(num);
            //Multiply it by itself, storing the product back in the num variable
            num *= num;
        }
        //When the num is no longer a positive value, print num to the console
        //ASK PROF about ternary
        if (num < 0){
            System.out.println("num is now negative " + num);
        } else if (num == 1) {
            System.out.println("num is: " + num);
        }


    }

    public static void demoDoWhileLoop(){
        //doWhile loops
        //Best for running a sequence od steps
        //How many times minimum could the body of the while loop execute?: 1
        //How many times MAXIMUM could the body of a while loop execute?: Infinite

        //doWhile Loop syntax
            //IFF loopCondition is true, THEN do stuff
            //do { doStuff(); } while(loopCondition);
        Scanner scanLee = new Scanner(System.in);
        String input = null;
        boolean isInvalid = true;
        do {
            System.out.print("Enter ANYTHING other than NOTHING");
            input = scanLee.nextLine();

            //if the input is null or empty, inform the user it's invalid and to try again
            isInvalid = input == null || input.isEmpty();


            if (input == null || input.isEmpty() ){
                System.out.println("Bruh do you even input?!?!? Do again... like... for real...");
            }
        } while(isInvalid);
        System.out.println("You entered " + input + ". Thanks for not sucking");

    }




}
