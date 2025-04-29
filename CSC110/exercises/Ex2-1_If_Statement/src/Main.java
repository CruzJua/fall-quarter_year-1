public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        isNumEven();
    }

public static void isNumEven() {
    int num = 101;
    int mod = num % 2;
    boolean status = mod ==0;

    //If statement Syntax
    //If (Condition) { Consequences (aka body of the if)}
    //Pro tip, we check for equality with == not =

    // not operator is the "!" (aka the bang)
    if (status) {
        System.out.println("Num is even");
    } else {
        System.out.println("Num is odd");

    }

    System.out.println("Have a great day");
}

}