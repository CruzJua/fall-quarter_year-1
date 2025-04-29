public class Calculator {


    //Overloading methods
    //A method Overload is a method in a class that has the same name as another method in the class but,
    //A different parameter list
        //Meaning the data types of the parameters and the sequence in which they appear
        //Note: having a different quantity of parameter automatically makes the overload params different

    //Declare the addNum method so that two ints are passed through and the sum is return
    public int addNums(int num1, int num2){
        return num1 + num2;
    }

//    declare a method that tales in three ints and returns these
    public int addNums(int num1, int num2, int num3){
        return num1 +num2 +num3;
    }
    public int addNums(int[] nums){
        int total = 0;

        for (int num : nums){
            total += num;
        }

        return total;
    }

}

