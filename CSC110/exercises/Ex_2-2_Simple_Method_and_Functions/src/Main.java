public class Main {
    public static int total = 0;

    public static void main(String[] args) {
        run();
    }

    public static void run(){
        System.out.println("Running simple math method\n");
        createAdditionEquation(576, 2096);
        createSubtractionEquation(2,3);
        createMultiplicationEquation(2,3);
        createDivisionEquation(2,3);
        createDivisionEquation(2,3);
    }

    //Let's make these methods more dynamic
    //f(x) - the 'x' is the parameter for the function called f
    //Methods (sometimes called FUNCTIONS) are structured the same way
    public static String createAdditionEquation(int int1, int int2){
        int sum = int1 + int2;
        String formula = int1 + " + " + int2 + " = " + sum;
        return formula;
    }

    //Creat methods that
    //subtract 2 from 3
    public static String createSubtractionEquation(int int1, int int2){
        int difference = int1 + int2;
        String formula = int1 + " - " + int2 + " = " + difference;
        return formula;
    }

    //multiple 2 and 3
    public static String createMultiplicationEquation(int int1, int int2){
        int product = int1 + int2;
        String formula = int1 + " * " + int2 + " = " + product;
        return formula;
    }

    //divide 3 by 2
    public static String createDivisionEquation(int int1, int int2){
        int quotient = int1 + int2;
        String formula = int1 + " / " + int2 + " = " + quotient;
        return formula;
    }

    //mod 3 by 2
    public static String createModulusEquation(int int1, int int2){
        int remainder = int1 + int2;
        String formula = int1 + " % " + int2 + " = " + remainder;
        return formula;
    }

}