public class Personal {

    //Class attributes

        //String to hold first name
    private static String first;
        //String to hold last name
    private static String last;
        //int to hold age
    private static int age;
        //Float to hold GPA
    private static float gradePointAverage;
        //String to hold the sentence
    private static String sentence;


    //getter
    public static String getFirst() {
        return first;
    }

    public static String getLast(){
        return last;
    }

    public static int getAge(){
        return age;
    }

    public static float getGradePointAverage(){
        return gradePointAverage;
    }

    public static String getSentence() {
        return sentence;
    }

    //Setter
    private static void setFirst(String fName){
        first = fName;
    }

    private static void setLast(String lName){
        last = lName;
    }

    private static void setAge(int years){
        age = years;
    }

    private static void setGradePointAverage(float GPA){
        gradePointAverage = GPA;
    }

    private static void setSentence(String phrase){
        sentence = phrase;
    }

    public static void run(){
        //set variables
        setFirst("Juan ");
        setLast("Cruz");
        setAge(19);
        setGradePointAverage(3.596f);
        String _sentence = "My name is " + getFirst() + getLast() + ", I'm " + getAge() + " and my GPA in high school was " + getGradePointAverage();
        setSentence(_sentence);

        System.out.println(getSentence());

    }

}
